package b_�⺻�ڷᱸ��;
// 1,000 ������ �Ҽ��� ����(���� 1)
class n_PrimeNumber_1000������_�Ҽ����� {
	
	public static void main(String[] args) {
		int counter = 0;			// �������� Ƚ��

		for (int n = 2; n <= 1000; n++) {
			
			int i;
			
			for (i = 2; i < n; i++) {
				counter++;
				if (n % i == 0)		// n�� i�� ����������� �Ҽ��� �ƴ�
					break;			// �� �̻��� �ݺ��� ���ʿ�
			}
			//System.out.println("i="+i);
			//System.out.println("n="+n);
			if (n == i) {		// ���������� ����������� �ʴ´ٸ�
				System.out.println(n);
			}
		}
		
		System.out.println("�������� ������ Ƚ����" + counter);//78000
	}
	
}