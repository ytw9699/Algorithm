package BinarySearch;
public class BinarySearchTreeMain {
	public static void main(String[] args) {
		
	BinarySearchTree sTree = new BinarySearchTree();
	
	sTree.BSTInsert(9);//������ �߰�
	sTree.BSTInsert(1);//������ �߰�
	sTree.BSTInsert(2);//������ �߰�
	sTree.BSTInsert(3);//������ �߰�
	sTree.BSTInsert(4);//������ �߰�
	
	System.out.println(sTree.GetData(sTree.rootReturn()));
	System.out.println(sTree.GetHeightDiff(sTree.rootReturn()));
	//sTree.InorderTraverse(sTree.root);//��� ������ ��ȸ
	sTree.PreorderTraverse(sTree.root);//��� ������ ��ȸ
	//sTree.PostorderTraverse(sTree.root);//��� ������ ��ȸ
	//BinarySearchTree.Node value = sTree.BSTSearch(3);//3�� Ű���� �ش��ϴ� ��� ��ȯ
	//System.out.println(sTree.GetData(value));//����� �����͹�ȯ
	//BinarySearchTree.Node value9 = sTree.BSTSearch(9);//3�� Ű���� �ش��ϴ� ��� ��ȯ
	//System.out.println(sTree.GetData(value9));//����� ������ ��ȯ
	
	}
}


