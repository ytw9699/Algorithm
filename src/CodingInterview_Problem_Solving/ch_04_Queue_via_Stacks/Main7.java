package ch_04_Queue_via_Stacks;

public class Main7 {//더블 링크드 리스트 api 스택2개기반 큐
    public static void main(String[] args) {
    	
    	MyStack7 queue = new MyStack7();
		
    	queue.offer("1");
    	queue.offer("2");
    	queue.offer("3");
    	
    	if(!(queue.isEmpty())) {
		System.out.println("= queue peek=");
		
		System.out.println(queue.peek());
		}
		
    	System.out.println("= queue poll=");
		while(!(queue.isEmpty())) {
			System.out.println(queue.poll());
		}
    	queue.offer("3");
    	queue.offer("2");
    	queue.offer("1");
    	
    	System.out.println("= queue poll=");
		
		while(!(queue.isEmpty())) {
			System.out.println(queue.poll());
		}
    }
}