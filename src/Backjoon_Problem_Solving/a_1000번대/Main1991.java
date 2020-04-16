package a_1000번대;
import java.util.Scanner;
public class Main1991 {
	public static void main(String[] args) {
		
		int nodes;
		Scanner sc = new Scanner(System.in);
		nodes = sc.nextInt();
		
		String[] makeSubtreeName = new String[nodes];
		
		sc.nextLine();
		
		for(int i=0; i<nodes; i++) {
			makeSubtreeName[i]=sc.nextLine();
		}
		
	BinaryTree BTree = new BinaryTree();//이진트리 생성
	String names[];
	names=makeSubtreeName[0].split(" ");
	BTree.FirstMakeTree(names[0],names[1],names[2]);//첫번째 트리만들기
	
	for(int i=1; i<nodes; i++) {
		names=makeSubtreeName[i].split(" ");
		BTree.MakeTree(names[0],names[1],names[2]);//두번재부터 서브 트리만들기
	}
	
	BTree.PreorderTraverse(BTree.root);//전위순회
	System.out.println();
	BTree.InorderTraverse(BTree.root);//중위순회
	System.out.println();
	BTree.PostorderTraverse(BTree.root);//후위순회
	
	}
}
  class BinaryTree {
	 Node root;//루트노드
	 int size=0;//이진트리의 사이즈
	 Node searchNode = null;
	 
	 public class Node{
	        private Object data;//데이터가 저장될 변수-실제 저장값
	       
	        private Node left;//왼쪽 노드를 가리키는 변수,참조값
	        private Node right;//오른쪽 노드
	        
	        public Node(Object input) {//객체생성 초기화
	            this.data = input;
	            this.left = null;//생성시는 미정
	            this.right = null;
	        }
	 }
	 public void FirstMakeTree(String center, String left, String right){
	       
	        root = new Node(center);
	        Node newNode2 = new Node(left);
	        Node newNode3 = new Node(right);
	        
	        if(!left.equals(".")) {
	        MakeLeftSubTree(root,newNode2);
	        }
	        if(!right.equals(".")) {
	        MakeRightSubTree(root,newNode3);
	        }
	   }
	 public void MakeTree(String center, String left, String right){
	       
	        Node root = Search(center);
	        Node newNode2 = new Node(left);
	        Node newNode3 = new Node(right);
	        if(!left.equals(".")) {
	        MakeLeftSubTree(root,newNode2);
	        }
	        if(!right.equals(".")) {
	        MakeRightSubTree(root,newNode3);
	        }
	        
	   }
		 public Node Search(String name) {
			 SearchNodeStart(root,name);		 
		 	return searchNode;
		 }
	 
	   public void SearchNodeStart(Node temp,String name)//서치 중위순회
		{
			if(temp == null) {   // temp가 NULL이면 재귀 탈출!
				return;
		   }
			SearchNodeStart(temp.left,name);

			if(temp.data.equals(name)) {
			searchNode = temp;
			return;//찾아도 탈출
			}
			SearchNodeStart(temp.right,name); 
		}
	 
	 public void MakeLeftSubTree(Node main, Node sub){
		 main.left = sub;
	 }

	public void MakeRightSubTree(Node main, Node sub) {
		main.right = sub;
	}
	
	public void InorderTraverse(Node temp)//중위순회
	{
		if(temp == null) {   // temp가 NULL이면 재귀 탈출!
			return;
	  }
		InorderTraverse(temp.left); 
		System.out.print(temp.data);
		InorderTraverse(temp.right); 
	}
	public void PreorderTraverse(Node temp)//전위순회
	{
		if(temp == null) {   // temp가 NULL이면 재귀 탈출!
			return;
	   }
		System.out.print(temp.data);
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
		System.out.print(temp.data);
	}
}