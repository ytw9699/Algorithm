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

		for(i=1; i<n; i++)//i는 1부터시작 맨첫번째 값은 정렬완료된거로 하자.
		{
			temp = arr[i];   // 정렬 대상을 temp에 저장

			for(j=i-1; j>=0 ; j--)
			{
				if(arr[j] > temp) //데이터간 비교 연산
					arr[j+1] = arr[j];//데이터간 이동 연산 // 비교 대상 한 칸씩 계속 뒤로 밀기
				else
					break; // 삽입 위치 찾았으니 탈출!
			}

			arr[j+1] = temp; // 찾은 위치에 정렬 대상 삽입!
		}
	}
}



