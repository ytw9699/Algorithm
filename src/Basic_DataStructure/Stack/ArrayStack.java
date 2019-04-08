package Stack;
import java.util.EmptyStackException;
public class ArrayStack {
	
	int topIndex = -1;//현재 탑의 인덱스를 -1 초기화//데이터가 없는 상태
	
    private Object[] StackArr = new Object[100];//배열의 크기는 100으로 일단 제한
    
	public Object push(Object data) {
		StackArr[++topIndex] = data;
		
		return data;
	}
	
	public Object pop() {
		Object data = peek();// Stack에 저장된 마지막 요소를 읽어온다.
		
		topIndex--;//탑 인덱스의 연산을 통해 삭제를 해주는것과 같은 결과를 낸다
		return data;
	}
	
	public Object peek() {
		if (topIndex == -1) {//현재 데이터가 없다면
			throw new EmptyStackException();
		}
		return StackArr[topIndex];//현재 탑의 값을 리턴	
		}
	
	public boolean empty() {
		return topIndex == -1;//-1이라면 데이터가 없음
	}
}