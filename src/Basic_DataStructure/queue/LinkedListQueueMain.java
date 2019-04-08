package queue;
public class LinkedListQueueMain {
    public static void main(String[] args) {
    	LinkedListQueue queue = new LinkedListQueue();
    	
    	queue.offer("0");
    	queue.offer("1");
    	queue.offer("2");
		
		System.out.println("=peek=");
		
		System.out.println(queue.peek());//마지막 값 리턴
		
		System.out.println("=poll=");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
    	
    }
}