package Stack;
import java.util.EmptyStackException;
import LinkedList.LinkedList;
public class MyStack4 extends LinkedList{
	//���� ���� ��ũ�� ����Ʈ ���
	
	public Object push(Object data) {
		addFirst(data);
		return data;
	}
	
	public Object pop() {
		Object data = removeFirst();
		//Stack�� ����� ù��° ��Ҹ� �о���� �����Ѵ�
		
		return data;
	}
	
	public Object peek() {
		int	len = size();//��ü ������ ����
		
		if (len == 0) {//��ü ������ ������ ���ٸ�
			throw new EmptyStackException();
		}
		return get(0);//��� ������Ʈ get
		}
	
	public boolean empty() {
		return size() == 0;
		}
}