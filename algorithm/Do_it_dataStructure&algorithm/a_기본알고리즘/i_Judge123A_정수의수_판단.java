package a_�⺻�˰���;
import java.util.Scanner;
// �Է� ���� �������� ���/����/0�� �Ǵ�

class i_Judge123A_�����Ǽ�_�Ǵ� {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("1~3������ ������ �Է��ϼ���.��");
		int n = stdIn.nextInt();

		if (n == 1)
			System.out.println("�� ���� 1�Դϴ�.");
		else if (n == 2)
			System.out.println("�� ���� 2�Դϴ�.");
		else if (n == 3)
			System.out.println("�� ���� 3�Դϴ�.");
		else
			System.out.println("1~3�� ������ ���� �ƴմϴ�");
	}
}
