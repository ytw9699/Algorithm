package Ch_01_Arrays_and_Strings;

public class Question04_1 {	
	public static boolean checkMaxOneOdd(int[] table) {//홀수 문자가 한개이상인지 확인한다
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {//또 발견되면 리턴 폴스하자
					return false;
				}
				foundOdd = true;//홀수개의 처음으로 문자가 발견되면 투르로 주고
			}
		}
		return true;
	}
	
	public static boolean isPermutationOfPalindrome(String phrase) {
		int[] table = Common.buildCharFrequencyTable(phrase);//각 문자에 대한 카운트를 담은 인트배열을 리턴한다
		return checkMaxOneOdd(table);
	}
	
	public static void main(String[] args) {
		String pali = "aabbc";
		if(isPermutationOfPalindrome(pali)) {
			System.out.println(pali+"는 회문 순열입니다");
		}
		else {
			System.out.println(pali+"는 회문 순열이 아닙니다");
		}
		
		
	}


}
