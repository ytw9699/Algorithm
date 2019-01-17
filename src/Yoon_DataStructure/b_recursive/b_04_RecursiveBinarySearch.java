package b_recursive;
	public class b_04_RecursiveBinarySearch {
	static int BSearchRecur(int ar[], int first, int last, int target) {
	
	int mid;
	if(first > last)//��� Ż�� ����
		return -1;    // -1�� ��ȯ�� Ž���� ���и� �ǹ�
	mid = (first+last) / 2;    // Ž������� �߾��� ã�´�.

	if(ar[mid] == target)
		return mid;    // �˻��� Ÿ���� �ε��� �� ��ȯ
	else if(target < ar[mid])
		return BSearchRecur(ar, first, mid-1, target);//�ڱ��ڽ��� �ٽ� ȣ��
	else
		return BSearchRecur(ar, mid+1, last, target);//�ڱ��ڽ��� �ٽ� ȣ��
	}
		public static void main(String[] args) {
			int arr[] = {1, 3, 5, 7, 9};
			int idx;

			idx = BSearchRecur(arr, 0, arr.length, 7);
			
			if(idx == -1)
				System.out.printf("Ž�� ���� \n");
			else
				System.out.printf("Ÿ�� ���� �ε���: %d \n", idx);
	}
	}