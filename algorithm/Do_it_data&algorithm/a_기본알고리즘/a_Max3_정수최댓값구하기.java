package a_�⺻�˰���;

import java.util.Scanner;

class a_Max3_�����ִ񰪱��ϱ� {// 3���� �������� �Է��ϰ� �ִ��� ���մϴ�.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�� ������ �ִ��� ���մϴ�.");
		
		System.out.print("a�� ����");	
		int a = stdIn.nextInt();//Ű���忡�� �Է��� ���� �������� ��
		
		System.out.print("b�� ����");	
		int b = stdIn.nextInt();
		
		System.out.print("c�� ����");	
		int c = stdIn.nextInt();
		
		int max = a;	
		
		if (b > max) 
			max = b;
		
		if (c > max) 
			max = c;

		System.out.println("�ִ��� " + max + "�Դϴ�.");
	}
}
