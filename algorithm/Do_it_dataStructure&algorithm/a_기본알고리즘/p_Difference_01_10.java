package a_�⺻�˰���;
import java.util.Scanner;
// ���� b���� ���� a�� �� ���� ���մϴ�(b > a�� �ǵ��� �Է� ����)
class p_Difference_01_10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a�� ����");
		int a = stdIn.nextInt();

		int b=0;
		while (true) {
			System.out.print("b�� ����");
			b = stdIn.nextInt();
			if (b > a) {
				break;
			}
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}

		System.out.println("b - a�� " + (b - a) + "�Դϴ�.");
	}
}