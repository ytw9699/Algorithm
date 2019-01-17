package search;

public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree(){
		root = new Node();//��Ʈ ��带 ����
	}
	
	public Node rootReturn(){
        return root;
   }
	 
	 public Node MakeNode(Object input){//�Ӹ��� �߰�
	       
	        Node newNode = new Node(input);//��带 ����
	        
	        return newNode;
	   }
	 
	 public void MakeLeftSubTree(Node main, Node sub){
		 main.left = sub;
}

	public void MakeRightSubTree(Node main, Node sub) {
		main.right = sub;
	}
	
	public Object GetData(Node temp){//Ư�� ������Ʈ �� ��ȸ
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
	
	public void InorderTraverse(Node temp)//������ȸ
	{
		if(temp == null) {   // temp�� NULL�̸� ��� Ż��!
			return;
	  }
		InorderTraverse(temp.left); 
		System.out.println(temp.data);
		InorderTraverse(temp.right); 
	}
	public void PreorderTraverse(Node temp)//������ȸ
	{
		if(temp == null) {   // temp�� NULL�̸� ��� Ż��!
			return;
	   }
		System.out.println(temp.data);
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
		System.out.println(temp.data);
	}


public void BSTInsert(Object data){
	Node pNode = null;    // parent node
	Node cNode = root;    // current node
	Node nNode = null;    // new node
	// ���ο� ��尡 �߰��� ��ġ�� ã�´�.
	if(root.data == null)// �� ��尡 ��Ʈ �����,
	{	
	root.data = data;
	return;
	}
	
	while(cNode != null) {
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

//Ʈ���� ���̸� ����Ͽ� ��ȯ
public int GetHeight(Node Cnode)
{
	int leftH;		// left height
	int rightH;		// right height

	if(Cnode == null)
		return 0;

	// ���� ���� Ʈ�� ���� ���
	leftH = GetHeight(GetLeftSubTree(Cnode));

	// ������ ���� Ʈ�� ���� ���
	rightH = GetHeight(GetRightSubTree(Cnode));

	// ū ���� ���̸� ��ȯ�Ѵ�.
	if(leftH > rightH)
		return leftH + 1;
	else
		return rightH + 1;
}

//�� ���� Ʈ���� ������ ���� ��ȯ
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
