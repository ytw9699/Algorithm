package c_3045;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	static DoublyLinkedList dobleLink = new DoublyLinkedList();
	
	public static void main(String[] args) throws Exception {
			
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String firstinput =br.readLine();
		String nodesCount[] = firstinput.split(" ");
		
		int nodes = Integer.parseInt(nodesCount[0]);
		int count = Integer.parseInt(nodesCount[1]);
	
	 String[] order= new String[count];
	
		for(int i =0; i<count; i++) {
			order[i]= br.readLine();
		}
			br.close();
		
		for(int i =0; i<nodes; i++) {
			dobleLink.addLast(i+1);
		}
		
		for(int i =0; i<count; i++) {
			String action[] = order[i].split(" ");
			change(action[0],action[1],action[2]);
		}
		
		int max=0;
		int maxindex=0;
		int[] dp = new int[nodes];// �ε������� �� ���� ������ ����//dp �迭�� ���� ������ ���̸� ���� ���̴�.
		int[] array = dobleLink.toIntArr(nodes);// �ε������� �� �Է°�
		int ans = 0;
		int k=0;
		ArrayList sequence = new ArrayList<>();//���� ���� �ε���
		
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
            if(temp1 == null){
            	addFirst(input);
            }
            else {
            Node temp2 = temp1.next;//k��° ��带 temp2�� ����
        
            Node newNode = new Node(input);//���ο� ��带 ����.
            
            temp1.next = newNode;// temp1�� ���� ���� ���ο� ��带 ����
            
            newNode.next = temp2;// ���ο� ����� ���� ���� temp2�� ����
            
            temp2.prev = newNode;//������带 temp2�� ��������
            
            newNode.prev = temp1;//���ο� ����� ���� ���� temp1
            
            size++;
            }
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
        arr[i++]=(int)temp.data;
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
        	returnData = todoDeleted.data;
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