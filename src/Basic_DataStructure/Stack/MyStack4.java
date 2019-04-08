package Stack;
import java.util.EmptyStackException;
import LinkedList.LinkedList;
public class MyStack4 extends LinkedList{
	//직접 구현 링크드 리스트 기반
	
	public Object push(Object data) {
		addFirst(data);
		return data;
	}
	
	public Object pop() {
		Object data = removeFirst();
		//Stack에 저장된 첫번째 요소를 읽어오고 삭제한다
		
		return data;
	}
	
	public Object peek() {
		int	len = size();//전체 데이터 갯수
		
		if (len == 0) {//전체 데이터 갯수가 없다면
			throw new EmptyStackException();
		}
		return get(0);//헤드 엘리먼트 get
		}
	
	public boolean empty() {
		return size() == 0;
		}
}