package Stack;

public class Main5 {
    public static void main(String[] args) {//�������� ����ũ�� ����Ʈ�� Ȱ���� stack
    	
    	MyStack5 st = new MyStack5();
		
    	st.push("1");
		st.push("2");
		st.push("3");
		
		System.out.println("= MyStack5 peek=");
		
		System.out.println(st.peek());//������ �� ����
		
		System.out.println("= MyStack5 pop=");
		
		while(!(st.isEmpty())) {//size()==0
			System.out.println(st.pop());
		}
    }
}