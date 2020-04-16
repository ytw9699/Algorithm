package List_compare;

import Arraylist.ArrayList;
import LinkedList.LinkedList;

public class Main {//어레이리스트와 vs 단방향 연결 리스트
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(0,5);//1.최악의경우 첫번째에 추가할려면 비효율적 백만건 다 뒤로 밀어야함
		
		ArrayList.ListIterator ai = a.listIterator();
		while(ai.hasNext()) {
			if((int)ai.next() == 20 ) {
				ai.add(25);//5.이렇게 중간에 데이터 추가하는게 비효율적//배열에서 다 뒤로 밀어야함
			}
		}
		
		LinkedList l = new LinkedList();
		l.addLast(10);
		l.addLast(10);
		l.addLast(10);
		l.addFirst(5);//2.추가할려면 간단 연결점만 연결
		
		LinkedList.ListIterator li = l.listIterator();
		while(li.hasNext()) {
			if((int)li.next() == 20 ){
				li.add(25);//6.이렇게 중간에 데이터 추가하는게 효율적//연결점만 바꿔주면됨
			}
		}
		a.get(2);//3.바로찾아감 인덱스를 알고있어서
		//랜덤 엑세스 메모리로 특정값에 접근 어느 주소로 접근하건간에 동일한 속도 보장 
		l.get(2);//4.엄청오래걸림 처음부터 찾아가야함
	}

}
