package Stack;

public class ArrayStackMain {
    public static void main(String[] args) {
    	
    	ArrayStack st = new ArrayStack();
    	
    	st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println("= MyStack1 peek=");
		
		System.out.println(st.peek());//마지막 값 리턴
		
		System.out.println("= MyStack1 pop=");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
    }
}