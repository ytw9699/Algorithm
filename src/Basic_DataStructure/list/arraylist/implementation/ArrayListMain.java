package list.arraylist.implementation;
  public class ArrayListMain {
  public static void main(String[] args) {
	ArrayList numbers = new ArrayList();
	
    numbers.add(10);//마지막 추가
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(1, 15);//첫번째에 추가
    numbers.add(0,5);//맨앞 추가
   
    System.out.println(numbers);
    //여기서 객체를 불러오면 이안에 tostring메소드를 가져오도록 설정되있음
    
    System.out.println(numbers.remove(1));//인덱스 1번째 삭제
    System.out.println(numbers.remove(0));//처음삭제
    System.out.println(numbers.remove(numbers.size()-1));//마지막 삭제
    System.out.println(numbers);
    System.out.println(numbers.get(0));//0번째 값 가져오기
    System.out.println(numbers.size());//리스트의 엘리먼트 수 반환
    System.out.println(numbers.indexOf(20));//20값이 있는 인덱스 반환
    System.out.println();
    //반복 2가지 방법
    for(int i=0; i<numbers.size(); i++) {//1째 방법
     System.out.println(numbers.get(i));
    }

    ArrayList.ListIterator li = numbers.listIterator();//2번째방법
    //ArrayList.ListIterator는 ArrayList클래스안에 istIterator라는 클래스를 가리킴
    //그 클래스를 데이터 타입으로 하는 li객체 생성
    System.out.println("이후값 순차적 출력");
    while(li.hasNext()){//이후값 순차적 출력
    int value = (int) li.next();
   	 System.out.println(value);
    }
    
    System.out.println("이전값 순차적 출력");
    
    while(li.hasPrevious()) {//이전값 순차적 출력
	   System.out.println(li.previous());
    }
       
    System.out.println(numbers);
       
    while(li.hasNext()) {
	   int number = (int)li.next();//중간에 값을 추가해보자
	   if(number == 20) {//20다음 35
		   li.add(35);
	   }
     }
    System.out.println(numbers);
       
    li = numbers.listIterator();//객체생성시 nextIndex = 0; 으로 다시 초기화
    
    while(li.hasNext()) {//그리고 다시 순차 반복
	   int number = (int)li.next();
			   if(number == 30) {//이터레이터를 통해 탐색할때 필요한 위치의 엘리먼트 삭제
				   li.remove();
			   }
	         }
    System.out.println(numbers);
    }
	}
