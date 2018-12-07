package Ch_03_Stacks_and_Queues;

public class Main2 {
    public static void main(String[] args) {
    	
    	MyStack_LinkedList2<Integer> st = new MyStack_LinkedList2();
    	
    	st.push(3);
    	System.out.println(st.min());
		st.push(1);
		System.out.println(st.min());
		st.push(2);
		System.out.println(st.min());
		st.push(0);
		System.out.println(st.min());
		
		System.out.println("= MyStack2 peek=");
		
		System.out.println(st.peek());//마지막 값 리턴
		
		System.out.println("= MyStack2 pop=");
		
		
		while(!st.empty()) {
			System.out.println(st.pop());
			System.out.println(st.min());
		}
		
    }
}