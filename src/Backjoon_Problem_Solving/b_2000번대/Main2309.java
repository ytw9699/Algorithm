package b_2000번대;
import java.util.Arrays;
import java.util.Scanner;
 public class Main2309 {
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	
	int count = 9;
	
	int[] arr = new int[count];
	
	while(count-- > 0) {
		arr[count] = sc.nextInt();	
	}
	Arrays.sort(arr);//배열을 미리 오름차순 정렬
	
	outerLoop:	
	for (int a=0; a<8; a++) { 
	   for (int b=a+1; b<9; b++) { 
		   for (int c=b+1; c<9; c++) { 
			   for (int d=c+1; d<9; d++) { 
				   for (int e=d+1; e<9; e++) { 
					   for (int f=e+1; f<9; f++) { 
						   for (int g=f+1; g<9; g++) { 
							   if(arr[a]+arr[b]+arr[c]+arr[d]+arr[e]+arr[f]+arr[g] == 100) {
								   //합이 100이라면 출력후
			 System.out.println(arr[a]);
			 System.out.println(arr[b]);
			 System.out.println(arr[c]);
			 System.out.println(arr[d]);
			 System.out.println(arr[e]);
			 System.out.println(arr[f]);
			 System.out.println(arr[g]);
			 break outerLoop;//반복문 전체 탈출
				 }
			   } 
			}
		} 
	}
}
}
}
}
}
