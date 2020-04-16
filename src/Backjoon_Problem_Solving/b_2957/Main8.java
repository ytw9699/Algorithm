﻿package b_2957;

import java.util.Scanner;
public class Main8 {
   static int[] binaryTree = new int[300001];
   static int c = 0;

   private static void insert(int num, int idx) {
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
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt(); // 수열의 크기
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


