package a_�⺻�˰���;
import java.util.Scanner;
//1, 2, ��, n�� ���� ���մϴ�  (��1 + 2 + �� + n = 999��� �����)
class l_SumForEx_01_07_1����n�������� {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ����");
		int n = stdIn.nextInt();

		int sum = 0; // ��

		for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum += i; // sum�� i�� ����
		}
		System.out.println(" = " + sum);
	}
}
