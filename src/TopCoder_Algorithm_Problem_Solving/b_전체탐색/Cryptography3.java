package b_전체탐색;
import java.util.Arrays;
public class Cryptography3 {
	
	public static void main(String[] args) {
		
		int[] numbers=new int[]{1,2,3};//입력값
		System.out.println(encrypt(numbers));//출력
		
	}
	public static long encrypt(int[] numbers){
		long temp = 1;
		Arrays.sort(numbers);//먼저 정렬
		numbers[0]++;//가장 작은 최소값을 +1해준다
		
			for( int j = 0; j<numbers.length; j++ ) {
				temp *= numbers[j];//모든값을 곱한다
			}
			
		return temp;
	}
}		
