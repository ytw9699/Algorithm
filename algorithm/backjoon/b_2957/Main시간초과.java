package b_2957;

import java.util.Scanner;
public class Main�ð��ʰ� {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	int arrCount = sc.nextInt();
	
	int arr[] = new int[arrCount];
	
	for(int i =0; i<arrCount; i++){
		arr[i]=sc.nextInt();
	}

	BinarySearchTree sTree = new BinarySearchTree();
	
	for(int k=0; k<arrCount; k++) {
		sTree.BSTInsert(arr[k],sTree.root);//������ �߰�
		System.out.println(sTree.outputCount);
	}
	}
}
 class BinarySearchTree {
	Node root;
	int outputCount=0;
	
	public BinarySearchTree(){
		root = new Node();//��Ʈ ��带 ����
	}
	public void BSTInsert(Object data,Node cNode){
		Node nNode = null;    // new node
		if(root.data == null)// �� ��尡 ��Ʈ �����,
		{	
		root.data = data;
		return;
		}
		
		outputCount++;
		if((int)data<(int)cNode.data){
			if(cNode.left == null){
				nNode = new Node(data);    // �� ����� ����
				cNode.left = nNode;
			}else {
				BSTInsert(data,cNode.left);
			}
		}
		else {
			if(cNode.right == null){
				nNode = new Node(data);     // �� ����� ����
				cNode.right = nNode;
			}else {
				BSTInsert(data,cNode.right);
			}
		}
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

