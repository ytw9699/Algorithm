package a_1991;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		int nodes;
		Scanner sc = new Scanner(System.in);
		nodes = sc.nextInt();
		
		String[] makeSubtreeName = new String[nodes];
		
		sc.nextLine();
		
		for(int i=0; i<nodes; i++) {
			makeSubtreeName[i]=sc.nextLine();
		}
		
	BinaryTree BTree = new BinaryTree();//����Ʈ�� ����
	String names[];
	names=makeSubtreeName[0].split(" ");
	BTree.FirstMakeTree(names[0],names[1],names[2]);//ù��° Ʈ�������
	
	for(int i=1; i<nodes; i++) {
		names=makeSubtreeName[i].split(" ");
		BTree.MakeTree(names[0],names[1],names[2]);//�ι������ ���� Ʈ�������
	}
	
	BTree.PreorderTraverse(BTree.root);//������ȸ
	System.out.println();
	BTree.InorderTraverse(BTree.root);//������ȸ
	System.out.println();
	BTree.PostorderTraverse(BTree.root);//������ȸ
	
	}
}
  class BinaryTree {
	 Node root;//��Ʈ���
	 int size=0;//����Ʈ���� ������
	 Node searchNode = null;
	 
	 public class Node{
	        private Object data;//�����Ͱ� ����� ����-���� ���尪
	       
	        private Node left;//���� ��带 ����Ű�� ����,������
	        private Node right;//������ ���
	        
	        public Node(Object input) {//��ü���� �ʱ�ȭ
	            this.data = input;
	            this.left = null;//�����ô� ����
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
	 
	   public void SearchNodeStart(Node temp,String name)//��ġ ������ȸ
		{
			if(temp == null) {   // temp�� NULL�̸� ��� Ż��!
				return;
		   }
			SearchNodeStart(temp.left,name);

			if(temp.data.equals(name)) {
			searchNode = temp;
			return;//ã�Ƶ� Ż��
			}
			SearchNodeStart(temp.right,name); 
		}
	 
	 public void MakeLeftSubTree(Node main, Node sub){
		 main.left = sub;
	 }

	public void MakeRightSubTree(Node main, Node sub) {
		main.right = sub;
	}
	
	public void InorderTraverse(Node temp)//������ȸ
	{
		if(temp == null) {   // temp�� NULL�̸� ��� Ż��!
			return;
	  }
		InorderTraverse(temp.left); 
		System.out.print(temp.data);
		InorderTraverse(temp.right); 
	}
	public void PreorderTraverse(Node temp)//������ȸ
	{
		if(temp == null) {   // temp�� NULL�̸� ��� Ż��!
			return;
	   }
		System.out.print(temp.data);
		PreorderTraverse(temp.left); 
		PreorderTraverse(temp.right); 
	}
	public void PostorderTraverse(Node temp)//������ȸ
	{
		if(temp == null) {   // temp�� NULL�̸� ��� Ż��!
			return;
	   }
		PostorderTraverse(temp.left); 
		PostorderTraverse(temp.right); 
		System.out.print(temp.data);
	}
}