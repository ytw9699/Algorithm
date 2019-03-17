package Sort;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {3, 2, 4, 1};

		SelSort(arr, arr.length);

		for(int i=0; i<arr.length; i++) 
			System.out.print(arr[i]);
	}
	static void SelSort(int[] arr, int n) 
	{
		int i, j;
		int temp;

		for(i=1; i<n; i++)//i�� 1���ͽ��� ��ù��° ���� ���ĿϷ�Ȱŷ� ����.
		{
			temp = arr[i];   // ���� ����� temp�� ����

			for(j=i-1; j>=0 ; j--)
			{
				if(arr[j] > temp) //�����Ͱ� �� ����
					arr[j+1] = arr[j];//�����Ͱ� �̵� ���� // �� ��� �� ĭ�� ��� �ڷ� �б�
				else
					break; // ���� ��ġ ã������ Ż��!
			}

			arr[j+1] = temp; // ã�� ��ġ�� ���� ��� ����!
		}
	}
}



