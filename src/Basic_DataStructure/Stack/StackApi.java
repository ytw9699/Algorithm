package Stack;

import java.util.Stack;

public class StackApi {
    public static void main(String[] args) {
    	Stack<String> st = new Stack();//���͸� ������ ����
    	
    	st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println("= MyStack0 peek=");
		
		System.out.println(st.peek());//������ �� ����
		
		System.out.println("= MyStack0 pop=");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
    }
}