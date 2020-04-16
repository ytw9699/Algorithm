package Arraylist;
	import java.util.ArrayList;
	import java.util.Iterator;//임포트 해주자
	
	public class ArrayListApi2 {
	  public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<>();
 
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
                
        Iterator it = numbers.iterator();
        /*Iterator 객체는 numbers 객체 내부에 저장된 값을 하나씩
        	순회하면서 탐색할 수 있도록 돕는 객체이다*/
        System.out.println("iterator");
        
        while (it.hasNext()) {
        //만약 더 이상 순회할 엘리먼트가 없다면 it.hasNext()의 리턴값은 false가 되면서 while문이 종료
            int value = (int) it.next();
            //it.next()메소드를 호출할 때마다 엘리먼트를 순서대로 리턴
            if (value == 30) {
                it.remove();//순회 과정에서 조건에 따라 엘리먼트를 삭제
            }
            System.out.println(value);//순회 출력
        }
        System.out.println(numbers);
 
        System.out.println("for each");
	        for (int value : numbers) {//조금 더 편리한 방법으로 탐색
	            System.out.println(value);
	        }
	        
        System.out.println("for");//조금 더 편리한 방법으로 탐색
	        for (int i = 0; i < numbers.size(); i++) {
	            System.out.println(numbers.get(i));
	        }
    }
}
