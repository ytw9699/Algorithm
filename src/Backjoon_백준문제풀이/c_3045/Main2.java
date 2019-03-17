package c_3045;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
	
	static DoublyLinkedList2 dobleLink = new DoublyLinkedList2();
	
	public static void main(String[] args) throws Exception {
			
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nodes = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());
	
	 String[] order= new String[count];
	
		for(int i =0; i<count; i++) {
			order[i]= br.readLine();
		}
			br.close();
		
		for(int i =0; i<nodes; i++) {
			dobleLink.addLast(i+1);
		}
		//System.out.println(dobleLink.toString());
		
		for(int i =0; i<count; i++) {
			String action[] = order[i].split(" ");
			change(action[0],action[1],action[2]);
		}
		//System.out.println(dobleLink.toString());
		
		int max=0;
		int maxindex=0;
		int[] dp = new int[nodes];// �ε������� �� ���� ������ ����//dp �迭�� ���� ������ ���̸� ���� ���̴�.
		int[] array = dobleLink.toIntArr(nodes);// �ε������� �� �Է°�
	/*	for (int i = 0; i < nodes; i++) {
					System.out.println(array[i]);
		}*/
		String[] sequence = new String[nodes];//���� ���� 
		int ans = 0;
		
		dp[0] = 1;
		sequence[0] = Integer.toString(array[0]);

		for (int i = 1; i < nodes; i++) {
		  dp[i] = 1;
		  String temp="";
		  // i �� �������� �ε��� 0 �������� i-1���� üũ�Ѵ� 
		    // ���̸� ����
		  for (int j = 0; j < i; j++) {
		    if ( array[i] > array[j] && dp[i] < dp[j] + 1 ) { // ���� ���� �̶��
		      dp[i] = dp[j] + 1;//���� 1����
		      if(dp[j] + 1 > max) {
		    	  max = dp[j] + 1 ;
		    	  maxindex = i;
		      }
		      
		      temp = temp+Integer.toString(array[j]);
		    }
		  }
		    sequence[i] = temp+array[i];
		  //System.out.println(sequence[i]);
		}
		for(int i=1;i<nodes;i++) {
		  if (ans < dp[i]) {
		    ans = dp[i];
		  }
		}
		/*for(int i=0;i<nodes;i++) {
			    System.out.print(dp[i]);
			}*/
		//System.out.println();
		System.out.println(nodes - ans);
		
		//System.out.println(Arrays.toString(array));
		
		Arrays.sort(array); 
		
		//System.out.println(Arrays.toString(array)); 
		 
		String[] output = sequence[maxindex].split("");
		
		int[] idx0 = new int[output.length];
		
		for(int i=0;i<output.length;i++) {
			idx0[i]=Arrays.binarySearch(array, Integer.parseInt(output[i]) );
		}
		for(int i=0;i<idx0.length;i++) {
			array[idx0[i]]=0;
		}
		//System.out.println(Arrays.toString(array));
		
		for(int i=0; i<nodes; i++) {
			if(array[i] > 0 && array[i]<nodes) {
				int a=array[i];
				int b=array[i]+1;
				System.out.println("A"+" "+a+" "+b);
		//change("A" ,  Integer.toString(idx0[i]) ,  Integer.toString(idx0[i]+1));	
				}
			else if( array[i] == nodes){
				int a=array[i];
				int b=array[i]-1;
				System.out.println("B"+" "+a+" "+b);	
			}
		}
		}
	private static void change(String selection, String X, String Y) {
		int x= Integer.parseInt(X);
   		int y= Integer.parseInt(Y);
   		
		if(selection.equals("A")) {
			dobleLink.toFront(x,y);//x��带 y����� ������ �̵�
		}else {
			dobleLink.toRear(x,y);//x��带 y����� �ڷ� �̵�
		}
	}
}

   class DoublyLinkedList2 {
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
    
  	public void toFront(int x, int y) {
   		Object currentNodeData = remove(x);
   		addFront(y, currentNodeData);//x��带 y����� ������ �̵�
   	}
    
    public void toRear(int x, int y) {
    	Object currentNodeData = remove(x);
    	addRear(y, currentNodeData);//x��带 y����� �ڷ� �̵�
   	}
    
    public void addFront(int k, Object input){// Ư�� ��ġ �� �߰�
        // ���� k�� 0�̶�� ù��° ��忡 �߰��ϴ� ���̱� ������ addFirst�� ����մϴ�.
        if(k == 1){
            addFirst(input);
        } else {
            Node temp1 = node(k).prev;
           
            Node temp2 = temp1.next;//k��° ��带 temp2�� ����
        
            Node newNode = new Node(input);//���ο� ��带 ����.
            
            temp1.next = newNode;// temp1�� ���� ���� ���ο� ��带 ����
            
            newNode.next = temp2;// ���ο� ����� ���� ���� temp2�� ����
            
            temp2.prev = newNode;//������带 temp2�� ��������
            
            newNode.prev = temp1;//���ο� ����� ���� ���� temp1
            
            size++;
        }
    }
    public void addRear(int k, Object input){// Ư�� ��ġ �� �߰�
        // ���� k�� 0�̶�� ù��° ��忡 �߰��ϴ� ���̱� ������ addFirst�� ����մϴ�.
        
            Node temp1 = node(k);
           
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
    Node node(int data) {
    	Node searchNode=head;
        while(!(searchNode.data.equals(data))) {
        	searchNode = searchNode.next;
        }
          return searchNode;
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
    public int[] toIntArr(int n) {
    	int [] arr= new int[n];
    	int i=0;
        Node temp = head;
        while(temp.next != null){
            arr[i++]=(int)temp.data;
        	temp = temp.next;
        }
        arr[i]=(int)temp.data;
        return arr;
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
    	Node todoDeleted;//������ ���
    	Object returnData = null;//���� ������
    	
        if(node(k).prev == null) {//�����ҷ��°��� ù��°���̶��
        	todoDeleted = head;
        	head.next.prev = null;
       	 	head = head.next;
        }else {
        	 
        Node temp = node(k).prev;//���� ��� �� ��带 temp�� ������ ����
        
         todoDeleted = temp.next;// ���� ��带 todoDeleted�� ���
        // ���� ��带 ���� �����ϸ� ���� �� ���� ���� �� ��带 ������ �� ����.  
        
        temp.next = temp.next.next;
        
        if(temp.next != null) {
        	temp.next.prev = temp;//��������� �Ŀ� ���� ����
        }
        // ������ �����͸� �����ϱ� ���ؼ� returnData�� �����͸� �����մϴ�.
         returnData = todoDeleted.data; 
        
        if(todoDeleted == tail){//�����ҷ��µ����Ͱ� ���������̶��
            tail = temp;
        }
        }
        todoDeleted = null; 
        size--;
        return returnData;
    }
	}