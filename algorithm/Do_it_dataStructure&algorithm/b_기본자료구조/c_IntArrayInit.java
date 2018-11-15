package b_기본자료구조;
// 구성 자료형이 int형 인 배열 (요솟수는  5:배열 초기자에 의해  생성）

class c_IntArrayInit {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};	// 배열 초기자에 의해  생성
		//int[] a = new int[] {1,2,3,4,5};//같은거 더명확히함
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}