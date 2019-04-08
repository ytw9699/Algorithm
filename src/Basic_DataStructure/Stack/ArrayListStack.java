package Stack;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack extends ArrayList{//��� ����Ʈ ���
	public Object push(Object data) {
		add(data);
		return data;
	}
	
	public Object pop() {
		Object data = peek();// Stack�� ����� ������ ��Ҹ� �о�´�.
		
		remove(size() - 1);//������ ��Ҹ� �����Ѵ�
		
		return data;
	}
	
	public Object peek() {
		int	len = size();//��ü ������ ����
		
		if (len == 0) {//��ü ������ ������ ���ٸ�
			throw new EmptyStackException();
			//EmptyStackException�� �߻�
		}
		return get(len - 1);//������ ����Ʈ ������Ʈ ����	
		}
	
	public boolean empty() {
		return size() == 0;//������ 0����� ����
		}
}