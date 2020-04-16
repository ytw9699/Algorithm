package BinarySearch;

public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree(){
		root = new Node();//루트 노드를 생성
	}
	
	public Node rootReturn(){
        return root;
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


public void BSTInsert(Object data){
	Node pNode = null;    // parent node
	Node cNode = root;    // current node
	Node nNode = null;    // new node
	// 새로운 노드가 추가될 위치를 찾는다.
	if(root.data == null)// 새 노드가 루트 노드라면,
	{	
	root.data = data;
	return;
	}
	
	while(cNode != null) {
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
	
}
public Node BSTSearch(int key)
{
	Node cNode = root;// current node
	int cd;    // current data

	while(cNode != null)
	{
		cd = (int)cNode.data;

		if(key == cd)
			return cNode;
		else if(key < cd)
			cNode = GetLeftSubTree(cNode);
		else
			cNode = GetRightSubTree(cNode);
	}
	return null;
}

//트리의 높이를 계산하여 반환
public int GetHeight(Node Cnode)
{
	int leftH;		// left height
	int rightH;		// right height

	if(Cnode == null)
		return 0;

	// 왼쪽 서브 트리 높이 계산
	leftH = GetHeight(GetLeftSubTree(Cnode));

	// 오른쪽 서브 트리 높이 계산
	rightH = GetHeight(GetRightSubTree(Cnode));

	// 큰 값의 높이를 반환한다.
	if(leftH > rightH)
		return leftH + 1;
	else
		return rightH + 1;
}

//두 서브 트리의 높이의 차를 반환
public boolean GetHeightDiff(Node Croot)
{
	int lsh;    // left sub tree height
	int rsh;    // right sub tree height
	
	if(Croot == null)
		return true;

	lsh = GetHeight(GetLeftSubTree(Croot));
	rsh = GetHeight(GetRightSubTree(Croot));
	
	int heightDiff = lsh - rsh;
	
	if (Math.abs(heightDiff) > 1) {
		return false;
	}
	else {
		return GetHeightDiff(GetLeftSubTree(Croot)) && GetHeightDiff(GetRightSubTree(Croot));
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
