package a_1158;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	     int n;//원형 연결 리스트 크기  N 은 전체 사람 수
	     int m;//M번째 사람마다 제거
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		circular_linked_list cyclelist = new circular_linked_list();//원형 연결  리스트 생성
		
		for (int i = 1; i <= n; i++) {
			cyclelist.addLast(i);//노드 생성
		}
		cyclelist.startDelete(n,m);//삭제 시작
	}
}

 class circular_linked_list {//원현 연결 리스트
     Node head;// 첫번째 노드를 가리키는 필드,변수,참조값
     Node tail;// 마지막 노드를 가리키는 필드,변수
     int size = 0; // 엘리먼트 갯수
    
     class Node{
    	
         Object data;//데이터가 저장될 변수-실제 저장값
       
         Node next;//다음 노드를 가리키는 변수,참조값
        
        public Node(Object input) {//객체생성 초기화
            this.data = input;
            this.next = null;//생성시는 미정
        }
    }
    public void addFirst(Object input){//머리에 추가
       
        Node newNode = new Node(input);//노드를 생성
        
        newNode.next = head;//새로운 노드의 다음 노드로 해드 지정
        
        head = newNode;//헤드로 새로운 노드를 지정
        size++;
        if(head.next == null){
            tail = head;
            head.next = tail;
            tail.next = head;
        }
        else {
        	tail.next = head;
        }
    }
    
    public void addLast(Object input){//꼬리에 추가
        if(size == 0){//리스트의 노드가 하나도 없다면 첫번째 노드를 추가하는 메소드를 사용.
            addFirst(input);
        } else {//기존 노드가 하나라도 있다면 
        	Node newNode = new Node(input);
        	
            tail.next = newNode;//마지막 노드의 다음 노드로 생성한 노드를 지정.
           
            tail = newNode; //마지막 노드를 갱신.
            
            tail.next = head;
           
            size++;//엘리먼트 개수 1 증가
        }
    }
    
    public int size(){//리스트가 가진 데이터의수
        return size;
    }

	public void startDelete(int n, int m) {//조세퍼스 삭제 시작
		
		StringBuilder sb;
		sb = new StringBuilder();
        sb.append("<");
        
		int[] arr = new int[n];
		int i=0;
		Node currentNode = null;
		
		while(size > 0) {
			if(size() == n) {
				currentNode = head;
			}
			if(m == 1) {
				for(int b=1; b < size(); b++) {
				currentNode = currentNode.next;
				}
			}
			else if(m > 2){
				for(int j=1; j<m-1; j++) {
					currentNode = currentNode.next;
				}
			}
				Node todoDeleted = currentNode.next;
				Object returnData = todoDeleted.data;
				if(todoDeleted == tail){//삭제할려는데이터가 마지막값이라면
		            tail = currentNode;
		            tail.next = head;
		         }
				else {
					currentNode.next = currentNode.next.next;
					if(todoDeleted == head) {//삭제할려는 데이터가 헤드라면
						head = currentNode.next;
					}
				}
				currentNode = currentNode.next;
				size--;
				arr[i++] = (int)returnData;
				
			}
		for(int k=0; k<n; k++) {
			sb.append(arr[k]+", ");
			//System.out.println(k+"="+arr[k]);
		}
		System.out.println(sb.toString().substring(0,sb.length()-2)+">");
	}
 }	
