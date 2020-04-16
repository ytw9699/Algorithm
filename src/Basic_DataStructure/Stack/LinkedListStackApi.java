package Stack;
import java.util.LinkedList;
public class LinkedListStackApi {
    public static void main(String[] args) {//기존의 더블링크드 리스트 api를 이용한 stack
    	LinkedList<String> st = new LinkedList();
    	
    	st.addFirst("1");
		st.addFirst("2");
		st.addFirst("3");
		
		System.out.println("= LinkedList getFirst=");
		
		System.out.println(st.getFirst());
		
		System.out.println("= LinkedList removeFirst=");
		
		while(!(st.size()==0)) {
			System.out.println(st.removeFirst());
			//Stack에 저장된 첫번째 요소를 읽어오고 삭제한다
		}
		
    	st.push("1");
		st.push("2");
		st.push("3");
		
		System.out.println("= LinkedList peek=");
		
		System.out.println(st.peek());//마지막 값 리턴
		
		System.out.println("= LinkedList pop=");
		
		while(!(st.isEmpty())) {//size()==0
			System.out.println(st.pop());
		}
    }
}