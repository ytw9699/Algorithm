package Ch_01_Arrays_and_Strings;

public class Question04_1 {	
	public static boolean checkMaxOneOdd(int[] table) {//Ȧ�� ���ڰ� �Ѱ��̻����� Ȯ���Ѵ�
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {//�� �߰ߵǸ� ���� ��������
					return false;
				}
				foundOdd = true;//Ȧ������ ó������ ���ڰ� �߰ߵǸ� ������ �ְ�
			}
		}
		return true;
	}
	
	public static boolean isPermutationOfPalindrome(String phrase) {
		int[] table = Common.buildCharFrequencyTable(phrase);//�� ���ڿ� ���� ī��Ʈ�� ���� ��Ʈ�迭�� �����Ѵ�
		return checkMaxOneOdd(table);
	}
	
	public static void main(String[] args) {
		String pali = "aabbc";
		if(isPermutationOfPalindrome(pali)) {
			System.out.println(pali+"�� ȸ�� �����Դϴ�");
		}
		else {
			System.out.println(pali+"�� ȸ�� ������ �ƴմϴ�");
		}
		
		
	}


}
