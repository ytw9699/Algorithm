package ch_04_Queue_via_Stacks;

public class Main7 {//���� ��ũ�� ����Ʈ api ����2����� ť
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