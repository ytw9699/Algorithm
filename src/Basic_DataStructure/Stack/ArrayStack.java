package Stack;
import java.util.EmptyStackException;
public class ArrayStack {
	
	int topIndex = -1;//���� ž�� �ε����� -1 �ʱ�ȭ//�����Ͱ� ���� ����
	
    private Object[] StackArr = new Object[100];//�迭�� ũ��� 100���� �ϴ� ����
    
	public Object push(Object data) {
		StackArr[++topIndex] = data;
		
		return data;
	}
	
	public Object pop() {
		Object data = peek();// Stack�� ����� ������ ��Ҹ� �о�´�.
		
		topIndex--;//ž �ε����� ������ ���� ������ ���ִ°Ͱ� ���� ����� ����
		return data;
	}
	
	public Object peek() {
		if (topIndex == -1) {//���� �����Ͱ� ���ٸ�
			throw new EmptyStackException();
		}
		return StackArr[topIndex];//���� ž�� ���� ����	
		}
	
	public boolean empty() {
		return topIndex == -1;//-1�̶�� �����Ͱ� ����
	}
}