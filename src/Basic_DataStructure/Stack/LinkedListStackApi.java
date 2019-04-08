package Stack;
import java.util.LinkedList;
public class LinkedListStackApi {
    public static void main(String[] args) {//������ ����ũ�� ����Ʈ api�� �̿��� stack
    	LinkedList<String> st = new LinkedList();
    	
    	st.addFirst("1");
		st.addFirst("2");
		st.addFirst("3");
		
		System.out.println("= LinkedList getFirst=");
		
		System.out.println(st.getFirst());
		
		System.out.println("= LinkedList removeFirst=");
		
		while(!(st.size()==0)) {
			System.out.println(st.removeFirst());
			//Stack�� ����� ù��° ��Ҹ� �о���� �����Ѵ�
		}
		
    	st.push("1");
		st.push("2");
		st.push("3");
		
		System.out.println("= LinkedList peek=");
		
		System.out.println(st.peek());//������ �� ����
		
		System.out.println("= LinkedList pop=");
		
		while(!(st.isEmpty())) {//size()==0
			System.out.println(st.pop());
		}
    }
}