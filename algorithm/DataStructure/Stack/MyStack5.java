package Stack;
import list.doublylinkedlist.implementation.DoublyLinkedList;
import java.util.EmptyStackException;

public class MyStack5 extends DoublyLinkedList{//직접구현 더블 링크드 리스트 기반 스택
	
	public Object push(Object data) {
		addFirst(data);
		return data;
	}
	
	public Object pop() {
		
		Object data = removeFirst();//Stack에 저장된 첫번째 요소를 읽어오고 삭제한다
		
		return data;
	}
	
	public Object peek() {
		int	len = size();//전체 데이터 갯수
		
		if (len == 0) {//전체 데이터 갯수가 없다면
			throw new EmptyStackException();
			//EmptyStackException을 발생
		}
		return get(0);//헤드 엘리먼트 가져오기	
		}
	
	public boolean isEmpty() {
		return size() == 0;//갯수가 0개라면 투르
		}
}