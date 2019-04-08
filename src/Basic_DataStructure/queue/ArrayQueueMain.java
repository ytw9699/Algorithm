package queue;
public class ArrayQueueMain {
    public static void main(String[] args) {//배열 기반 큐
    	ArrayQueue queue = new ArrayQueue();
    	
    	System.out.println("=offer=");
    	
    	queue.offer("0");
    	queue.offer("1");
    	queue.offer("2");
		
		System.out.println("=peek=");
		
		System.out.println(queue.peek());
		
		System.out.println("=poll=");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
    }
}