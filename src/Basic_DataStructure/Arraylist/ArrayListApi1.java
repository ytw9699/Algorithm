package Arraylist;
import java.util.ArrayList;//임포트 해주자

public class ArrayListApi1 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();//ArrayList 객체 생성

    numbers.add(10);//add는 배열에 단순히 더해지는 것이기 때문에 빠르게 동작한다.
    numbers.add(20);//마지막에 추가
    numbers.add(30);
    
    System.out.println("add(값)");
    System.out.println(numbers);
    
    numbers.add(0, 35);//0번째에 추가
    System.out.println("add(값)");
    System.out.println(numbers);
    
    numbers.add(1, 50);//1번째에 추가
    System.out.println("add(인덱스, 값)");
    System.out.println(numbers);
    System.out.println();

    System.out.println(numbers.remove(2));//삭제후 삭제값 10 리턴
    System.out.println("remove(인덱스)");
    System.out.println(numbers);

    System.out.println("\nget(인덱스)");
    System.out.println(numbers.get(2));//인덱스2번째 가져오기

    System.out.println("\nsize()");
    System.out.println(numbers.size());//엘리먼트의 갯수 가져오기

    System.out.println("\nindexOf()");
    System.out.println(numbers.indexOf(30));//30의 인덱스 위치 가져오기
    
    System.out.println("remove(numbers.size()-1))");
    System.out.println(numbers.remove(numbers.size()-1));//마지막 삭제
    
}
}
