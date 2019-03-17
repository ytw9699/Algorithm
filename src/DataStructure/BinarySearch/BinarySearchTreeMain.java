package BinarySearch;
public class BinarySearchTreeMain {
	public static void main(String[] args) {
		
	BinarySearchTree sTree = new BinarySearchTree();
	
	sTree.BSTInsert(9);//데이터 추가
	sTree.BSTInsert(1);//데이터 추가
	sTree.BSTInsert(2);//데이터 추가
	sTree.BSTInsert(3);//데이터 추가
	sTree.BSTInsert(4);//데이터 추가
	
	System.out.println(sTree.GetData(sTree.rootReturn()));
	System.out.println(sTree.GetHeightDiff(sTree.rootReturn()));
	//sTree.InorderTraverse(sTree.root);//모든 데이터 순회
	sTree.PreorderTraverse(sTree.root);//모든 데이터 순회
	//sTree.PostorderTraverse(sTree.root);//모든 데이터 순회
	//BinarySearchTree.Node value = sTree.BSTSearch(3);//3번 키값에 해당하는 노드 반환
	//System.out.println(sTree.GetData(value));//노드의 데이터반환
	//BinarySearchTree.Node value9 = sTree.BSTSearch(9);//3번 키값에 해당하는 노드 반환
	//System.out.println(sTree.GetData(value9));//노드의 데이터 반환
	
	}
}


