package a_1158;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	     int n;//���� ���� ����Ʈ ũ��  N �� ��ü ��� ��
	     int m;//M��° ������� ����
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		circular_linked_list cyclelist = new circular_linked_list();//���� ����  ����Ʈ ����
		
		for (int i = 1; i <= n; i++) {
			cyclelist.addLast(i);//��� ����
		}
		cyclelist.startDelete(n,m);//���� ����
	}
}

 class circular_linked_list {//���� ���� ����Ʈ
     Node head;// ù��° ��带 ����Ű�� �ʵ�,����,������
     Node tail;// ������ ��带 ����Ű�� �ʵ�,����
     int size = 0; // ������Ʈ ����
    
     class Node{
    	
         Object data;//�����Ͱ� ����� ����-���� ���尪
       
         Node next;//���� ��带 ����Ű�� ����,������
        
        public Node(Object input) {//��ü���� �ʱ�ȭ
            this.data = input;
            this.next = null;//�����ô� ����
        }
    }
    public void addFirst(Object input){//�Ӹ��� �߰�
       
        Node newNode = new Node(input);//��带 ����
        
        newNode.next = head;//���ο� ����� ���� ���� �ص� ����
        
        head = newNode;//���� ���ο� ��带 ����
        size++;
        if(head.next == null){
            tail = head;
            head.next = tail;
            tail.next = head;
        }
        else {
        	tail.next = head;
        }
    }
    
    public void addLast(Object input){//������ �߰�
        if(size == 0){//����Ʈ�� ��尡 �ϳ��� ���ٸ� ù��° ��带 �߰��ϴ� �޼ҵ带 ���.
            addFirst(input);
        } else {//���� ��尡 �ϳ��� �ִٸ� 
        	Node newNode = new Node(input);
        	
            tail.next = newNode;//������ ����� ���� ���� ������ ��带 ����.
           
            tail = newNode; //������ ��带 ����.
            
            tail.next = head;
           
            size++;//������Ʈ ���� 1 ����
        }
    }
    
    public int size(){//����Ʈ�� ���� �������Ǽ�
        return size;
    }

	public void startDelete(int n, int m) {//�����۽� ���� ����
		
		StringBuilder sb;
		sb = new StringBuilder();
        sb.append("<");
        
		int[] arr = new int[n];
		int i=0;
		Node currentNode = null;
		
		while(size > 0) {
			if(size() == n) {
				currentNode = head;
			}
			if(m == 1) {
				for(int b=1; b < size(); b++) {
				currentNode = currentNode.next;
				}
			}
			else if(m > 2){
				for(int j=1; j<m-1; j++) {
					currentNode = currentNode.next;
				}
			}
				Node todoDeleted = currentNode.next;
				Object returnData = todoDeleted.data;
				if(todoDeleted == tail){//�����ҷ��µ����Ͱ� ���������̶��
		            tail = currentNode;
		            tail.next = head;
		         }
				else {
					currentNode.next = currentNode.next.next;
					if(todoDeleted == head) {//�����ҷ��� �����Ͱ� �����
						head = currentNode.next;
					}
				}
				currentNode = currentNode.next;
				size--;
				arr[i++] = (int)returnData;
				
			}
		for(int k=0; k<n; k++) {
			sb.append(arr[k]+", ");
			//System.out.println(k+"="+arr[k]);
		}
		System.out.println(sb.toString().substring(0,sb.length()-2)+">");
	}
 }	
