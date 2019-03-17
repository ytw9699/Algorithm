package Stack;
import list.arraylist.implementation.ArrayList;
import java.util.EmptyStackException;
public class MyStack3 extends ArrayList{//���� ���� ArrayList���
	public Object push(Object data) {
		add(data);
		return data;
	}
	
	public Object pop() {
		Object data = peek();//Stack�� ����� ������ ��Ҹ� �о�´�.
		
		remove(size() - 1);//������ ��Ҹ� �����Ѵ�
		
		return data;
	}
	
	public Object peek() {
		int	len = size();//��ü ������ ����
		
		if (len == 0) {//������ ������ ���ٸ�
			throw new EmptyStackException();
		}
		return get(len - 1);//������ ����Ʈ ������Ʈ ����	
		}
	
	public boolean empty() {
		return size() == 0;
		}
}