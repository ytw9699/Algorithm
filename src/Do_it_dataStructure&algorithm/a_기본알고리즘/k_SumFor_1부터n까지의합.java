package a_�⺻�˰���;
import java.util.Scanner;
// 1, 2, ��, n�� ���� ���մϴ�.
class k_SumFor_1����n�������� {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ �������մϴ�.");
		System.out.print("n�� ����");
		int n = stdIn.nextInt();

		int sum = 0;					// ��

		for (int i = 1; i <= n; i++) {
			sum += i;					// sum�� i�� ���մϴ�.
		}
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		
	}
}