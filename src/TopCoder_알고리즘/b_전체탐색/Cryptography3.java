package b_��üŽ��;
import java.util.Arrays;
public class Cryptography3 {
	
	public static void main(String[] args) {
		
		int[] numbers=new int[]{1,2,3};//�Է°�
		System.out.println(encrypt(numbers));//���
		
	}
	public static long encrypt(int[] numbers){
		long temp = 1;
		Arrays.sort(numbers);//���� ����
		numbers[0]++;//���� ���� �ּҰ��� +1���ش�
		
			for( int j = 0; j<numbers.length; j++ ) {
				temp *= numbers[j];//��簪�� ���Ѵ�
			}
			
		return temp;
	}
}		
