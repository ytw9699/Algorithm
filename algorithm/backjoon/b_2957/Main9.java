package b_2957;

import java.util.Scanner;
public class Main9 {
   static int[] binaryTree;
   static int c = 0;
   
   private static int insert(int num, int idx) {
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
       return c;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
       int N = sc.nextInt(); // ������ ũ��
       
       binaryTree = new int[30000];
       
       String[] count = new String[N];
       
       for (int i = 1; i <= N; i++) {
           int num = sc.nextInt();
           if (i == 1) {
               binaryTree[1] = num;
               sb.append(c+" ");
           } else {
        	   int appends = insert(num, 1);
        	   sb.append(appends+" ");
        	   
        	   count = sb.toString().split(" ");
           }
       }
       for(int k =0; k<N; k++) {
			System.out.println(count[k]);
          }
       sc.close();
   }
}


