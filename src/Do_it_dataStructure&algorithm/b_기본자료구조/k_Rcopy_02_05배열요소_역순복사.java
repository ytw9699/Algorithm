package b_�⺻�ڷᱸ��;
import java.util.Scanner;
// �迭 b�� ��� ��Ҹ� �迭 a�� �������� copy�ϴ� �޼ҵ带 �ۼ��ϼ���.
class k_Rcopy_02_05�迭���_�������� {
	// �迭 b�� ��� ��Ҹ� �迭 a�� �������� ����
	static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[b.length - i - 1];
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a�� ��ڼ��� ��");
		
		int numa = stdIn.nextInt(); // ��ڼ�
		
		int[] a = new int[numa]; // ��ڼ� numa�� �迭
		
		for (int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("b�� ��ڼ��� ��");
		
		int numb = stdIn.nextInt(); // ��ڼ�
		
		int[] b = new int[numb]; // ��ڼ� numb�� �迭
		
		for (int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		rcopy(a, b); // �迭 b�� ��� ��Ҹ� �迭 a�� �������� copy

		System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� �������� �����߽��ϴ�.");
		for (int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
