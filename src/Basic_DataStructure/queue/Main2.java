package queue;

public class Main2 {
    public static void main(String[] args) {//배열 기반 큐
    	MyQueue2 queue = new MyQueue2();
    	
    	System.out.println("=Enqueue=");
    	
    	System.out.println(queue.Enqueue("0"));
    	System.out.println(queue.Enqueue("1"));
    	System.out.println(queue.Enqueue("2"));
		
		System.out.println("=peek=");
		
		System.out.println(queue.peek());
		
		System.out.println("=Dequeue=");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.Dequeue());
		}
		
		System.out.println("=Enqueue=");
		System.out.println(queue.Enqueue("0"));
    	System.out.println(queue.Enqueue("1"));
    	System.out.println(queue.Enqueue("2"));
    	
    	System.out.println("=Dequeue=");
    	while(!queue.isEmpty()) {
			System.out.println(queue.Dequeue());
		}
    	System.out.println("=peek=");
		System.out.println(queue.peek());
    }
}