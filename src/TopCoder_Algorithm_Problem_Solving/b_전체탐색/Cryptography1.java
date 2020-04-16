package b_전체탐색;

public class Cryptography1 {
	
	public static void main(String[] args) {
		
		int[] input=new int[]{1,2,3};//입력값
		System.out.println(maxReturn(input));//출력
		
	}
	private static long maxReturn(int[] input) {//모든곱의 경우의수중 가장 큰것을 리턴
		long max = 0;
		long value = 1;
		
		for(int i=0; i<input.length; i++) {
			value=1;
			for(int k=0; k<input.length; k++) {
				if(i == k) {
					value *= (input[k]+1);	//각 요소마다 번갈아가며 1씩 높은값을 곱해줌
				}else {
					value *= input[k];	//나머지 요소 모두 곱해줌
				}
			}
			if(value > max) {
				max = value;
			}
		}
		return max;//가장 큰 곱의 경우 리턴
	}
}
