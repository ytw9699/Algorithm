package Search;
public class a05_BinarySearch2 {//이진탐색
	static int BSearch(int ar[], int len, int target)	{
		int first=0;   // 탐색 대상의 시작 인덱스 값
		int last=len-1;   // 탐색 대상의 마지막 인덱스 값
		int mid; 
		int opCount=0;   // 비교연산의 횟수를 기록

		while(first<=last){
			mid=(first+last)/2;   // 탐색 대상의 중앙을 찾는다. 

			if(target==ar[mid]){//중심이 되는 핵심 연산 -연산횟수와 관련된것
				// 중앙에 저장된 것이 타겟이라면
				return mid;//탐색완료,인덱스 반환
			}
			else  {  // 타겟이 아니라면 
				if(target<ar[mid])   
					last=mid-1;   // 뒷부분을 탐색 대상에서 제외
				else
					first=mid+1;   // 앞부분을 탐색 대상에서 제외
			}
			opCount+=1;   // 비교연산의 횟수 1 증가
		}
		System.out.printf("비교연산 횟수: %d \n", opCount);// 탐색 실패 시 연산횟수 출력
		return -1;   // 찾지 못했을 때 반환되는 값 -1
	} 
	public static void main(String[] args) {
		int arr1[]={0, 1, 5};
		int arr2[]={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int arr3[]={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17};
		int idx;
		
		idx=BSearch(arr1, arr1.length, 18);
		if(idx==-1)
			System.out.println("배열안에 찾고자 하는값이 없습니다.");
		else
			System.out.printf("타겟이 저장된 인덱스: %d \n", idx);
		
		idx=BSearch(arr2, arr2.length, 18);
		if(idx==-1)
			System.out.println("배열안에 찾고자 하는값이 없습니다.");
		else
			System.out.printf("타겟이 저장된 인덱스: %d \n", idx);
		
		idx=BSearch(arr3, arr3.length, 18);
		if(idx==-1)
			System.out.println("배열안에 찾고자 하는값이 없습니다.");
		else
			System.out.printf("타겟이 저장된 인덱스: %d \n", idx);
	}
}
	