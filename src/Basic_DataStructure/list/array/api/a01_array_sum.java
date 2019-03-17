package list.array.api;

public class a01_array_sum {
	
public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10};//배열도 자료구조 1~10까지의 정수를 저장

		int sum = 0;
		
		for(int i=0; i<10; i++) //for문을 이용, 1~10까지의 합을 구하는 알고리즘
			sum = sum + arr[i];
		
		System.out.println(sum);//55 출력
	}
}
