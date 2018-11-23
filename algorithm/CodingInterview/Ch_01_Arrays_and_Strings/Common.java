package Ch_01_Arrays_and_Strings;

public class Common {

	public static int getCharNumber(Character c) {//�� ���ڿ� ���ڸ� ������Ų��//��ҹ��� �����̾���
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			//System.out.println(val - a);
			return val - a;
		}
		return -1;//���ڰ� �ƴѰ�쿡�� -1�� ������Ų��
	}
	
	public static int[] buildCharFrequencyTable(String phrase) {//�� ���ڰ� ��� �����ߴ��� ����
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
