package a_기본알고리즘;
//곱셈표를 출력합니다.
public class s_Multi99Table_곱셈표 {
	public static void main(String[] args) {
		System.out.println("----- 곱셈표 -----");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
}
