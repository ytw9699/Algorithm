package a_�⺻�˰���;
import java.util.Scanner;
// 1, 2, ��, n�� ���� ���մϴ�(����� �Է�).
class p_Difference_01_10_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		System.out.print("a�� ����");
		a = stdIn.nextInt();
		
		do {
			System.out.print("b�� ����");
			b = stdIn.nextInt();
		} while (b < a);
		

		System.out.println("b-a��" +(b-a)+ "�Դϴ�.");
	}
}