package queue;
import java.util.EmptyStackException;

import DoublyLinkedList.DoublyLinkedList;
public class MyQueue1 extends DoublyLinkedList{//�������� ���� ��ũ�� ����Ʈ ��� ť
	public Object offer(Object data) {
		addFirst(data);
		return data;
	}
	
	public Object poll() {
		
		Object data = removeLast();
		//ť�� ����� ��������° ��Ҹ� �о���� �����Ѵ�
		return data;
	}
	
	public Object peek() {
		int	len = size();//��ü ������ ����
		
		if (len == 0) {//��ü ������ ������ ���ٸ�
			throw new EmptyStackException();
		}
		return get(size());//tail ������Ʈ ��������	
		}
	
	public boolean isEmpty() {
		return size() == 0;//������ 0����� ����
		}
}