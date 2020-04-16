package Stack;

import java.util.Stack;

public class StackApi {
    public static void main(String[] args) {
    	Stack<String> st = new Stack();//벡터를 구현한 스택
    	
    	st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println("= MyStack0 peek=");
		
		System.out.println(st.peek());//마지막 값 리턴
		
		System.out.println("= MyStack0 pop=");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
    }
}