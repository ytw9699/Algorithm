package b_2957;

import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	int arrCount = sc.nextInt();
	
	int arr[] = new int[arrCount];
	
	for(int i =0; i<arrCount; i++){
		arr[i]=sc.nextInt();
	}
	
	BinarySearchTree2 sTree = new BinarySearchTree2();
	
	for(int k=0; k<arrCount; k++) {
		sTree.BSTInsert(arr[k]);//데이터 추가
	}
	}
}
 class BinarySearchTree2 {
	Node root;
	int outputCount=0;
	
	public BinarySearchTree2(){
		root = new Node();//루트 노드를 생성
	}
	 
	 public Node MakeNode(Object input){
	       
	        Node newNode = new Node(input);//노드를 생성
	        
	        return newNode;
	   }
	 
	 public void MakeLeftSubTree(Node main, Node sub){
		 main.left = sub;
	 }

	public void MakeRightSubTree(Node main, Node sub) {
		main.right = sub;
	}
	
	public Node GetLeftSubTree(Node temp)
	{
		return temp.left;
	}
	public Node GetRightSubTree(Node temp)
	{
		return temp.right;
	}
	
	public void BSTInsert(Object data){
		Node pNode = null;    // parent node
		Node cNode = root;    // current node
		Node nNode = null;    // new node
		
		if(root.data == null)// 새 노드가 루트 노드라면,
		{	
		root.data = data;
		System.out.println(outputCount);
		return;
		}
		
	while(cNode != null) {// 새로운 노드가 추가될 위치를 찾는다.
		outputCount++;
		if(data == cNode.data) {//키의 중복을 허용하지 않음
			return;    
		}
		pNode = cNode;
		
		if((int)cNode.data > (int)data)
			cNode = cNode.left;
		else
			cNode = cNode.right;
	}
	// pNode의 서브 노드에 추가할 새 노드의 생성
	nNode = MakeNode(data);    // 새 노드의 생성
	// pNode의 서브 노드에 새 노드를 추가
	if((int)data < (int)pNode.data)
		MakeLeftSubTree(pNode, nNode);
	else
		MakeRightSubTree(pNode, nNode);
	
	System.out.println(outputCount);
	}
	
	public class Node{
	    private Object data;//데이터가 저장될 변수-실제 저장값
	   
	    private Node left;//왼쪽 노드를 가리키는 변수,참조값
	    private Node right;//오른쪽 노드
	    
	    public Node(Object input) {//객체생성 초기화
	        this.data = input;
	        this.left = null;//생성시는 미정
	        this.right = null;
	    }
	    public Node() {
	    }
	}
	}

