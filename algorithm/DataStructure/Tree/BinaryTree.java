package Tree;

public class BinaryTree {
	
	 public class Node{
	        private Object data;//�����Ͱ� ����� ����-���� ���尪
	       
	        private Node left;//���� ��带 ����Ű�� ����,������
	        private Node right;//������ ���
	        
	        public Node(Object input) {//��ü���� �ʱ�ȭ
	            this.data = input;
	            this.left = null;//�����ô� ����
	            this.right = null;
	        }
	      /*  public String toString(){//����� ���� ���� �������
	            return String.valueOf(this.data);
	        }*/
	    
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
}

	
	
		

	

