package b_2631;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//7
		
		int max=0;
		int maxindex=0;
		int[] dp = new int[n];// �ε������� �� ���� ������ ����//dp �迭�� ���� ������ ���̸� ���� ���̴�.
		int[] array = new int[n];// �ε������� �� �Է°�
		String[] sequence = new String[n];//���� ���� 
		int ans = 0;

		for (int i = 0; i < n; i++) {
		  array[i] = sc.nextInt();
		}
		dp[0] = 1;
		sequence[0] = Integer.toString(array[0]);

		for (int i = 1; i < n; i++) {
		  dp[i] = 1;
		  String temp="";
		  // i �� �������� �ε��� 0 �������� i-1���� üũ�Ѵ� 
		    // ���̸� ����
		  for (int j = 0; j < i; j++) {
		    if ( array[i] > array[j] && dp[i] < dp[j] + 1 ) { // ���� ���� �̶��
		      dp[i] = dp[j] + 1;//���� 1����
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

 


