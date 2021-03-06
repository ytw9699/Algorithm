package queue;

public class LinkedListQueue {
    private Node head;//출구
    private Node tail;//입구
    private int size = 0;
	
    public class Node{
        private Object data;
        private Node next;
        
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
    }
    public boolean offer(Object input){
        
        Node newNode = new Node(input);
        
        if(isEmpty()){
        	head=newNode;
        	tail=newNode;
        }else {
        	 tail.next = newNode;//이부분이 계속 연결을 시켜준다.
             tail = newNode;
        }
        size++;
        return true;
    }
    
	public Object peek() {
		if(isEmpty()){
			return null;
		}else
			return head.data;
		}
	
	public Object poll(){
		if(!isEmpty()){
			   Node temp = head;
		       head = temp.next;
		       
		       Object returnData = temp.data;
		       
		       temp = null;
		       
		       size--;
		       
		       return returnData;
		}else{
			return null;
		}
	   }
	
	public boolean isEmpty() {
		return size() == 0;
		}
	
    public int size(){
        return size;
    }
  }    