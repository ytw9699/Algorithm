package Deque;
import java.util.LinkedList;
import java.util.Deque;
public class LinkedListDequeApi {
    public static void main(String[] args) {
    	Deque<String> Deque = new LinkedList();
    	//Deque 인터페이스를 구현한 LinkedList
    	System.out.println("= java Deque api offer=");
    	
    	Deque.offerLast("3");
    	Deque.offerLast("4");
    	Deque.offerFirst("2");
    	Deque.offerFirst("1");
		
    	 System.out.println("= java Deque api peekFirst=");
         System.out.println(Deque.peekFirst());

         System.out.println("= java Deque api peekLast=");
         System.out.println(Deque.peekLast());
		
		System.out.println("= java Deque api poll=");
		
		while(!Deque.isEmpty()) {
			System.out.println(Deque.pollFirst());
			//System.out.println(Deque.pollLast());
		}
    }
}