package b_�⺻�ڷᱸ��;
import java.util.Scanner;
// �迭 a�� ����� ���� ���
class i_SumOf_02_03�迭����հ� {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return (sum);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("��ڼ��£�");
		int num = stdIn.nextInt();	 // ��ڼ�

		int[] a = new int[num]; 	// ���̰� num�� �迭

		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}

		System.out.println("�� ����� �հ�� " + sumOf(a) + "�Դϴ�.");
	}
}
