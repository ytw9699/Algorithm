package b_전체탐색;
public class Cryptography2 {
	
	public static void main(String[] args) {
		
		int[] numbers=new int[]{1,2,3};//입력값
		System.out.println(encrypt(numbers));//출력
		
	}
	
	public static long encrypt(int[] numbers){
		long ans = 0;
		long temp = 1;
		
		for(int i = 0; i<numbers.length; i++ ){
			
			temp=1;
			
			for( int j = 0; j<numbers.length; j++ ) {
				if( i ==j )
					temp *= (numbers[j] + 1);//각 요소마다 번갈아가며 1씩 높은값을 곱해줌
				else 
				temp *= numbers[j];//나머지 요소 모두 곱해줌
			}
				ans = Math.max(ans, temp);//최대값을 갱신
			}
		return ans;//가장 큰 곱의 경우 리턴
	}
}		
