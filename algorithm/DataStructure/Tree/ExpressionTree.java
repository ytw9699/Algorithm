package Tree;

import java.util.Stack;

public class ExpressionTree {
	
	 public class Node{
	        Object data;//�����Ͱ� ����� ����-���� ���尪
	       
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
	
	public Node MakeExpTree(char exp[]){
		Stack<Node> st = new Stack();
		Node temp;

		int expLen = exp.length;
		int i;

		for(i=0; i<expLen; i++)
		{
			if(Character.isDigit(exp[i]))// �ǿ����ڶ��,���ڶ��
			{
				temp = MakeNode(exp[i]);
			}
			else	// �����ڶ��			
			{
				temp = MakeNode(exp[i]);
				MakeRightSubTree(temp, st.pop());
				MakeLeftSubTree(temp, st.pop());
			}

			st.push(temp);
		}

		return st.pop();
	}
	
	public int EvaluateExpTree(Node temp){
		int op1, op2;
		
		if(GetLeftSubTree(temp) == null && GetRightSubTree(temp)==null) {
			return ((Character)GetData(temp)) - '0';
		}
		else
		{
		op1 = EvaluateExpTree(GetLeftSubTree(temp));
		op2 = EvaluateExpTree(GetRightSubTree(temp));
		
		Character value = (Character)temp.data;
		
		switch(value){
		case '+':
			return op1+op2;
		case '-':
			return op1-op2;
		case '*':
			return op1*op2;
		case '/':
			return op1/op2;
		default:
			return 0;
		}
		}
	}
}






//void ShowNodeData(int data)
//{
//	if(0<=data && data<=9)
//		printf("%d ", data);
//	else
//		printf("%c ", data);
//}
//
//void ShowPrefixTypeExp(BTreeNode * bt)
//{
//	PreorderTraverse(bt, ShowNodeData);
//}
//
//void ShowInfixTypeExp(BTreeNode * bt)
//{
//	InorderTraverse(bt, ShowNodeData);
//} 
//
//void ShowPostfixTypeExp(BTreeNode * bt)
//{
//	PostorderTraverse(bt, ShowNodeData);
//}
//	
//	
//		

	

