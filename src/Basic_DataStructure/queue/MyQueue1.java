package queue;
import java.util.EmptyStackException;

import DoublyLinkedList.DoublyLinkedList;
public class MyQueue1 extends DoublyLinkedList{//직접구현 더블 링크드 리스트 기반 큐
	public Object offer(Object data) {
		addFirst(data);
		return data;
	}
	
	public Object poll() {
		
		Object data = removeLast();
		//큐에 저장된 마지막번째 요소를 읽어오고 삭제한다
		return data;
	}
	
	public Object peek() {
		int	len = size();//전체 데이터 갯수
		
		if (len == 0) {//전체 데이터 갯수가 없다면
			throw new EmptyStackException();
		}
		return get(size());//tail 엘리먼트 가져오기	
		}
	
	public boolean isEmpty() {
		return size() == 0;//갯수가 0개라면 투르
		}
}