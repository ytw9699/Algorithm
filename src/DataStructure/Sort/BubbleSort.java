package Sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = {3, 2, 4, 1};

		BubbleSort(arr, arr.length);

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	static void BubbleSort(int[] arr, int n)
	{
		int i, j;
		int temp;//�ӽ�

		for(i=0; i<n-1; i++) {
			for(j=0; j<(n-i)-1; j++) {
				if(arr[j] > arr[j+1]) {//���� �ں��� ũ�ٸ�, �յڸ� �ٲ���
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}





