package Stack;

public class Main2 {
    public static void main(String[] args) {
    	
    	MyStack2 st = new MyStack2();
    	
    	st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println("= MyStack2 peek=");
		
		System.out.println(st.peek());//마지막 값 리턴
		
		System.out.println("= MyStack2 pop=");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
    }
}