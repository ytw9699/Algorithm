package LinkedList;
public class LinkedListMain {
    public static void main(String[] args) {
    	
        LinkedList numbers = new LinkedList();
        
         numbers.addFirst(30);//맨 앞에 추가 
         numbers.addFirst(20);
         numbers.addFirst(10);
         	System.out.println(numbers);//출력
         numbers.addLast(40);//맨 뒤에 추가
         numbers.addLast(50);
         numbers.addLast(60);
         	System.out.println(numbers);
         
         numbers.add(2,25);//인덱스 2위치에 25추가
         System.out.println(numbers.node(2));//인덱스 2번째값을가져와보자
         
         	System.out.println(numbers);
         System.out.println(numbers.removeFirst());//맨앞 요소 제거
         	System.out.println(numbers);
         System.out.println(numbers.remove(2));//지정된 위치의 요소 제거
         	System.out.println(numbers);
         System.out.println(numbers.removeLast());//맨뒤 요소 제거
         	System.out.println(numbers);
         System.out.println(numbers.size());//노드 수 반환
         System.out.println(numbers.get(1));//지정된 위치의 객체를 반환
         System.out.println("인덱스");
         System.out.println(numbers.get(numbers.size()-1));//맨뒤의 위치의 값을 반환
         System.out.println(numbers.indexOf((Object)10));//10의 값에 해당하는 위치 반환

         System.out.println("반복자");
         LinkedList.ListIterator i = numbers.listIterator();
         
         	System.out.println(numbers);
         i.add(5);//값 추가
         	System.out.println(numbers);
         i.add(4);
         	System.out.println(numbers);
         System.out.println(i.next());//탐색
         	System.out.println(numbers);
         i.add(15);
         	System.out.println(numbers);
         
         while(i.hasNext()){//모든 노드 순차적 조회
      	    System.out.println(i.next());
      	 }
         /* 
          	for(int i=0; i<numbers.size(); i++){
 	    		System.out.println(numbers.get(i));
 			}
	         위와 같은 방법으로 반복을 사용해도되지만 linkedlist에서는 이것은 바람직하지 않은 방법이다
	         왜냐하면 ArrayList와 다르게 LinkedList에서 get은 효율적이지 않기 때문
		 get을 호출할 때마다 내부적으로는 반복문이 실행. 이런 경우 Iterator를 사용하는 것이 유리
		 Iterator는 내부적으로 반복 처리된 노드가 무엇인지에 대한 정보를 유지하기 때문
		 */
         i = numbers.listIterator();
         
         while(i.hasNext()) {//더블링크드 리스크가 아니라서 이 방법은 효율적이지않음
        	 if((int)i.next()==20){//여기서 노드를 찾는과정을 해왔는데 
        	       i.remove();//여기서 또 node메소드를 통해 노드 탐색을해서 비효율
        	 }//그래서 단방향에서 양방향 연결 리스트가 나온것이다.
         }
         System.out.println(numbers);
    }
 
}