package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
    	
        LinkedList numbers = new LinkedList();
        
        System.out.println("시작");
        
         numbers.addFirst(30);
         System.out.println(numbers);
         numbers.addFirst(20);
         numbers.addFirst(10);
         System.out.println(numbers);
         numbers.addLast(10);
         numbers.addLast(20);
         numbers.addLast(30);
         //System.out.println(numbers.node(2));//2번째값을가져와보자
         numbers.add(2,25);
         
         System.out.println(numbers);
         System.out.println(numbers.removeFirst());
         //numbers.removeFirst();
         System.out.println(numbers);
         System.out.println(numbers.remove(2));
         System.out.println(numbers);
         System.out.println(numbers.removeLast());
         System.out.println(numbers);
         System.out.println(numbers.size());
         System.out.println(numbers.get(1));
         System.out.println("인덱스");
         System.out.println(numbers.get(numbers.size()-1));
         System.out.println(numbers.indexOf(10));
         
         LinkedList.ListIterator i = numbers.listIterator();
         
         System.out.println("반복자");
         System.out.println(numbers);
         i.add(5);
         System.out.println(numbers);
         i.add(4);
         System.out.println(numbers);
         System.out.println(i.next());
         System.out.println(i.next());
         System.out.println(numbers);
         i.add(15);
         System.out.println(numbers);
          
         while(i.hasNext()){//모든 노드 순차적 조회
     	    System.out.println(i.next());
     	 }
         
        /* for(int i=0; i<numbers.size(); i++){
        	    System.out.println(numbers.get(i));
        }
                위와 같은 방법으로 반복을 사용해도되지만 linkedlist에서는 이것은 바람직하지 않은 방법.
                왜냐하면 ArrayList와 다르게 LinkedList에서 get은 효율적이지 않기 때문.
         get을 호출할 때마다 내부적으로는 반복문이 실행. 이런 경우 Iterator를 사용하는 것이 유리.
         Iterator는 내부적으로 반복 처리된 노드가 무엇인지에 대한 정보를 유지하기 때문*/
         
         System.out.println("반복");
         System.out.println(i.next());
         System.out.println(i.next());
         System.out.println(i.hasNext());
         System.out.println(i.next());
         System.out.println(i.next());
         System.out.println(i.hasNext());
         
         while(i.hasNext()) {//더블링크드 리스크가 아니라서 이방법은 효율적이지않음
        	 if((int)i.next()==20){//여기서 노드를 찾는과정을 해왔는데 
        	       i.remove();//여기서 또 node메소드를 통해 노드 탐색을해서 비효율
        	 }//그래서 단방향에서 양방향 연결 리스트가 나온거
         }
         System.out.println(numbers);
    }
 
}