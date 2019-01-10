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
		sTree.BSTInsert(arr[k]);//������ �߰�
	}
	}
}
 class BinarySearchTree2 {
	Node root;
	int outputCount=0;
	
	public BinarySearchTree2(){
		root = new Node();//��Ʈ ��带 ����
	}
	 
	 public Node MakeNode(Object input){
	       
	        Node newNode = new Node(input);//��带 ����
	        
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
		
		if(root.data == null)// �� ��尡 ��Ʈ �����,
		{	
		root.data = data;
		System.out.println(outputCount);
		return;
		}
		
	while(cNode != null) {// ���ο� ��尡 �߰��� ��ġ�� ã�´�.
		outputCount++;
		if(data == cNode.data) {//Ű�� �ߺ��� ������� ����
			return;    
		}
		pNode = cNode;
		
		if((int)cNode.data > (int)data)
			cNode = cNode.left;
		else
			cNode = cNode.right;
	}
	// pNode�� ���� ��忡 �߰��� �� ����� ����
	nNode = MakeNode(data);    // �� ����� ����
	// pNode�� ���� ��忡 �� ��带 �߰�
	if((int)data < (int)pNode.data)
		MakeLeftSubTree(pNode, nNode);
	else
		MakeRightSubTree(pNode, nNode);
	
	System.out.println(outputCount);
	}
	
	public class Node{
	    private Object data;//�����Ͱ� ����� ����-���� ���尪
	   
	    private Node left;//���� ��带 ����Ű�� ����,������
	    private Node right;//������ ���
	    
	    public Node(Object input) {//��ü���� �ʱ�ȭ
	        this.data = input;
	        this.left = null;//�����ô� ����
	        this.right = null;
	    }
	    public Node() {
	    }
	}
	}

