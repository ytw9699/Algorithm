package Ch_02_Linked_Lists;
public class Question08 {
	public static void main(String[] args) {
		int list_length = 11;//연결 리스트 크기
		int k = 3 % list_length; //순환 시작 지점
		
		LinkedList cyclelist = new LinkedList();//단일 연결 리스트 생성
		
		for (int i = 0; i < list_length; i++) {
			cyclelist.addLast(i);//노드 생성
			//System.out.println(cyclelist);
		}
		if (!cyclelist.appendToTail(k)) {//순환연결리스트 생성 - tail을 순환시작으로 연결
			System.out.println("No Cycle.");
		}
		Object result = cyclelist.FindBeginning();
		
		if(result == null){//순환 구조가 맞는 검사
			System.out.println("No Cycle.");
		}else {
			System.out.println(result);//3출력 //순환 시작 부분 노드 반환
		}
	}
}
