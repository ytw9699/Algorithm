package Ch_03_Stacks_and_Queues;

public class Main3 {
    public static void main(String[] args) {
    	
    	MyStack_LinkedList3<Integer> st = new MyStack_LinkedList3();
    	
    	st.mypush(3);
    	System.out.println(st.mymin());
		st.mypush(1);
		System.out.println(st.mymin());
		st.mypush(2);
		System.out.println(st.mymin());
		st.mypush(0);
		System.out.println(st.mymin());
		
		System.out.println("= MyStack_LinkedList3 mypeek=");
		
		System.out.println(st.mypeek());//마지막 값 리턴
		
		System.out.println("= MyStack_LinkedList3 mypop=");
		
		while(!st.myempty()) {
			System.out.println(st.mypop());
			System.out.println(st.mymin());
		}
		
    }
}