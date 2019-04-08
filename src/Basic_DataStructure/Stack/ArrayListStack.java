package Stack;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack extends ArrayList{//어레이 리스트 기반
	public Object push(Object data) {
		add(data);
		return data;
	}
	
	public Object pop() {
		Object data = peek();// Stack에 저장된 마지막 요소를 읽어온다.
		
		remove(size() - 1);//마지막 요소를 삭제한다
		
		return data;
	}
	
	public Object peek() {
		int	len = size();//전체 데이터 갯수
		
		if (len == 0) {//전체 데이터 갯수가 없다면
			throw new EmptyStackException();
			//EmptyStackException을 발생
		}
		return get(len - 1);//마지막 리스트 엘리먼트 리턴	
		}
	
	public boolean empty() {
		return size() == 0;//갯수가 0개라면 투르
		}
}