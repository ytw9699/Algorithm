package b_2957;

import java.util.Scanner;
public class Main8 {
   static int[] binaryTree = new int[300001];
   static int c = 0;

   private static void insert(int num, int idx) {
       c++;
       if (num < binaryTree[idx]) { // ���� ���� ���ڰ� ��庸�� �۴ٸ�
           if (binaryTree[idx * 2] == 0) { // ���� �ڽ��� ���ٸ�
               binaryTree[idx * 2] = num;
           } else { //���� �ڽ��� �����Ƿ� �����ڽ��� �������� �Լ� ȣ��
               insert(num, idx * 2);
           }
       } else if (num > binaryTree[idx]) { // ���� ���� ���ڰ� ��庸�� ũ�ٸ�
           if (binaryTree[idx * 2 + 1] == 0) { // ������ �ڽ��� ���ٸ�
               binaryTree[idx * 2 + 1] = num;
           } else { //������ �ڽ��� �����Ƿ� ������ �ڽ��� �������� �Լ� ȣ��
               insert(num, idx * 2 + 1);
           }
       }
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt(); // ������ ũ��
       for (int i = 1; i <= N; i++) {
           int num = sc.nextInt();
           if (i == 1) {
               binaryTree[1] = num;
           } else {
               insert(num, 1);
           }
           System.out.println(c);
       }
       sc.close();
   }
}


