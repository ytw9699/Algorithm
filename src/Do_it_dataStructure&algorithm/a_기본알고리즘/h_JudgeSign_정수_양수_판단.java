package a_�⺻�˰���;
import java.util.Scanner;
// �Է��� �������� ������� �������� 0���� �Ǵ��մϴ�.

class h_JudgeSign_����_���_�Ǵ� {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���.��");
		int n = stdIn.nextInt();

		if (n > 0)
			System.out.println("�� ���� ����Դϴ�.");
		else if (n < 0)
			System.out.println("�� ���� �����Դϴ�.");
		else
			System.out.println("�� ���� 0�Դϴ�.");
	}
}