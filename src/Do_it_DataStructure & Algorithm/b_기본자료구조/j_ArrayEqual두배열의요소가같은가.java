package b_�⺻�ڷᱸ��;
import java.util.Scanner;	
// �� �迭�� �������� �Ǵ�
class j_ArrayEqual�ι迭�ǿ�Ұ������� {
	// �� �迭 a, b�� ��� ��Ұ� ������?
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�迭 a�� ��ڼ���");
		int na = stdIn.nextInt();		// �迭 a�� ��ڼ�

		int[] a = new int[na];			// ��ڼ��� na�� �迭

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		System.out.print("�迭 b�� ��ڼ���");
		int nb = stdIn.nextInt();		// �迭 b�� ��ڼ�

		int[] b = new int[nb];			// ��ڼ��� nb�� �迭

		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		System.out.println("�迭 a�� b�� " + 
								 (equals(a, b) ? "�����ϴ�." : "���� �ʽ��ϴ�."));
	}
}