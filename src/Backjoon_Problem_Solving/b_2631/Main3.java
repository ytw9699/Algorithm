package b_2631;

import java.util.Scanner;
import java.util.Arrays;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//7
		
		int max=0;
		int maxindex=0;
		int[] dp = new int[n];// 인덱스마다 각 증가 수열의 길이//dp 배열은 증가 수열의 길이를 넣을 것이다.
		int[] array = new int[n];// 인덱스마다 각 입력값
		String[] sequence = new String[n];//증가 수열 
		int ans = 0;

		for (int i = 0; i < n; i++) {
		  array[i] = sc.nextInt();
		}
		dp[0] = 1;
		sequence[0] = Integer.toString(array[0]);

		for (int i = 1; i < n; i++) {
		  dp[i] = 1;
		  String temp="";
		  // i 를 기준으로 인덱스 0 에서부터 i-1까지 체크한다 
		    // 길이를 기준
		  for (int j = 0; j < i; j++) {
		    if ( array[i] > array[j] && dp[i] < dp[j] + 1 ) { // 증가 수열 이라면
		      dp[i] = dp[j] + 1;//길이 1증가
		      if(dp[j] + 1 > max) {
		    	  max = dp[j] + 1 ;
		    	  maxindex = i;
		      }
		      
		      temp = temp+Integer.toString(array[j]);
		    }
		  }
		    sequence[i] = temp+array[i];
		  System.out.println(sequence[i]);
		}
		for(int i=1;i<n;i++) {
		  if (ans < dp[i]) {
		    ans = dp[i];
		  }
		}
		for(int i=0;i<n;i++) {
			    System.out.print(dp[i]);
			}
		System.out.println();
		System.out.println(n - ans);
		
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array); 
		
		System.out.println(Arrays.toString(array)); 
		 
		
		String[] output = sequence[maxindex].split("");
		
		int[] idx0 = new int[output.length];
		
		for(int i=0;i<output.length;i++) {
			idx0[i]=Arrays.binarySearch(array, Integer.parseInt(output[i]) );
		}
		for(int i=0;i<idx0.length;i++) {
			array[idx0[i]]=0;
		}
		System.out.println(Arrays.toString(array)); 
		
	}
}

 


