package DoublyLinkedList;

//import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class DoublyLinkedListApi {

	public static void main(String[] args) {

		LinkedList LinkedList = new LinkedList();
		
		LinkedList.add(1);
		LinkedList.add(3);
		LinkedList.add(2);
		LinkedList.add(4);
		LinkedList.add(5);
		
		//Collections.sort(LinkedList);//���ı��
		ListIterator i = LinkedList.listIterator();
		
		while(i.hasNext()){
     	    System.out.println(i.next());
     	 }
		System.out.println();
		
		boolean a = LinkedList.remove((Object)2);//2���� ���� ��� ����
		
		int index = LinkedList.indexOf(1);//x���� ���� ����� �ε����� ��ȯ, 0��° ��ġ ��ȯ
		
		LinkedList.add(index,0);//index�� �ش��ϴ� ��ġ�� ��0�� ���� ��带 �߰��Ѵ�
		LinkedList.add(index,2);
		
		ListIterator k = LinkedList.listIterator();
		
		while(k.hasNext()){
     	    System.out.println(k.next());
     	 }
	}
}
