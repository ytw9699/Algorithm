package a_�⺻�˰���;

import java.util.Scanner;
//3���� ���� �ּڰ��� ���Ͽ� ���
class d_Min3_01_02�������ּҰ� {
// a, b, c�� �ּڰ��� ���Ͽ� ��ȯ
static int min3(int a, int b, int c) {
   int min = a;         			// �ּڰ�
   
   if (b < min) 
	   min = b;
   
   if (c < min) 
	   min = c;

   return min;
}

public static void main(String[] args) {
   Scanner stdIn = new Scanner(System.in);
   int a, b, c;

   System.out.println("�� ������ �ּڰ��� ���մϴ�.");
   
   System.out.print("a�� ����");  
   a = stdIn.nextInt();
   
   System.out.print("b�� ����");  
   b = stdIn.nextInt();
   
   System.out.print("c�� ����");  
   c = stdIn.nextInt();

   int min = min3(a, b, c);   	// a, b, c�� �ּڰ�

   System.out.println("�ּڰ��� " + min + "�Դϴ�.");
}
}