package DoublyLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListApi {

	public static void main(String[] args) {

		LinkedList LinkedList = new LinkedList();
		
		LinkedList.add(1);
		LinkedList.add(2);
		LinkedList.add(3);
		LinkedList.add(4);
		LinkedList.add(6);
		LinkedList.add(7);
		LinkedList.add(5);
		
		ListIterator i = LinkedList.listIterator();
		
		while(i.hasNext()){
     	    System.out.println(i.next());
     	 }
		System.out.println();
		
		boolean a = LinkedList.remove((Object)2);
		
		int index = LinkedList.indexOf(1);//x값의 인덱스를 반환
		
		LinkedList.add(index,2);//index에 해당하는 값의 앞쪽에 2를 추가
		LinkedList.add(index+1,2);//index에 해당하는 값의 뒤쪽에 2를 추가
		
		
		ListIterator k = LinkedList.listIterator();
		
		while(k.hasNext()){
     	    System.out.println(k.next());
     	 }
	}
}
