package a_1158;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int n;//���� ���� ����Ʈ ũ�� n=7 N �� ��ü ��� ��
		int m;// M��° ������� ����
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
			
		
		circular_linked_list cyclelist = new circular_linked_list();//���� ����  ����Ʈ ����
		
		for (int i = 1; i <= n; i++) {
			cyclelist.addLast(i);//��� ����
		}
		cyclelist.startDelete(n,m);
	}
	
}

 class circular_linked_list {//���� ���� ����Ʈ
    private Node head;// ù��° ��带 ����Ű�� �ʵ�,����,������
    private Node tail;// ������ ��带 ����Ű�� �ʵ�,����
    private int size = 0; // ������Ʈ ����
    
    private class Node{
    	
        private Object data;//�����Ͱ� ����� ����-���� ���尪
       
        private Node next;//���� ��带 ����Ű�� ����,������
        
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

	public void startDelete(int m, int n) {//�����۽�
		int[] arr = new int[m];
		int i=0;
		Node currentNode = null;
		
		while(size > 0) {
			if(size == m ) {
				currentNode = head;
			}
				for(int j=1; j<n-1; j++) {
					currentNode = currentNode.next;
				}
				Node todoDeleted = currentNode.next;
				Object returnData = todoDeleted.data;
					
				if(todoDeleted == tail){//�����ҷ��µ����Ͱ� ���������̶��
		            tail = currentNode;
		            tail.next = head;
		         }
				else {
					currentNode.next = currentNode.next.next;
				}
				currentNode = currentNode.next;
				size--;
				arr[i++] = (int)returnData;
			}
		for(int k=0; k<m; k++) {
			System.out.print(arr[k]);
		}
	}
 }	
