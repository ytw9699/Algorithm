package Ch_02_Linked_Lists;
 public class LinkedList {
    private Node head;// ù��° ��带 ����Ű�� �ʵ�,����,������
    private Node tail;// ������ ��带 ����Ű�� �ʵ�,����
    private int size = 0; // ��� ������Ʈ
    
    private class Node{//��ũ�� ����Ʈ������ �ϳ��� ������Ʈ��(���)�ϳ��� ��ü��
    	//�װ�ü�� LinkedList�� innerclass�� ����
    	
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
        
        newNode.next = head;//���ο� ����� ���� ���� �ص� ����
        
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
           
            tail = newNode; //������ ��带 ����.
           
            size++;//������Ʈ ���� 1 ����
        }
    }
    Node node(int index) {//���������� ���������� node�� ��ȸ�ϱ� ���� ��
    	//���ϴ� �ε����� ��带 ��������� ������ �ܺο��� �����پ����� ���ϰ� public��������
        Node x = head;//����� ��ȸ�ϱ� ���ؼ� �׻� head���� �����Ѵ�
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }
    boolean appendToTail(int index) {
    	tail.next = node(index);
    	return tail.next != null; 
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
            
            size++;
            
            if(newNode.next == null){//������ ������ �߰��� �˻����
                tail = newNode;
         //Ȥ�ó� ���ο� ����� ���� ��尡 ���ٸ� ���ο� ��尡 ������ ����̱� ������ tail�� ����.
            }
        }
    }
    public String toString() {//����Ʈ�ȿ� ������ ���� ���
        if(head == null){//����Ʈ�� �����Ͱ� ���ٸ�
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
        
        temp = null;
        
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
        
        // ������ �����͸� �����ϱ� ���ؼ� returnData�� �����͸� �����մϴ�.
        Object returnData = todoDeleted.data; 
        
        if(todoDeleted == tail){//�����ҷ��µ����Ͱ� ���������̶��
            tail = temp;
        }
        todoDeleted = null; 
        size--;
        return returnData;
    }
    
    public Object removeLast(){
        return remove(size-1);
        //tail���� �����ؼ��� �ȵ�
        //�̷��� ó������ ��� ���� ã�ư��� �����ϰ� ������ ������Ѵ� 
        //�ֳĸ� �����ϱ� �� ����� ��ũ ������ ��������ϴϱ�..
        //�̰Ŵ� ��̸���Ʈ�� ������� �ݴ��ΰŴ�//�߰������� ��带 ���ã�ư�����..
        //�׷��� ����� ���Ḯ��Ʈ�� ���°�
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
         
        public Object next() {
            lastReturned = next;
            next = next.next; //next�� �������� ���� next.next�� ����. 
            nextIndex++;
            return lastReturned.data;
        }
         
        public boolean hasNext() {//���� ��尡 �ִ°�
            return nextIndex < size();
        }
         
        public void add(Object input){//���ͷ����� �ݺ� ������ ��带 �߰��ϴ� ���
        	//�� ������ ������ ������ ������ ���� ��ü���� �帧,��� ����Ʈ�� ���� �ٸ��� ������ ����
            Node newNode = new Node(input);
            
            if(lastReturned == null){//ó����ġ �߰�//�ѹ��� next�޼ҵ� ���� ���ѻ���
            	head= newNode;//�߰���带 ���� ����
            	newNode.next = next;//���� ��带 �߰��� ����� �׽�Ʈ�� ����
            } else {//lastReturned�� �����Ǿ��ٸ� �߰� �Ǵ� ���� �߰��ϴ°��
                lastReturned.next = newNode;
                if(next != null) {//���������� Ž���� ���ߴٸ�
                newNode.next = next;
                }else {//���������� Ž���� �ߴٸ�
                	tail = newNode;
                }
            }
            lastReturned = newNode;
            nextIndex++;
            size++;
        }
         
        public void remove(){
            if(nextIndex == 0){ //�׽�Ʈ �޼ҵ� �ѹ��� ȣ����ѻ���//�����Ұ��� ����
                throw new IllegalStateException();
            }
            LinkedList.this.remove(nextIndex-1);//LinkedList Ŭ������ remove��
            //�׷��� �� remove�� �̿��ϸ� node �޼ҵ带 ���� �� �ݺ������� ��ȸ�� �ؼ� ã�ư��� ��ȿ����
            nextIndex--;//�ܹ��� ���Ḯ��Ʈ������ prev����� �̷��� ��ȿ������ �� �ۿ� ���°�
        }
	}
	public Object FindBeginning() {
		Node slow = head;
		Node fast = head; 
		while (fast != null && fast.next != null) {//��ȯ�� ���� �˻�
			slow = slow.next; 
			fast = fast.next.next;
			if (slow == fast) {//��ȯ�� ���� �˻�
				break;//��ȯ���̴�
			}
		}
		if (fast == null || fast.next == null) {//��ȯ�� ���� �˻�
			return null;
		}
		
		slow = head; //SLOW�� ����Ʈ�� ������������ ����,FAST�� �״�� �ΰ�
		while (slow != fast) { //��ȯ�� ���� �κ��� ã�� ����
			slow = slow.next; //�ӵ��� ���� �����ϰ� ���
			fast = fast.next; 
		}
		return fast.data;//��ȯ�� ���� �κ� ��� ��ȯ
	}
}
 
	
	
	
	
