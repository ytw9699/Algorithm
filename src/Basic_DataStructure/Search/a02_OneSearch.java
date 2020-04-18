package Search;

public class a02_OneSearch {
	
	static boolean OneSearch(int[] arr, int n) {
			
			return (arr[n] == 1) ? true:false;//중심이되는 연산
			//n에 관계없이 똑같은 시간이 소요된다. 
	}

	public static void main(String[] args) {
	
		int [] arr = {1,2,3,4,5,6,7,8,9,10};

		System.out.println(OneSearch(arr,0));//true
		System.out.println(OneSearch(arr,1));//false
	}
}
