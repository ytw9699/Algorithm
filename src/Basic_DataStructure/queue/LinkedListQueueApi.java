package queue;
import java.util.LinkedList;
public class LinkedListQueueApi {
    public static void main(String[] args) {
    	LinkedList<String> queue = new LinkedList();
    	//ť �������̽��� ������ LinkedList
    	queue.offer("0");
    	queue.offer("1");
    	queue.offer("2");
		
		System.out.println("= java queue api peek=");
		
		System.out.println(queue.peek());//������ �� ����
		
		System.out.println("= java queue api poll=");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
    }
}