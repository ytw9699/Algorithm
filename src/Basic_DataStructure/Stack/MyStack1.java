package Stack;
import java.util.EmptyStackException;
public class MyStack1 {
	
	int topIndex = -1;//���� ž�� �ε����� -1 �ʱ�ȭ
	
    private Object[] StackArr = new Object[100];
    
	public Object push(Object data) {
		StackArr[++topIndex] = data;
		
		return data;
	}
	
	public Object pop() {
		Object data = peek();// Stack�� ����� ������ ��Ҹ� �о�´�.
		
		topIndex--;//ž �ε����� ������ ���� ������ ���ִ°Ͱ� ���� ����� ����
			//��� ����Ʈ ������� �ϸ� ������ ���� �յڶ����ִ� ��������ϰԵ�
		return data;
	}
	
	public Object peek() {
		if (topIndex == -1) {//��ü�� ������ ������ ���ٸ�
			throw new EmptyStackException();
		}
		return StackArr[topIndex];//���� ž�� ���� ����	
		}
	
	public boolean empty() {
		return topIndex == -1;//-1�̶�� �����Ͱ� ����
	}
}