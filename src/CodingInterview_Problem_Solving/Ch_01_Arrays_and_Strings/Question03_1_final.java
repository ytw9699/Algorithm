package Ch_01_Arrays_and_Strings;
import CtCILibrary.AssortedMethods;

public class Question03_1_final {
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {//6.�ε���0~12 ���� �迭���� ������ ����
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;//13+2*2=17//7.�� ������ �����ؼ� �迭�� �ε�����������ְ� 
		/*if (trueLength < str.length) {
			str[trueLength] = '\0';//�迭�ǳ�
		}*/
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';//9.����� �Բ� ä���´�
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];//8.�ε����� Ȱ���� �迭�� ������ ���� �ٽ� ä������
				index--;
			}
		}
	}
	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {//4.�迭���� ������ �ƴ� �ε����� ���� �ڿ��� ���� ã��
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String str = "Mr John Smith    ";//1.���������� ��� ���ڸ� �� ������ ���� ��ŭ ����� ���� Ȯ��
					//"Mr%20John%20Smith"
		char[] arr = str.toCharArray();//2.���� �迭 �̿�
		
		int trueLength = findLastCharacter(arr) + 1;//3.�� ������ ������ �������� �迭�� ũ��
		
		replaceSpaces(arr, trueLength);//5.������ ä��+���ڸ� ���ġ	
		
		System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");//10.���� ���ڹ迭 ��Ʈ������ ��ȯ ���
	}
}
