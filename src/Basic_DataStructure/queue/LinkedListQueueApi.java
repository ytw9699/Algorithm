package queue;
import java.util.LinkedList;
public class LinkedListQueueApi {
    public static void main(String[] args) {
    	LinkedList<String> queue = new LinkedList();
    	//큐 인터페이스를 구현한 LinkedList
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