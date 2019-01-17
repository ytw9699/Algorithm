package Stack;
import java.util.EmptyStackException;
public class MyStack1 {
	
	int topIndex = -1;//현재 탑의 인덱스를 -1 초기화
	
    private Object[] StackArr = new Object[100];
    
	public Object push(Object data) {
		StackArr[++topIndex] = data;
		
		return data;
	}
	
	public Object pop() {
		Object data = peek();// Stack에 저장된 마지막 요소를 읽어온다.
		
		topIndex--;//탑 인덱스의 연산을 통해 삭제를 해주는것과 같은 결과를 낸다
			//어레이 리스트 기반으로 하면 삭제를 위해 앞뒤땡겨주는 연산까지하게됨
		return data;
	}
	
	public Object peek() {
		if (topIndex == -1) {//전체의 데이터 갯수가 없다면
			throw new EmptyStackException();
		}
		return StackArr[topIndex];//현재 탑의 값을 리턴	
		}
	
	public boolean empty() {
		return topIndex == -1;//-1이라면 데이터가 없음
	}
}