package Stack;
public class LinkedListStackMain {
    public static void main(String[] args) {
    	
    	LinkedListStack st = new LinkedListStack();
    	
    	st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println("= LinkedListStack peek=");
		
		System.out.println(st.peek());//������ �� ����
		
		System.out.println("= LinkedListStack pop=");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
    }
}