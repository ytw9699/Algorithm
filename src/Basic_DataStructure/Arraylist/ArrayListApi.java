package Arraylist;
	import java.util.ArrayList;//임포트 해주자
	import java.util.Iterator;//임포트 해주자
	
		public class ArrayListApi {//Java에서 ArrayList는 가장 많이 사용되는 데이터 스트럭쳐입니다
	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();//ArrayList 객체 생성
 
        numbers.add(10);//add는 배열에 단순히 더해지는 것이기 때문에 빠르게 동작합니다.
        numbers.add(20);//마지막에 추가
        numbers.add(30);//마지막에 추가
        
        System.out.println("add(값)");
        System.out.println(numbers);
        
        numbers.add(0, 35);//0번째에 추가
        System.out.println("add(값)");
        System.out.println(numbers);
        
        numbers.add(1, 50);//1번째에 추가
        System.out.println("\nadd(인덱스, 값)");
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
        
        System.out.println(numbers.remove(numbers.size()-1));//마지막 삭제
        
        Iterator it = numbers.iterator();
        //자바에서는 ArrayList를 탐색하기 위한 방법으로 iterator을 제공
        //Iterator 객체는 numbers 객체 내부에 저장된 값을 하나씩
        //순회하면서 탐색할 수 있도록 돕는 객체
        System.out.println("\niterator");
        while (it.hasNext()) {
        	//만약 더 이상 순회할 엘리먼트가 없다면 it.hasNext()의 값은 false가 되면서 while문이 종료
            int value = (int) it.next();
            //it.next() 메소드를 호출할 때마다 엘리먼트를 순서대로 리턴
            if (value == 30) {
                it.remove();//순회 과정에서 필요에 따라 엘리먼트를 삭제
            }
            System.out.println(value);
        }
        System.out.println(numbers);
 
        System.out.println("\nfor each");
        for (int value : numbers) {//조금 더 편리한 방법으로 탐색
            System.out.println(value);
        }
        System.out.println("\nfor");//조금 더 편리한 방법으로 탐색
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
