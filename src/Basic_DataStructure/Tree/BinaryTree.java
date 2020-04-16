package Tree;

public class BinaryTree {
	
	 public class Node{
	        private Object data;//데이터가 저장될 변수-실제 저장값
	       
	        private Node left;//왼쪽 노드를 가리키는 변수,참조값
	        private Node right;//오른쪽 노드
	        
	        public Node(Object input) {//객체생성 초기화
	            this.data = input;
	            this.left = null;//생성시는 미정
	            this.right = null;
	        }
	      /*  public String toString(){//노드의 값을 쉽게 출력위해
	            return String.valueOf(this.data);
	        }*/
	    
	 }
	 public Node MakeNode(Object input){//머리에 추가
	       
	        Node newNode = new Node(input);//노드를 생성
	        
	        return newNode;
	   }
	 
	 public void MakeLeftSubTree(Node main, Node sub){
		 main.left = sub;
}

	public void MakeRightSubTree(Node main, Node sub) {
		main.right = sub;
	}
	
	public Object GetData(Node temp){//특정 엘리먼트 값 조회
        return temp.data;
    }
	
	public Node GetLeftSubTree(Node temp)
	{
		return temp.left;
	}
	public Node GetRightSubTree(Node temp)
	{
		return temp.right;
	}
	
	public void InorderTraverse(Node temp)//중위순회
	{
		if(temp == null) {   // temp가 NULL이면 재귀 탈출!
			return;
	  }
		InorderTraverse(temp.left); 
		System.out.println(temp.data);
		InorderTraverse(temp.right); 
	}
	public void PreorderTraverse(Node temp)//전위순회
	{
		if(temp == null) {   // temp가 NULL이면 재귀 탈출!
			return;
	   }
		System.out.println(temp.data);
		PreorderTraverse(temp.left); 
		PreorderTraverse(temp.right); 
	}
	public void PostorderTraverse(Node temp)//후위순회
	{
		if(temp == null) {   // temp가 NULL이면 재귀 탈출!
			return;
	   }
		PostorderTraverse(temp.left); 
		PostorderTraverse(temp.right); 
		System.out.println(temp.data);
	}
}

	
	
		

	

