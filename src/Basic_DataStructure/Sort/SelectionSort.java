package Sort;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {3, 2, 4, 1};

		SelSort(arr, arr.length);

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	static void SelSort(int[] arr, int n)
	{
		int i, j;
		int temp;//�ӽ�
		int min;
		
		for(i=0; i<n-1; i++) {
			 min = i;
			for(j=i+1; j<n; j++) {// �ּҰ� Ž��
				if(arr[min] > arr[j]) {//���������� �񱳿���
					min = j;
				}
			}
			/* ��ȯ */
			temp = arr[i];
			arr[i]= arr[min];
			arr[min] = temp;
		}
	}
}




