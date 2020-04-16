package b_2631;
import java.util.Scanner;
import java.util.ArrayList;
	public class Main {
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int max=0;
	int maxindex=0;//최장수열의 마지막수열값 인덱스값
	int[] dp = new int[n];//증가 수열의 길이
	int[] array = new int[n];//수열
	int ans = 0;
	int k=0;
	ArrayList sequence = new ArrayList<>();//증가 수열 인덱스
	
	for (int i = 0; i < n; i++) {
	  array[i] = sc.nextInt();
	}
	dp[0] = 1;
	
	for (int i = 1; i < n; i++) {
	  k=0;
	  dp[i] = 1;
	  int[] temp = new int[i+1];
	  for (int j = 0; j < i; j++) {
	    if (array[j] < array[i] && dp[j] + 1 > dp[i]) {
	      dp[i] = dp[j] + 1;
	      temp[k++] = j;//I마다 J를 기록
	      if(dp[j] + 1 > max) {
	    	  max = dp[j] + 1 ;
	    	  maxindex = i;//최장수열의 마지막수열값 인덱스값
	      }
	    }
	  }
	  temp[k++] = i;
	  sequence.add(temp);
	}
	for(int i=1;i<n;i++) {
	  if (ans < dp[i]) {
	    ans = dp[i];
	  }
	}
	System.out.println(n - ans);
	int[] changearr = (int[])sequence.get(maxindex-1);
	
	for(int i=0; i<changearr.length; i++) {
		array[changearr[i]]=0;//array배열에서 옮기지 말아야 수열의 값을 찾아 전부 0으로 바꿈
	}
	}
	}
