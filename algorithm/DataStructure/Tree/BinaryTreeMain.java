package Tree;

public class BinaryTreeMain {
	public static void main(String[] args) {
		
	BinaryTree BTree = new BinaryTree();
	
	BinaryTree.Node node1 = BTree.MakeNode(1);
	BinaryTree.Node node2 = BTree.MakeNode(2);
	BinaryTree.Node node3 = BTree.MakeNode(3);
	BinaryTree.Node node4 = BTree.MakeNode(4);

	BTree.MakeLeftSubTree(node1, node2);
	BTree.MakeLeftSubTree(node2, node4);
	BTree.MakeRightSubTree(node1, node3);
		
	//System.out.println(BTree.GetData(node1));
	//System.out.println(BTree.GetData(BTree.GetLeftSubTree(node1)));
	//System.out.println(BTree.GetData(BTree.GetRightSubTree(node1)));
	//System.out.println(BTree.GetData(BTree.GetLeftSubTree(BTree.GetLeftSubTree(node1))));

	BTree.InorderTraverse(node1);
	//BTree.PreorderTraverse(node1);
	//BTree.PostorderTraverse(node1);
	
	}
}
