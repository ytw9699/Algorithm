package b_recursive;
	public class b_04_RecursiveBinarySearch {
	static int BSearchRecur(int ar[], int first, int last, int target) {
	
	int mid;
	if(first > last)//재귀 탈출 조건
		return -1;    // -1의 반환은 탐색의 실패를 의미
	mid = (first+last) / 2;    // 탐색대상의 중앙을 찾는다.

	if(ar[mid] == target)
		return mid;    // 검색된 타겟의 인덱스 값 반환
	else if(target < ar[mid])
		return BSearchRecur(ar, first, mid-1, target);//자기자신을 다시 호출
	else
		return BSearchRecur(ar, mid+1, last, target);//자기자신을 다시 호출
	}
		public static void main(String[] args) {
			int arr[] = {1, 3, 5, 7, 9};
			int idx;

			idx = BSearchRecur(arr, 0, arr.length, 7);
			
			if(idx == -1)
				System.out.printf("탐색 실패 \n");
			else
				System.out.printf("타겟 저장 인덱스: %d \n", idx);
	}
	}