package a_basic;
public class a03_LinearSearch {
	static int LSearch(int arr[], int length, int target)
	{
		int i;
		for(i=0; i<length; i++) {//�ֺ������ڵ��� ����Ƚ���� �߽��� �Ǵ� ����Ƚ���� �������̴�
		//�� �������� < �� ++��   �� if���� ������ ==�� true�� ��ȯ�Ҷ����� ����Ǳ� ������ �������̴�.
			if(arr[i]==target)//�߽��� �Ǵ� ���� //����� �´��� ������ Ȯ�� �۾�
				return i;    // ã�� ����� �ε��� �� ��ȯ
		}
		return -1;    // ã�� �������� �ǹ��ϴ� �� ��ȯ
	}
	public static void main(String[] args) {
		int arr[]={3, 5, 2, 4, 9};
		int idx;

		idx=LSearch(arr, arr.length, 4);
		if(idx==-1)
			System.out.println("Ž�� ����");
		else
			System.out.printf("Ÿ���� ����� �ε���: %d \n", idx);
	}
}