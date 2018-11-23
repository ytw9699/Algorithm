package Ch_01_Arrays_and_Strings;

public class Common {

	public static int getCharNumber(Character c) {//각 문자에 숫자를 대응시킨다//대소문자 구문이없고
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			//System.out.println(val - a);
			return val - a;
		}
		return -1;//문자가 아닌경우에는 -1로 대응시킨다
	}
	
	public static int[] buildCharFrequencyTable(String phrase) {//각 문자가 몇번 등장했는지 센다
	//System.out.println(Character.getNumericValue('z') - Character.getNumericValue('a') + 1);
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for (char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;
			}
		}
		return table;
	}

}
