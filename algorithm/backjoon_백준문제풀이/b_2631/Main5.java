package b_2631;
import java.util.Scanner;
import java.util.Arrays;
public class Main5 {
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
		  // i �� �������� �ε��� 0 �������� i-1���� üũ�Ѵ�  // ���̸� ����
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
		    sequence[i] = temp+array[i];//���� ���̱�
		}
		for(int i=1;i<n;i++) {
		  if (ans < dp[i]) {
		    ans = dp[i];
		  }
		}
	
		System.out.println(n - ans);
		
		Arrays.sort(array); 
		
		String[] output = sequence[maxindex].split("");//��������� ������ ���ø����� �̴´�
		
		int[] idxArr = new int[output.length];
		
		for(int i=0; i<output.length; i++) {
			idxArr[i]=Arrays.binarySearch(array, Integer.parseInt(output[i]) );
		}
		for(int i=0; i<idxArr.length; i++) {//��Ÿ�� ���� �߻� �κ�
			System.out.println("temp");
			int temp = idxArr[i];
			System.out.println("temp");
			array[temp]=0;//�ű��� ���ƾ��� �κ��� �������� ���� 0���� �ٲ۴�
		}
		
	}
}

 


