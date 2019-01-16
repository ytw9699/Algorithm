package c_3045;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	//static long beforeTime = System.currentTimeMillis(); //�ڵ� ���� ���� �ð� �޾ƿ���
	static DoublyLinkedList dobleLink = new DoublyLinkedList();
	
	public static void main(String[] args) throws Exception {
			
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String firstinput =br.readLine();//7 2 
		String nodesCount[] = firstinput.split(" ");
		
		int nodes = Integer.parseInt(nodesCount[0]);//7 
		int count = Integer.parseInt(nodesCount[1]);//2
	
	  String[] order= new String[count];
	
		for(int i =0; i<count; i++) {//COUNT 2
			order[i]= br.readLine();//A 1 4 // B 3 5
		}
			br.close();
		
		for(int i =0; i<nodes; i++) {//1~7
			dobleLink.addLast(i+1);
		}
		
		DoublyLinkedList.ListIterator iterator = dobleLink.listIterator();
		
		for(int i =0; i<count; i++) {// ���� �ڹٲ�
			String action[] = order[i].split(" ");//A 1 4 // B 3 5
			
			int x= Integer.parseInt(action[1]);
	   		int y= Integer.parseInt(action[2]);
	   		
	   		if(action[0].equals("A")) {
	   			while(iterator.hasNext()) {
			    	int currentNextValue = (int)iterator.next();
		       	 if(currentNextValue == x){
		       		System.out.println(dobleLink);
		       		iterator.remove();
		       	 }
		       	 if(currentNextValue == y){
		       		iterator.addfront(x);//�տ����� �߰�
		           	System.out.println(dobleLink);
		     	 }
		        }
	   		}else {
	   			while(iterator.hasNext()) {
			    	int currentNextValue = (int)iterator.next();
		       	 if(currentNextValue == x){
		       		iterator.remove();
		       	    System.out.println(dobleLink);
		       	 }
		       	 if(currentNextValue==y){
		       		iterator.add(x);//�ڿ� �߰�
		           	System.out.println(dobleLink);
		     	 }
		        }
	   		}
			iterator.nextIndex();
		}
		
		int max=0;
		int maxindex=0;
		int[] dp = new int[nodes];// �ε������� �� ���� ������ ����//dp �迭�� ���� ������ ���̸� ���� ���̴�.
		int[] array = new int[nodes];// �ε������� �� �Է°�
		int ans = 0;
		int k=0;
		int iteratorIndex=0;
		
		ArrayList sequence = new ArrayList<>();//���� ���� �ε���
		
		
		while(iterator.hasNext()){
			array[iteratorIndex++]=(int)iterator.next();
     	 }
		
		dp[0] = 1;
			
			for (int i = 1; i < nodes; i++) {
			  k=0;
			  dp[i] = 1;
			  int[] temp = new int[i+1];
			  for (int j = 0; j < i; j++) {
			    if (array[j] < array[i] && dp[j] + 1 > dp[i]) {
			      dp[i] = dp[j] + 1;
			      temp[k++] = j;
			      if(dp[j] + 1 > max) {
			    	  max = dp[j] + 1 ;
			    	  maxindex = i;
			      }
			    }
			  }
			  temp[k++] = i;
			  sequence.add(temp);
			}
			  for(int i=1;i<nodes;i++) {
				  if (ans < dp[i]) {
				    ans = dp[i];
				  }
				}
				System.out.println(nodes - ans);//�����ؾ��� ����� ���
				if(maxindex > 0) {
					int[] changearr = (int[])sequence.get(maxindex-1);
					
					for(int i=0; i<changearr.length; i++) {
						array[changearr[i]]=0;
					}
				}
		
		for(int i=0; i<nodes-1; i++) {
			if(array[i] > 0 && array[i]<nodes) {
				int a=array[i];
				int b=array[i]+1;
				System.out.println("A"+" "+a+" "+b);
				}
			else if( array[i] == nodes){
				int a=array[i];
				int b=array[i]-1;
				System.out.println("B"+" "+a+" "+b);	
			}
		}
		/*long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
		long secDiffTime = (afterTime - beforeTime)/1000; //�� �ð��� �� ���
		System.out.println("�ð�����(m) : "+secDiffTime);
		*/
		}
}
	class DoublyLinkedList {
	
    private Node head;// ù��° ��带 ����Ű�� �ʵ�,����,������
    private Node tail;// ������ ��带 ����Ű�� �ʵ�,����
    private int size = 0; // ��� ������Ʈ
    
    public class Node{//��ũ�� ����Ʈ������ �ϳ��� ������Ʈ��(���)�ϳ��� ��ü��
    	//�װ�ü�� LinkedList�� innerclass�� ����
    	
        private Object data;//�����Ͱ� ����� ����-���� ���尪
       
        private Node next;//���� ��带 ����Ű�� ����,������
        private Node prev;//���� ���
        
        public Node(Object input) {//��ü���� �ʱ�ȭ
            this.data = input;
            this.next = null;//�����ô� ����
            this.prev = null;
        }
        public String toString(){//����� ���� ���� �������
            return String.valueOf(this.data);
        }
    }
    public void addFirst(Object input){//�Ӹ��� �߰�
       
        Node newNode = new Node(input);//��带 ����
        
        newNode.next = head;//���ο� ����� ���� ���� �ص� ����
        
        if(head != null){//ó������ ��带 �߰��ϴ°��� �ƴ϶��
           head.prev = newNode;//���ο� ��带 ����� �������� ����
         }
        
        head = newNode;//���� ���ο� ��带 ����
        size++;
        if(head.next == null){
            tail = head;
        }
    }
    public void addLast(Object input){//������ �߰�
        if(size == 0){//����Ʈ�� ��尡 �ϳ��� ���ٸ� ù��° ��带 �߰��ϴ� �޼ҵ带 ���.
            addFirst(input);
        } else {//���� ��尡 �ϳ��� �ִٸ� 
        	Node newNode = new Node(input);
        	
            tail.next = newNode;//������ ����� ���� ���� ������ ��带 ����.
           
            newNode.prev = tail;//������ ����� ���� ���� ������ tail�� ����
            
            tail = newNode; //������ ��带 ����.
           
            size++;//������Ʈ ���� 1 ����
        }
    }
    Node node(int index) {//�� �޼ҵ尡 ����⿬�Ḯ��Ʈ�� ������ ������ Ž���� ȿ����!
    	//�ε����� ��ġ�� ���� Ž�� ������ �޸� ��. ���п� Ž�� �ð��� �ι�� ���
    	//���������� ���������� node�� ��ȸ�ϱ� ���� ��
    	//���ϴ� �ε����� ��带 ��������� ������ �ܺο��� �����پ����� ���ϰ� public��������
	    if (index < size / 2) {//����� �ε����� ��ü ��� ���� �ݺ��� ū�� ������ ���
	        Node x = head;//head���� next�� �̿��ؼ� �ε����� �ش��ϴ� ��� Ž�� ���� 
	        for (int i = 0; i < index; i++) {
	            x = x.next;
	        }
	        return x;
	    } else {
	        Node x = tail;//tail���� ��� Ž�� ����
	        for (int i = size - 1; i > index; i--){
	            x = x.prev;
	        }
	        return x;
	    }
	}
    
    public void add(int k, Object input){// Ư�� ��ġ �� �߰�
        // ���� k�� 0�̶�� ù��° ��忡 �߰��ϴ� ���̱� ������ addFirst�� ����մϴ�.
        if(k == 0){
            addFirst(input);
        } else {
            Node temp1 = node(k-1);
           
            Node temp2 = temp1.next;//k��° ��带 temp2�� ����
        
            Node newNode = new Node(input);//���ο� ��带 ����.
            
            temp1.next = newNode;// temp1�� ���� ���� ���ο� ��带 ����
            
            newNode.next = temp2;// ���ο� ����� ���� ���� temp2�� ����
            
            if (temp2 != null) {//temp2�� ���������� ������
                temp2.prev = newNode;//������带 temp2�� ��������
            }
            newNode.prev = temp1;//���ο� ����� ���� ���� temp1
            
            size++;
            
            if(newNode.next == null){//������ ������ �߰��� �˻����
                tail = newNode;
         //Ȥ�ó� ���ο� ����� ���� ��尡 ���ٸ� ���ο� ��尡 ������ ����̱� ������ tail�� ����.
            }
        }
    }
    public String toString() {//����Ʈ�ȿ� ������ ���� ���
        if(size == 0){//����Ʈ�� �����Ͱ� ���ٸ�
            return "[]";
        }       
        Node temp = head;//�׻� ������ ��� ����
        String str = "[";
        while(temp.next != null){//head�� ���� ��尡 ���� ������ �ݺ����� ����
            str += temp.data + ",";
            temp = temp.next;
        }//������ ���� ���� ��尡 ���� ������ �Ʒ��� ������ ������ ���� ����.
        str += temp.data;// ������ ��带 ��°���� ����
        return str+"]";
    }
    
    public Object removeFirst(){//ù��° ��� ����
        Node temp = head;//ù��° ��带 temp�� ����
        head = temp.next;//head�� ���� �ι�° ���� ����.
        
        Object returnData = temp.data;//������ ���� ���� ������ ���� �ӽ� ������ ����.
        
        temp = null;//null�� �����ؼ� ������ �÷����� ��
        
        if(head != null) {
        	head.prev = null;//���ο� ��尡 ������ ������带 �������ִ°�
        }
        size--;
        
        return returnData;
    }
    
    public Object remove(int k){
        if(k == 0) {//�����ҷ��°��� ù��°���̶��
            return removeFirst();
        }
        Node temp = node(k-1);//���� ��� �� ��带 temp�� ������ ����
        
        Node todoDeleted = temp.next;// ���� ��带 todoDeleted�� ���
        // ���� ��带 ���� �����ϸ� ���� �� ���� ���� �� ��带 ������ �� ����.  
        
        temp.next = temp.next.next;
        
        if(temp.next != null) {
        	temp.next.prev = temp;//��������� �Ŀ� ���� ����
        }
        // ������ �����͸� �����ϱ� ���ؼ� returnData�� �����͸� �����մϴ�.
        Object returnData = todoDeleted.data; 
        
        if(todoDeleted == tail){//�����ҷ��µ����Ͱ� ���������̶��
            tail = temp;
        }
        todoDeleted = null; 
        size--;
        return returnData;
    }
    
    public Object removeLast(){//���ϰ��� ã�Ƽ� ������ ���� ����ð��ɸ�
    	Node todoDeleted = tail;
    	tail = tail.prev;
    	if(tail != null){
    	tail.next = null;
    	}
    	else {
    		head = null;
    	}
        Object returnData = todoDeleted.data; 
    	 
    	todoDeleted = null;
    	 
    	size--;
    	 
        return returnData;
    }
    public int size(){//����Ʈ�� ���� �������Ǽ�
        return size;
    }
    
    public Object get(int k){//Ư�� ������Ʈ �� ��ȸ
        Node temp = node(k);
        return temp.data;
    }
    
    public int indexOf(Object data){//Ư�������Ͱ� � ��ġ�� �ִ��� �˻�
        Node temp = head;//���� ù��° ��带 ������ ����
     
        int index = 0;// Ž�� ����� ���° ������Ʈ�� �ִ����� �ǹ��ϴ� ������ index�� ����մϴ�.
       
        while(temp.data != data){//Ž�� ���� Ž�� ����� ���� ��. 
            temp = temp.next;//���� ��带 ��� �˻�
            
            index++;
         
            if(temp == null)// temp�� ���� null�̶�� ���� �� �̻� Ž�� ����� ���ٴ� ��
                return -1;
        }
        return index;// Ž�� ����� ã�Ҵٸ� ����� �ε��� ���� ����
    }
    
    public ListIterator listIterator() {
        return new ListIterator(); // �ݺ��ڸ� �����ؼ� ����
    }
     
    public class ListIterator{//�̳� Ŭ����
        private Node lastReturned;//��ȯ�ϴ� ���
        private Node next;//head�� �ʱ�ȭ
        private int nextIndex;//��� next �޼ҵ尡 ȣ������
         
        ListIterator(){
            next = head;//next���� �ʱ�ȭ
            nextIndex = 0;
        }
         
        public void nextIndex() {
        	next = head;
        	nextIndex=0;
		}

		public boolean hasNext() {//���� ��尡 �ִ°�
            return nextIndex < size();
        }
        
        public Object next() {
            lastReturned = next;
            next = next.next; //next�� �������� ���� next.next�� ����. 
            nextIndex++;
            return lastReturned.data;
        }
        
        public boolean hasPrevious() {
        	return nextIndex > 0 ; //0 ����ũ�� �������ٰ��ִ°�
        }
        
        public Object previous() {
        	if(next == null) {//���������� next()�޼ҵ带 ���� Ž���� �������
        		lastReturned = next = tail;
        	}else {//���������� Ž����������
        		lastReturned = next = next.prev;
        	}
        	nextIndex--;
        	return  lastReturned.data;
        }
         
        public void add(Object input){//���ͷ����� �ݺ� ������ ��带 �߰��ϴ� ���
        	//�� ������ ������ ������ ������ ���� ��ü���� �帧,��� ����Ʈ�� ���� �ٸ��� ������ ����
            Node newNode = new Node(input);
            
            if(lastReturned == null){//ó����ġ �߰�//�ѹ��� next�޼ҵ� ���� ���ѻ���
                newNode.next = next;//���� ��带 �߰��� ����� �׽�Ʈ�� ����
                next.prev = newNode;//�߰��� ��带 ���� ����� ���� ���� ����
                head= newNode;//�߰���带 ���� ����
            } else {//lastReturned�� �����Ǿ��ٸ� �߰� �Ǵ� ���� �߰��ϴ°��
                lastReturned.next = newNode;
                newNode.prev = lastReturned;
                if(next != null) {//���������� Ž���� ���ߴٸ�
	                newNode.next = next;
	                next.prev = newNode;
                }else {//���������� Ž���� �ߴٸ�
                	tail = newNode;
                }
            }
            lastReturned = newNode;
            nextIndex++;
            size++;
        }
        public void addfront(Object input){//���ͷ����� �ݺ� ������ ��带 �߰��ϴ� ���
        	//�� ������ ������ ������ ������ ���� ��ü���� �帧,��� ����Ʈ�� ���� �ٸ��� ������ ����
            Node newNode = new Node(input);
            	
            if(lastReturned == null || lastReturned == head) {
            	head.prev= newNode;
            	newNode.next=head;
            
            }else {
            	lastReturned.prev.next = newNode;
            	newNode.prev = lastReturned.prev;
            	newNode.next = lastReturned;
            	lastReturned.prev=newNode;
            }
            lastReturned = newNode;
            nextIndex++;
            size++;
        }
         
        public void remove() {//�ܹ��� ���Ḯ��Ʈ�� ������ ������ node�޼ҵ带 ���� Ž���ʿ������ �ֳĸ� prev�� �ٷ� ã�ư��ϱ�
    		//if (lastReturned == null){
    	    if (nextIndex == 0) {//�׽�Ʈ �޼ҵ� �ѹ��� ȣ����ѻ���//�����Ұ��� ����
    	        throw new IllegalStateException();
    	    }
    	    Node n = lastReturned.next;
    	    Node p = lastReturned.prev;
    	
    	    if (p == null) {//next�޼ҵ� �ѹ������� �Ǿտ����� �����Ұ��
    	        head = n;
    	        head.prev = null;//�������
    	        System.out.println("lastReturned");
    	        System.out.println(lastReturned.data);
    	        lastReturned = null;
    	    } else {//�߰��� ���� �������
    	        p.next = next;
    	        lastReturned.prev = null;//�������
    	    }
    	    if (n == null) {//�ǳ������� �����Ұ�� null�̵�
    	        tail = p;
    	        tail.next = null;
    	    } else {//ó���� �߰��� �������
    	        n.prev = p;
    	    }
    	    if (next == null) {//�ǳ������� �����Ұ�� null�̵�
    	        lastReturned = tail;
    	    } else {//ó���� �߰��� �������
    	        lastReturned = next.prev;
    	    }
    	    size--;
    	    nextIndex--;
    	}
    	}
}
