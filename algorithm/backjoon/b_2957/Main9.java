package b_2957;

import java.util.Scanner;
public class Main9 {
   static int[] binaryTree;
   static int c = 0;
   
   private static int insert(int num, int idx) {
       c++;
       if (num < binaryTree[idx]) { // 새로 들어온 숫자가 노드보다 작다면
           if (binaryTree[idx * 2] == 0) { // 왼쪽 자식이 없다면
               binaryTree[idx * 2] = num;
           } else { //왼쪽 자식이 있으므로 왼쪽자식을 기준으로 함수 호출
               insert(num, idx * 2);
           }
       } else if (num > binaryTree[idx]) { // 새로 들어온 숫자가 노드보다 크다면
           if (binaryTree[idx * 2 + 1] == 0) { // 오른쪽 자식이 없다면
               binaryTree[idx * 2 + 1] = num;
           } else { //오른쪽 자식이 있으므로 오른쪽 자식을 기준으로 함수 호출
               insert(num, idx * 2 + 1);
           }
       }
       return c;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
       int N = sc.nextInt(); // 수열의 크기
       
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


