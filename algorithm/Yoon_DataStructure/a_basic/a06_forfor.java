package a_basic;
public class a06_forfor {//중첩 for문
	static String forSearch(int ar[])	{
		int count = 0;//연산횟수
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				count++;//연산횟수 증가
				if(ar[i]+ar[j]>100) { //중심이 되는 연산!
				return "ar["+i+"]+ar["+j+"]의 합이 100을 넘습니다";
				}
			}
		}
		System.out.println("비교연산횟수="+count+"회입니다.");//81
		return "배열 의 원소들중 100의 합을 넘는 조합이 없습니다.";
	}
	public static void main(String[] args) {
		int arr[]={1, 3, 5, 7, 9, 12, 21, 23, 47};
		
		System.out.println(forSearch(arr));
	}
}