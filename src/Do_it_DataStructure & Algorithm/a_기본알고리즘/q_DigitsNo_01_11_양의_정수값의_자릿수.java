package a_�⺻�˰���;
import java.util.Scanner;
// ���� �������� �ڸ����� ���Ͽ� ��Ÿ��
class q_DigitsNo_01_11_����_��������_�ڸ��� {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("���� �������� �ڸ����� ���մϴ�.");
		int n;
		do {
			System.out.print("��������");
			n = stdIn.nextInt();
		} while (n <= 0);

		int count = 0; 			// �ڸ���
		while (n > 0) {
			n /= 10; 			// n�� 10���� ����
			count++;
		}
		System.out.println("�� ���� " + count + "�ڸ��Դϴ�.");
	}
}