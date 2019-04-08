package Stack;
import java.util.EmptyStackException;
public class LinkedListStack {
    private Node head;
    private int size = 0;
	
    public class Node{
        private Object data;
        private Node next;
        
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
    }
    public void push(Object input){
        
        Node newNode = new Node(input);
        
        newNode.next = head;
        
        head = newNode;
        size++;
    }
    
	public Object peek() {
		int	len = size();
		
		if (len == 0) {
			throw new EmptyStackException();
		}
		return head.data;
		}
	
	public Object pop(){
		   if(head != null) {
		       Node temp = head;
		       head = temp.next;
		       
		       Object returnData = temp.data;
		       
		       temp = null;
		       
		       size--;
		       
		       return returnData;
		   }else 
			   return (Object)"Stack에 값이 없습니다";
	   }
	
	public boolean empty() {
		return size() == 0;
		}
  
    public int size(){
        return size;
    }
    
  }    