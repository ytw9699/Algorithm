package b_2957;

import java.util.Scanner;
public class Main시간초과 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	int arrCount = sc.nextInt();
	
	int arr[] = new int[arrCount];
	
	for(int i =0; i<arrCount; i++){
		arr[i]=sc.nextInt();
	}

	BinarySearchTree sTree = new BinarySearchTree();
	
	for(int k=0; k<arrCount; k++) {
		sTree.BSTInsert(arr[k],sTree.root);//데이터 추가
		System.out.println(sTree.outputCount);
	}
	}
}
 class BinarySearchTree {
	Node root;
	int outputCount=0;
	
	public BinarySearchTree(){
		root = new Node();//루트 노드를 생성
	}
	public void BSTInsert(Object data,Node cNode){
		Node nNode = null;    // new node
		if(root.data == null)// 새 노드가 루트 노드라면,
		{	
		root.data = data;
		return;
		}
		
		outputCount++;
		if((int)data<(int)cNode.data){
			if(cNode.left == null){
				nNode = new Node(data);    // 새 노드의 생성
				cNode.left = nNode;
			}else {
				BSTInsert(data,cNode.left);
			}
		}
		else {
			if(cNode.right == null){
				nNode = new Node(data);     // 새 노드의 생성
				cNode.right = nNode;
			}else {
				BSTInsert(data,cNode.right);
			}
		}
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

