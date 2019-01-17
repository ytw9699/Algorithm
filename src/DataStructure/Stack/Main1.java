package Stack;

import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
    	
    	MyStack1 st = new MyStack1();
    	
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