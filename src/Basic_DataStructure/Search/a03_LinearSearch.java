package Search;
public class a03_LinearSearch {
	static int LSearch(int arr[], int length, int target)
	{
		int i;
		for(i=0; i<length; i++) {//주변연산자들의 연산횟수는 중심이 되는 연산횟수에 의존적이다
		//위 연산자의 < 와 ++는   밑 if문의 연산자 ==이 true를 반환할때까지 수행되기 때문에 의존적이다.
			if(arr[i]==target)//중심이 되는 연산 //대상이 맞는지 순차적 확인 작업
				return i;    // 찾은 대상의 인덱스 값 반환
		}
		return -1;    // 찾지 못했음을 의미하는 값 반환
	}
	public static void main(String[] args) {
		int arr[]={3, 5, 2, 4, 9};
		int idx;

		idx=LSearch(arr, arr.length, 4);
		if(idx==-1)
			System.out.println("탐색 실패");
		else
			System.out.printf("타겟이 저장된 인덱스: %d \n", idx);
	}
}