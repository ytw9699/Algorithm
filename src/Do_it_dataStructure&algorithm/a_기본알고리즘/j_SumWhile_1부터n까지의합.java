package a_�⺻�˰���;
import java.util.Scanner;
// 1, 2, ��, n�� ���� ���մϴ�.
class j_SumWhile_1����n�������� {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ �������մϴ�.");
		
 		System.out.print("n�� ���� ���� �Է��ϼ��䣺");
 		
		int n = stdIn.nextInt();

		int sum = 0;				// ��
		int i = 1;

		while (i <= n) {			// i�� n ���ϸ� �ݺ��մϴ�.
			sum += i;				// sum�� i�� ���մϴ�.
			i++;					// i ���� 1��ŭ ������ŵ�ϴ�.
		}
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		System.out.println("i�� ���� " + i + "��(��) �Ǿ����ϴ�.");
	}
}