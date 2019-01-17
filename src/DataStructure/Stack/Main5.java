package Stack;

public class Main5 {
    public static void main(String[] args) {//직접구현 더블링크드 리스트를 활용한 stack
    	
    	MyStack5 st = new MyStack5();
		
    	st.push("1");
		st.push("2");
		st.push("3");
		
		System.out.println("= MyStack5 peek=");
		
		System.out.println(st.peek());//마지막 값 리턴
		
		System.out.println("= MyStack5 pop=");
		
		while(!(st.isEmpty())) {//size()==0
			System.out.println(st.pop());
		}
    }
}