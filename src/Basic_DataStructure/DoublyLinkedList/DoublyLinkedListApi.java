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
		
		//Collections.sort(LinkedList);//정렬기능
		ListIterator i = LinkedList.listIterator();
		
		while(i.hasNext()){
     	    System.out.println(i.next());
     	 }
		System.out.println();
		
		boolean a = LinkedList.remove((Object)2);//2값을 가진 노드 삭제
		
		int index = LinkedList.indexOf(1);//x값의 가진 노드의 인덱스를 반환, 0번째 위치 반환
		
		LinkedList.add(index,0);//index에 해당하는 위치에 값0을 가진 노드를 추가한다
		LinkedList.add(index,2);
		
		ListIterator k = LinkedList.listIterator();
		
		while(k.hasNext()){
     	    System.out.println(k.next());
     	 }
	}
}
