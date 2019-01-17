package queue;

public class Main1 {
    public static void main(String[] args) {
    	MyQueue1 queue = new MyQueue1();
    	
    	queue.offer("0");
    	queue.offer("1");
    	queue.offer("2");
		
		System.out.println("= java queue api peek=");
		
		System.out.println(queue.peek());//마지막 값 리턴
		
		System.out.println("= java queue api poll=");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
    	
    }
}