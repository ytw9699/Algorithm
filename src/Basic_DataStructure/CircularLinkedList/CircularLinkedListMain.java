package CircularLinkedList;
public class CircularLinkedListMain {
	static CircularLinkedList numbers = new CircularLinkedList();
	// 원형 연결 리스트의 생성
	static Object first;//데이터 조회를 위한 변수 선언1
	static Object next;//데이터 조회를 위한 변수 선언2
	 
    public static void main(String[] args) {
    	
         numbers.addFirst(20);//맨 앞에 추가 
         numbers.addFirst(10);
         	System.out.println(numbers);//출력
         numbers.addLast(30);//맨 뒤에 추가
         numbers.addLast(40);
         	System.out.println(numbers);
          	
         	getAllNode();//전체 데이터 조회
         	
         	remove(20);//리스트에서 20 삭제 
         	
         	getAllNode();
         	
         System.out.println(numbers);
    }
    
    public static void getAllNode() {//전체 데이터 조회
		 first = numbers.getFirst();
      	
      	if((int)first != 1) {
      		System.out.println(first);//맨 앞 출력
      		
      		for(int i=0; i<numbers.size()-1; i++)
     		{
      			next = numbers.getNext();//맨 앞 뒤로 쭉 출력
      			
      			if((int)next != 1) {
      				System.out.println(next);
      			}
     		}
      	}
	 }
    
    public static void remove(int target) {//타겟에 해당하는 노드 삭제
    	first = numbers.getFirst();
      	
      	if((int)first != 1) {
      			if((int)first == target) {//맨 앞의 데이터가 타겟이라면
					numbers.remove();
					return;//삭제되면 빠져나가자
				}
      		for(int i=0; i<numbers.size()-1; i++)//전체 탐색
     		{
      			next = numbers.getNext();
      			
      			if((int)next != 1) {
      				if((int)next == target) {//뒤의 값중에 타겟과 값이 일치하면
      					numbers.remove();//삭제 메소드 실행
      					return;//삭제되면 빠져나가자
      				}
      			}
     		}
      	}
    }
}