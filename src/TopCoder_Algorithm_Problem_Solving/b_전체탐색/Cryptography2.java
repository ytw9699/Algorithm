package b_��üŽ��;
public class Cryptography2 {
	
	public static void main(String[] args) {
		
		int[] numbers=new int[]{1,2,3};//�Է°�
		System.out.println(encrypt(numbers));//���
		
	}
	
	public static long encrypt(int[] numbers){
		long ans = 0;
		long temp = 1;
		
		for(int i = 0; i<numbers.length; i++ ){
			
			temp=1;
			
			for( int j = 0; j<numbers.length; j++ ) {
				if( i ==j )
					temp *= (numbers[j] + 1);//�� ��Ҹ��� �����ư��� 1�� �������� ������
				else 
				temp *= numbers[j];//������ ��� ��� ������
			}
				ans = Math.max(ans, temp);//�ִ밪�� ����
			}
		return ans;//���� ū ���� ��� ����
	}
}		
