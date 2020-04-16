package CircularLinkedList;
public class CircularLinkedList {
   private Node tail;// 마지막 노드를 가리키는 필드,변수
   private Node cur;// 현재의 노드를 가리키는 변수
   private Node before;
   private Node temp;
   private int size = 0; //엘리먼트 갯수
   
   private class Node{
   	
       private Object data;//데이터가 저장될 변수-실제 저장값
      
       private Node next;//다음 노드를 가리키는 변수,참조값
       
       public Node(Object input) {//객체생성 초기화
           this.data = input;
           this.next = null;//생성시는 미정
       }
       public String toString(){//노드의 값을 쉽게 출력위해
           return String.valueOf(this.data);
       }
   }
   public void addFirst(Object input){//머리에 추가
      
      Node newNode = new Node(input);//노드를 생성
       
      if(tail == null) 
      {
  		tail = newNode;
  		newNode.next = newNode;
      }
      else
      {
  		newNode.next = tail.next;
  		tail.next = newNode;
      }
       size++;
   }
   public void addLast(Object input){//꼬리에 추가
       if(size == 0){//리스트의 노드가 하나도 없다면 첫번째 노드를 추가하는 메소드를 사용.
           addFirst(input);
       } 
       else //기존 노드가 하나라도 있다면 
       {
       		Node newNode = new Node(input);
       	
		    if(tail == null) 
		    {
				tail = newNode;
				newNode.next = newNode;
		    }
		    else
		    {
				newNode.next = tail.next;
				tail.next = newNode;
				tail = newNode;
		    }
          
           size++;//엘리먼트 개수 1 증가
       }
   }
   public Object getFirst(){//첫번재 엘리먼트 값 조회
	   if(tail == null)    // 저장된 노드가 없다면
			return 1;

		before = tail;
		cur = tail.next;
       return cur.data;
   }
   public Object getNext(){//다음 엘리먼트 값 조회
	   if(tail == null)    // 저장된 노드가 없다면
			return 1;

		before = cur;
		cur = cur.next;
       return cur.data;
   }
  
   public String toString() {//리스트안에 데이터 전부 출력
       if(tail == null){//리스트에 데이터가 없다면
           return "[]";
       }       
       Node temp = tail.next;
       String str = "[";
       while(temp.next != tail.next){
           str += temp.data + ",";
           temp = temp.next;
       }
       str += temp.data;//마지막 노드를 출력결과에 포함
       return str+"]";
   }
   
   public Object remove(){
	   temp = cur;
	   Object returnData = temp.data;
	   if(temp == tail) {// 삭제 대상을 tail이 가리킨다면
		   if(tail == tail.next) // 그리고 마지막 남은 노드라면
			   tail = null;
		   else 
			   tail = before;
	   }
	   before.next = cur.next;
	   cur = before;
	   size--;
       return returnData;
   }
   
   public int size(){//리스트가 가진 데이터의수
       return size;
   }
  }
	
