package Stack;

public class Main3 {
    public static void main(String[] args) {
    	
    	MyStack3 st = new MyStack3();
    	
    	st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println("= MyStack3 peek=");
		
		System.out.println(st.peek());//마지막 값 리턴
		
		System.out.println("= MyStack3 pop=");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
    }
}