package b_��üŽ��;

public class Cryptography1 {
	
	public static void main(String[] args) {
		
		int[] input=new int[]{1,2,3};//�Է°�
		System.out.println(maxReturn(input));//���
		
	}
	private static long maxReturn(int[] input) {//������ ����Ǽ��� ���� ū���� ����
		long max = 0;
		long value = 1;
		
		for(int i=0; i<input.length; i++) {
			value=1;
			for(int k=0; k<input.length; k++) {
				if(i == k) {
					value *= (input[k]+1);	//�� ��Ҹ��� �����ư��� 1�� �������� ������
				}else {
					value *= input[k];	//������ ��� ��� ������
				}
			}
			if(value > max) {
				max = value;
			}
		}
		return max;//���� ū ���� ��� ����
	}
}
