package zList_compare;

import list.arraylist.implementation.ArrayList;
import list.linkedlist.implementation.LinkedList;

public class Main {//��̸���Ʈ�� vs �ܹ��� ���� ����Ʈ
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(0,5);//1.�־��ǰ�� ù��°�� �߰��ҷ��� ��ȿ���� �鸸�� �� �ڷ� �о����
		
		ArrayList.ListIterator ai = a.listIterator();
		while(ai.hasNext()) {
			if((int)ai.next() == 20 ) {
				ai.add(25);//5.�̷��� �߰��� ������ �߰��ϴ°� ��ȿ����//�迭���� �� �ڷ� �о����
			}
		}
		
		LinkedList l = new LinkedList();
		l.addLast(10);
		l.addLast(10);
		l.addLast(10);
		l.addFirst(5);//2.�߰��ҷ��� ���� �������� ����
		
		LinkedList.ListIterator li = l.listIterator();
		while(li.hasNext()) {
			if((int)li.next() == 20 ){
				li.add(25);//6.�̷��� �߰��� ������ �߰��ϴ°� ȿ����//�������� �ٲ��ָ��
			}
		}
		a.get(2);//3.�ٷ�ã�ư� �ε����� �˰��־
		//���� ������ �޸𸮷� Ư������ ���� ��� �ּҷ� �����ϰǰ��� ������ �ӵ� ���� 
		l.get(2);//4.��û�����ɸ� ó������ ã�ư�����
	}

}
