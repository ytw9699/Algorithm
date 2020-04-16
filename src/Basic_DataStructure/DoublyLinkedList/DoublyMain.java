package DoublyLinkedList;

public class DoublyMain {
    public static void main(String[] args) {
    	
        DoublyLinkedList numbers = new DoublyLinkedList();
         numbers.addFirst(30);//맨 앞에 추가 
         numbers.addFirst(20);
         numbers.addFirst(10);
         	System.out.println(numbers);
                  
         System.out.println(numbers.removeLast());//맨뒤 요소 제거
         	System.out.println(numbers);
           
         numbers.addLast(30);//맨 뒤에 추가
         numbers.addLast(40);
         numbers.addLast(50);
         	System.out.println(numbers);
         
         System.out.println(numbers.node(2));//인덱스 2번째값을가져와보자
         
         numbers.add(2,25);//인덱스 2위치에 25추가
         	System.out.println(numbers);
         	
         System.out.println(numbers.removeFirst());//맨앞 요소 제거
         System.out.println(numbers);
         
         System.out.println(numbers.remove(2));//지정된 위치의 요소 제거
         System.out.println(numbers);
                 
         System.out.println(numbers.size());//노드 수 반환
         
         System.out.println(numbers.get(1));//지정된 위치의 객체를 반환
         
         System.out.println(numbers.indexOf(40));//10의 값에 해당하는 위치 반환
         
         DoublyLinkedList.ListIterator i = numbers.listIterator();
         
         System.out.println(numbers);
         i.add(5);//next를 안하고 그냥 5를 추가하면 맨앞에 추가됨
         i.next();
         i.add(15);
         System.out.println(numbers);
          
         while(i.hasNext()){
     	    System.out.println(i.next());
     	 }
         
         i = numbers.listIterator();
         
         while(i.hasNext()) {
        	 if((int)i.next()==20){
        	       i.remove();
        	 }
         }
         System.out.println(numbers);
    }
 
}