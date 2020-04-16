package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;// 첫번째 노드를 가리키는 필드,변수,참조값
    private Node tail;// 마지막 노드를 가리키는 필드,변수
    private int size = 0; //엘리먼트 갯수
    
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
    Node node(int index) {//이 메소드가 양방향연결리스트의 장점을 보여줌 탐색의 효율성!
    	//인덱스의 위치에 따라서 탐색 방향을 달리 함. 탐색 시간을 두배로 향상
	    if (index < size / 2) {//노드의 인덱스가 전체 노드 수의 반보다 작다면
	        Node x = head;//head부터 next를 이용해서 인덱스에 해당하는 노드 탐색 시작 
	        for (int i = 0; i < index; i++) {
	            x = x.next;
	        }
	        return x;
	    } else {
	        Node x = tail;//tail부터 노드 탐색 시작
	        for (int i = size - 1; i > index; i--){
	            x = x.prev;
	        }
	        return x;
	    }
	}
    
    public void add(int k, Object input){// 특정 위치 값 추가
        // 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용합니다.
        if(k == 0){
            addFirst(input);
        } else {
            Node temp1 = node(k-1);
           
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
            	//추가한 노드가 마지막 노드이기 때문에 tail로 지정.
                tail = newNode;
            }
        }
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
        }
        str += temp.data;// 마지막 노드를 출력결과에 포함
        return str+"]";
    }
    
    public Object removeFirst(){//첫번째 노드 삭제
    	if(head != null) {
	        Node temp = head;//첫번째 노드를 temp로 지정
	        head = temp.next;//head의 값을 두번째 노드로 변경.
	        
	        Object returnData = temp.data;//데이터 삭제 전에 리턴할 값을 임시 변수에 담자.
	        
	        temp = null;//null로 지정해서 가비지 컬렌션이 됨
	        
	        if(head != null) {
	        	head.prev = null;//새로운 헤드가 瑛릿?이전노드를 삭제해주는거
	        }
	        size--;
	        
	        return returnData;
    	}else 
    		return (Object)"삭제할 노드가 없습니다";
    }
    
    public Object remove(int k){
        if(k == 0) {//삭제할려는값이 첫번째값이라면
            return removeFirst();
        }
        Node temp = node(k-1);//삭제 노드 전 노드를 temp의 값으로 지정
        
        Node todoDeleted = temp.next;// 삭제 노드를 todoDeleted에 기록
        // 삭제 노드를 지금 제거하면 삭제 앞 노드와 삭제 뒤 노드를 연결할 수 없다.  
        
        temp.next = temp.next.next;
        
        if(temp.next != null) {
        	temp.next.prev = temp;//삭제노드의 후와 전을 연결
        }
        // 삭제된 데이터를 리턴하기 위해서 returnData에 데이터를 저장합니다.
        Object returnData = todoDeleted.data; 
        
        if(todoDeleted == tail){//삭제할려는데이터가 마지막값이라면
            tail = temp;
        }
        todoDeleted = null; 
        size--;
        return returnData;
    }
    
    public Object removeLast(){//테일값만 찾아서 간단히 삭제하면 상수시간 걸린다.
     if(tail != null){
    	Node todoDeleted = tail;
    	tail = tail.prev;
	    	if(tail != null){
	    		tail.next = null;
	    	}
	    	else {
	    		head = null;
	    	}
        Object returnData = todoDeleted.data; 
    	 
    	todoDeleted = null;
    	 
    	size--;
    	 
        return returnData;
        
     }else {
    	 return (Object)"삭제할 노드가 없습니다";
     }
    }
    public int size(){//리스트가 가진 데이터의수
        return size;
    }
    
    public Object get(int k){//특정 엘리먼트 값 조회
        Node temp = node(k);
        return temp.data;
    }
    
    public int indexOf(Object data){//특정데이터가 어떤 위치에 있는지 검색
        Node temp = head;//먼저 첫번째 노드를 템프로 지정
     
        int index = 0;// 탐색 대상이 몇번째 엘리먼트에 있는지를 의미하는 변수로 index를 사용합니다.
       
        while(temp.data != data){//탐색 값과 탐색 대상의 값을 비교. 
            temp = temp.next;//다음 노드를 계속 검색
            
            index++;
         
            if(temp == null)// temp의 값이 null이라는 것은 더 이상 탐색 대상이 없다는 것
                return -1;
        }
        return index;// 탐색 대상을 찾았다면 대상의 인덱스 값을 리턴
    }
    
    public ListIterator listIterator() {
        return new ListIterator(); // 반복자를 생성해서 리턴
    }
     
    public class ListIterator{//이너 클래스
        private Node lastReturned;//반환하는 노드
        private Node next;//head로 초기화
        private int nextIndex;//몇번 next 메소드가 호출榮쩝?
         
        ListIterator(){
            next = head;//next변수 초기화
            nextIndex = 0;
        }
         
        public boolean hasNext() {//다음 노드가 있는가
            return nextIndex < size();
        }
        
        public Object next() {
            lastReturned = next;
            next = next.next; //next의 참조값이 기존 next.next로 변경. 
            nextIndex++;
            return lastReturned.data;
        }
        
        public boolean hasPrevious() {
        	return nextIndex > 0 ; //0 보다크면 리턴해줄게있는거
        }
        
        public Object previous() {
        	if(next == null) {//마지막까지 next()메소드를 통해 탐색을 했을경우
        		lastReturned = next = tail;
        	}else {//마지막까지 탐색안했을때
        		lastReturned = next = next.prev;
        	}
        	nextIndex--;
        	return  lastReturned.data;
        }
         
        public void add(Object input){//이터레이터 반복 과정중 노드를 추가하는 경우
       //이 로직은 더좋은 로직이 있을수 있다. 전체적인 흐름차원에서 어레이 리스트랑 뭐가 다른지 비교차원 접근해보자
            Node newNode = new Node(input);
            
            if(lastReturned == null){//처음위치 추가//한번도 next메소드 실행 안한상태
                newNode.next = next;//원래 헤드를 추가한 노드의 네스트로 지정
                next.prev = newNode;//추가한 노드를 원래 헤드의 이전 노드로 지정
                head= newNode;//추가노드를 헤드로 지정
            } else {//lastReturned가 설정되었다면 중간 또는 끝에 추가하는경우
                lastReturned.next = newNode;
                newNode.prev = lastReturned;
                if(next != null) {//마지막까지 탐색을 안했다면
	                newNode.next = next;
	                next.prev = newNode;
                }else {//마지막까지 탐색을 했다면
                	tail = newNode;
                }
            }
            lastReturned = newNode;
            nextIndex++;
            size++;
        }
         
        public void remove() {//단방향 연결리스트의 단점을 보완함 node메소드를 통해 탐색필요없어짐 왜냐면 prev로 바로 찾아가니까
    		//if (lastReturned == null){
    	    if (nextIndex == 0) {//네스트 메소드 한번도 호출안한상태//삭제할것이 없음
    	        throw new IllegalStateException();
    	    }
    	    Node n = lastReturned.next;
    	    Node p = lastReturned.prev;
    	
    	    if (p == null) {//next메소드 한번실행후 맨앞에것을 삭제할경우
    	        head = n;
    	        head.prev = null;//연결끊기
    	        lastReturned = null;
    	    }else {//중간과 끝의 삭제경우
    	        p.next = next;
    	        lastReturned.prev = null;//연결끊기
    	    }
    	    if (n == null) {//맨끝에것을 삭제할경우 null이됨
    	        tail = p;
    	        tail.next = null;
    	    }else {//처음과 중간의 삭제경우
    	        n.prev = p;
    	    }
    	    if (next == null) {//맨끝에것을 삭제할경우 null이됨
    	        lastReturned = tail;
    	    }else {//처음과 중간의 삭제경우
    	        lastReturned = next.prev;
    	    }
    	    size--;
    	    nextIndex--;
    	}
    	}
	}