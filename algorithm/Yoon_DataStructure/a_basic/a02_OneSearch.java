package a_basic;

public class a02_OneSearch {
	
static boolean OneSearch(int[] arr, int n) {
		
		return (arr[n] == 1) ? true:false;//�߽��̵Ǵ� ����
		//n�� ������� �Ȱ��� �ð��� �ҿ�ȴ�. 
	}
public static void main(String[] args) {
	
		int [] arr = {1,2,3,4,5,6,7,8,9,10};

		System.out.println(OneSearch(arr,0));//true
		System.out.println(OneSearch(arr,1));//false
	}
}
