package a_기본알고리즘;

import java.util.Scanner;
//알고리즘: 문제를 해결하기 위한 것으로 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합
class a_Max3_정수최댓값구하기 {// 3개의 정숫값을 입력하고 최댓값을 구합니다.
	public static void main(String[] args) {
		int[] score = new int[5];
		int k = 1;

		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;   // score[2] = 70
		score[3] = 80;
		score[4] = 90;

		int tmp = score[k+2] + score[4];  // int tmp = score[3] + score[4]

	    // for문으로 배열의 모든 요소를 출력한다.
		for(int i=0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n",i, score[i]);		
		}

		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n",7,score[7]); //index의 범위를 벗어난 값
		
		
	}
}
