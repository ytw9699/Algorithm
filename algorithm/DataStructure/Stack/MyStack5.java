package Stack;
import list.doublylinkedlist.implementation.DoublyLinkedList;
import java.util.EmptyStackException;

public class MyStack5 extends DoublyLinkedList{//�������� ���� ��ũ�� ����Ʈ ��� ����
	
	public Object push(Object data) {
		addFirst(data);
		return data;
	}
	
	public Object pop() {
		
		Object data = removeFirst();//Stack�� ����� ù��° ��Ҹ� �о���� �����Ѵ�
		
		return data;
	}
	
	public Object peek() {
		int	len = size();//��ü ������ ����
		
		if (len == 0) {//��ü ������ ������ ���ٸ�
			throw new EmptyStackException();
			//EmptyStackException�� �߻�
		}
		return get(0);//��� ������Ʈ ��������	
		}
	
	public boolean isEmpty() {
		return size() == 0;//������ 0����� ����
		}
}