package CircularLinkedList;
public class CircularLinkedList {
   private Node tail;// ������ ��带 ����Ű�� �ʵ�,����
   private Node cur;// ������ ��带 ����Ű�� ����
   private Node before;
   private Node temp;
   private int size = 0; //������Ʈ ����
   
   private class Node{
   	
       private Object data;//�����Ͱ� ����� ����-���� ���尪
      
       private Node next;//���� ��带 ����Ű�� ����,������
       
       public Node(Object input) {//��ü���� �ʱ�ȭ
           this.data = input;
           this.next = null;//�����ô� ����
       }
       public String toString(){//����� ���� ���� �������
           return String.valueOf(this.data);
       }
   }
   public void addFirst(Object input){//�Ӹ��� �߰�
      
      Node newNode = new Node(input);//��带 ����
       
      if(tail == null) 
      {
  		tail = newNode;
  		newNode.next = newNode;
      }
      else
      {
  		newNode.next = tail.next;
  		tail.next = newNode;
      }
       size++;
   }
   public void addLast(Object input){//������ �߰�
       if(size == 0){//����Ʈ�� ��尡 �ϳ��� ���ٸ� ù��° ��带 �߰��ϴ� �޼ҵ带 ���.
           addFirst(input);
       } 
       else //���� ��尡 �ϳ��� �ִٸ� 
       {
       		Node newNode = new Node(input);
       	
		    if(tail == null) 
		    {
				tail = newNode;
				newNode.next = newNode;
		    }
		    else
		    {
				newNode.next = tail.next;
				tail.next = newNode;
				tail = newNode;
		    }
          
           size++;//������Ʈ ���� 1 ����
       }
   }
   public Object getFirst(){//ù���� ������Ʈ �� ��ȸ
	   if(tail == null)    // ����� ��尡 ���ٸ�
			return 1;

		before = tail;
		cur = tail.next;
       return cur.data;
   }
   public Object getNext(){//���� ������Ʈ �� ��ȸ
	   if(tail == null)    // ����� ��尡 ���ٸ�
			return 1;

		before = cur;
		cur = cur.next;
       return cur.data;
   }
  
   public String toString() {//����Ʈ�ȿ� ������ ���� ���
       if(tail == null){//����Ʈ�� �����Ͱ� ���ٸ�
           return "[]";
       }       
       Node temp = tail.next;
       String str = "[";
       while(temp.next != tail.next){
           str += temp.data + ",";
           temp = temp.next;
       }
       str += temp.data;//������ ��带 ��°���� ����
       return str+"]";
   }
   
   public Object remove(){
	   temp = cur;
	   Object returnData = temp.data;
	   if(temp == tail) {// ���� ����� tail�� ����Ų�ٸ�
		   if(tail == tail.next) // �׸��� ������ ���� �����
			   tail = null;
		   else 
			   tail = before;
	   }
	   before.next = cur.next;
	   cur = before;
	   size--;
       return returnData;
   }
   
   public int size(){//����Ʈ�� ���� �������Ǽ�
       return size;
   }
  }
	
