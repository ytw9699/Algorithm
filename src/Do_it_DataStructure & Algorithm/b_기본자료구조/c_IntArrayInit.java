package b_�⺻�ڷᱸ��;
// ���� �ڷ����� int�� �� �迭 (��ڼ���  5:�迭 �ʱ��ڿ� ����  ������

class c_IntArrayInit {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};	// �迭 �ʱ��ڿ� ����  ����
		//int[] a = new int[] {1,2,3,4,5};//������ ����Ȯ����
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}