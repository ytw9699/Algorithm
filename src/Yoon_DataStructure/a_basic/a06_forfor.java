package a_basic;
public class a06_forfor {//��ø for��
	static String forSearch(int ar[])	{
		int count = 0;//����Ƚ��
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				count++;//����Ƚ�� ����
				if(ar[i]+ar[j]>100) { //�߽��� �Ǵ� ����!
				return "ar["+i+"]+ar["+j+"]�� ���� 100�� �ѽ��ϴ�";
				}
			}
		}
		System.out.println("�񱳿���Ƚ��="+count+"ȸ�Դϴ�.");//81
		return "�迭 �� ���ҵ��� 100�� ���� �Ѵ� ������ �����ϴ�.";
	}
	public static void main(String[] args) {
		int arr[]={1, 3, 5, 7, 9, 12, 21, 23, 47};
		
		System.out.println(forSearch(arr));
	}
}