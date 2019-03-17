package Stack;

public class Main4 {
    public static void main(String[] args) {
    	
    	MyStack4 st = new MyStack4();
    	
    	st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println("= MyStack4 peek=");
		
		System.out.println(st.peek());//마지막 값 리턴
		
		System.out.println("= MyStack4 pop=");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
    }
}