package c_3045;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2 {
	
	static DoublyLinkedList2 dobleLink = new DoublyLinkedList2();
	
	public static void main(String[] args) throws Exception {
			
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int nodes = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());
	
	 String[] order= new String[count];
	
		for(int i =0; i<count; i++) {
			order[i]= br.readLine();
		}
			br.close();
		
		for(int i =0; i<nodes; i++) {
			dobleLink.addLast(i+1);
		}
		//System.out.println(dobleLink.toString());
		
		for(int i =0; i<count; i++) {
			String action[] = order[i].split(" ");
			change(action[0],action[1],action[2]);
		}
		//System.out.println(dobleLink.toString());
		
		int max=0;
		int maxindex=0;
		int[] dp = new int[nodes];// 인덱스마다 각 증가 수열의 길이//dp 배열은 증가 수열의 길이를 넣을 것이다.
		int[] array = dobleLink.toIntArr(nodes);// 인덱스마다 각 입력값
	/*	for (int i = 0; i < nodes; i++) {
					System.out.println(array[i]);
		}*/
		String[] sequence = new String[nodes];//증가 수열 
		int ans = 0;
		
		dp[0] = 1;
		sequence[0] = Integer.toString(array[0]);

		for (int i = 1; i < nodes; i++) {
		  dp[i] = 1;
		  String temp="";
		  // i 를 기준으로 인덱스 0 에서부터 i-1까지 체크한다 
		    // 길이를 기준
		  for (int j = 0; j < i; j++) {
		    if ( array[i] > array[j] && dp[i] < dp[j] + 1 ) { // 증가 수열 이라면
		      dp[i] = dp[j] + 1;//길이 1증가
		      if(dp[j] + 1 > max) {
		    	  max = dp[j] + 1 ;
		    	  maxindex = i;
		      }
		      
		      temp = temp+Integer.toString(array[j]);
		    }
		  }
		    sequence[i] = temp+array[i];
		  //System.out.println(sequence[i]);
		}
		for(int i=1;i<nodes;i++) {
		  if (ans < dp[i]) {
		    ans = dp[i];
		  }
		}
		/*for(int i=0;i<nodes;i++) {
			    System.out.print(dp[i]);
			}*/
		//System.out.println();
		System.out.println(nodes - ans);
		
		//System.out.println(Arrays.toString(array));
		
		Arrays.sort(array); 
		
		//System.out.println(Arrays.toString(array)); 
		 
		String[] output = sequence[maxindex].split("");
		
		int[] idx0 = new int[output.length];
		
		for(int i=0;i<output.length;i++) {
			idx0[i]=Arrays.binarySearch(array, Integer.parseInt(output[i]) );
		}
		for(int i=0;i<idx0.length;i++) {
			array[idx0[i]]=0;
		}
		//System.out.println(Arrays.toString(array));
		
		for(int i=0; i<nodes; i++) {
			if(array[i] > 0 && array[i]<nodes) {
				int a=array[i];
				int b=array[i]+1;
				System.out.println("A"+" "+a+" "+b);
		//change("A" ,  Integer.toString(idx0[i]) ,  Integer.toString(idx0[i]+1));	
				}
			else if( array[i] == nodes){
				int a=array[i];
				int b=array[i]-1;
				System.out.println("B"+" "+a+" "+b);	
			}
		}
		}
	private static void change(String selection, String X, String Y) {
		int x= Integer.parseInt(X);
   		int y= Integer.parseInt(Y);
   		
		if(selection.equals("A")) {
			dobleLink.toFront(x,y);//x노드를 y노드의 앞으로 이동
		}else {
			dobleLink.toRear(x,y);//x노드를 y노드의 뒤로 이동
		}
	}
}

   class DoublyLinkedList2 {
    private Node head;// 첫번째 노드를 가리키는 필드,변수,참조값
    private Node tail;// 마지막 노드를 가리키는 필드,변수
    private int size = 0; // 몇개의 엘리먼트
    
    public class Node{//링크드 리스트에서는 하나의 엘리먼트가(노드)하나의 객체다
    	//그객체를 LinkedList의 innerclass로 정의
    	
        private Object data;//데이터가 저장될 변수-실제 저장값
       
        private Node next;//다음 노드를 가리키는 변수,참조값
        private Node prev;//이전 노드
        
        public Node(Object input) {//객체생성 초기화
            this.data = input;
            this.next = null;//생성시는 미정
            this.prev = null;
        }
        public String toString(){//노드의 값을 쉽게 출력위해
            return String.valueOf(this.data);
        }
    }
    
  	public void toFront(int x, int y) {
   		Object currentNodeData = remove(x);
   		addFront(y, currentNodeData);//x노드를 y노드의 앞으로 이동
   	}
    
    public void toRear(int x, int y) {
    	Object currentNodeData = remove(x);
    	addRear(y, currentNodeData);//x노드를 y노드의 뒤로 이동
   	}
    
    public void addFront(int k, Object input){// 특정 위치 값 추가
        // 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용합니다.
        if(k == 1){
            addFirst(input);
        } else {
            Node temp1 = node(k).prev;
           
            Node temp2 = temp1.next;//k번째 노드를 temp2로 지정
        
            Node newNode = new Node(input);//새로운 노드를 생성.
            
            temp1.next = newNode;// temp1의 다음 노드로 새로운 노드를 지정
            
            newNode.next = temp2;// 새로운 노드의 다음 노드로 temp2를 지정
            
            temp2.prev = newNode;//생성노드를 temp2의 이전노드로
            
            newNode.prev = temp1;//새로운 노드의 이전 노드로 temp1
            
            size++;
        }
    }
    public void addRear(int k, Object input){// 특정 위치 값 추가
        // 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용합니다.
        
            Node temp1 = node(k);
           
            Node temp2 = temp1.next;//k번째 노드를 temp2로 지정
        
            Node newNode = new Node(input);//새로운 노드를 생성.
            
            temp1.next = newNode;// temp1의 다음 노드로 새로운 노드를 지정
            
            newNode.next = temp2;// 새로운 노드의 다음 노드로 temp2를 지정
            
            if (temp2 != null) {//temp2가 없었을수도 있으니
                temp2.prev = newNode;//생성노드를 temp2의 이전노드로
            }
            newNode.prev = temp1;//새로운 노드의 이전 노드로 temp1
            
            size++;
            
            if(newNode.next == null){//마지막 꼬리에 추가시 검사사항
                tail = newNode;
         //혹시나 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이기 때문에 tail로 지정.
            }
        }
 
    public void addFirst(Object input){//머리에 추가
       
        Node newNode = new Node(input);//노드를 생성
        
        newNode.next = head;//새로운 노드의 다음 노드로 해드 지정
        
        if(head != null){//처음으로 노드를 추가하는것이 아니라면
           head.prev = newNode;//새로운 노드를 헤드의 이전노드로 지정
         }
        
        head = newNode;//헤드로 새로운 노드를 지정
        size++;
        if(head.next == null){
            tail = head;
        }
    }
   
	public void addLast(Object input){//꼬리에 추가
        if(size == 0){//리스트의 노드가 하나도 없다면 첫번째 노드를 추가하는 메소드를 사용.
            addFirst(input);
        } else {//기존 노드가 하나라도 있다면 
        	Node newNode = new Node(input);
        	
            tail.next = newNode;//마지막 노드의 다음 노드로 생성한 노드를 지정.
           
            newNode.prev = tail;//생성한 노드의 이전 노드로 기존의 tail을 지정
            
            tail = newNode; //마지막 노드를 갱신.
           
            size++;//엘리먼트 개수 1 증가
        }
    }
    Node node(int data) {
    	Node searchNode=head;
        while(!(searchNode.data.equals(data))) {
        	searchNode = searchNode.next;
        }
          return searchNode;
	}
    
    public String toString() {//리스트안에 데이터 전부 출력
        if(size == 0){//리스트에 데이터가 없다면
            return "[]";
        }       
        Node temp = head;//항상 시작은 헤드 지정
        String str = "[";
        while(temp.next != null){//head의 다음 노드가 없을 때까지 반복문을 실행
            str += temp.data + ",";
            temp = temp.next;
        }//마지막 노드는 다음 노드가 없기 때문에 아래의 구문은 마지막 노드는 제외.
        str += temp.data;// 마지막 노드를 출력결과에 포함
        return str+"]";
    }
    public int[] toIntArr(int n) {
    	int [] arr= new int[n];
    	int i=0;
        Node temp = head;
        while(temp.next != null){
            arr[i++]=(int)temp.data;
        	temp = temp.next;
        }
        arr[i]=(int)temp.data;
        return arr;
    }
    
    public Object removeFirst(){//첫번째 노드 삭제
        Node temp = head;//첫번째 노드를 temp로 지정
        head = temp.next;//head의 값을 두번째 노드로 변경.
        
        Object returnData = temp.data;//데이터 삭제 전에 리턴할 값을 임시 변수에 담자.
        
        temp = null;//null로 지정해서 가비지 컬렌션이 됨
        
        if(head != null) {
        	head.prev = null;//새로운 헤드가 됬으니 이전노드를 삭제해주는거
        }
        size--;
        
        return returnData;
    }
    
    public Object remove(int k){
    	Node todoDeleted;//삭제할 노드
    	Object returnData = null;//리턴 데이터
    	
        if(node(k).prev == null) {//삭제할려는값이 첫번째값이라면
        	todoDeleted = head;
        	head.next.prev = null;
       	 	head = head.next;
        }else {
        	 
        Node temp = node(k).prev;//삭제 노드 전 노드를 temp의 값으로 지정
        
         todoDeleted = temp.next;// 삭제 노드를 todoDeleted에 기록
        // 삭제 노드를 지금 제거하면 삭제 앞 노드와 삭제 뒤 노드를 연결할 수 없다.  
        
        temp.next = temp.next.next;
        
        if(temp.next != null) {
        	temp.next.prev = temp;//삭제노드의 후와 전을 연결
        }
        // 삭제된 데이터를 리턴하기 위해서 returnData에 데이터를 저장합니다.
         returnData = todoDeleted.data; 
        
        if(todoDeleted == tail){//삭제할려는데이터가 마지막값이라면
            tail = temp;
        }
        }
        todoDeleted = null; 
        size--;
        return returnData;
    }
	}