package Ch_02_Linked_Lists;
public class Question08 {
	public static void main(String[] args) {
		int list_length = 11;//���� ����Ʈ ũ��
		int k = 3 % list_length; //��ȯ ���� ����
		
		LinkedList cyclelist = new LinkedList();//���� ���� ����Ʈ ����
		
		for (int i = 0; i < list_length; i++) {
			cyclelist.addLast(i);//��� ����
			//System.out.println(cyclelist);
		}
		if (!cyclelist.appendToTail(k)) {//��ȯ���Ḯ��Ʈ ���� - tail�� ��ȯ�������� ����
			System.out.println("No Cycle.");
		}
		Object result = cyclelist.FindBeginning();
		
		if(result == null){//��ȯ ������ �´� �˻�
			System.out.println("No Cycle.");
		}else {
			System.out.println(result);//��ȯ ���� �κ� ��� ��ȯ
		}
	}
}
