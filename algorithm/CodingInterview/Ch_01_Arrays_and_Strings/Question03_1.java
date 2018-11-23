package Ch_01_Arrays_and_Strings;
import CtCILibrary.AssortedMethods;

public class Question03_1 {
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {//5.�ε���0~12 ���� �迭���� ������ ����
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;//13+2*2=17//6.�� ������ �����ؼ� �迭�� �ε�����������ְ� 
		
		//System.out.println("index="+index);//17
		//System.out.println(str.length);//17
		if (trueLength < str.length) {
			str[trueLength] = '\0';//�迭�ǳ�
		//System.out.println("str[trueLength]");	
		//System.out.println(str);//Mr John Smith
		//System.out.println(str[trueLength]);//�ϰ͵� �ȳ���
		}
		//System.out.println("trueLength="+trueLength);//13
		
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				//System.out.println("trueLength-1="+i);//�����ΰ�
				//System.out.println("index="+index);
				str[index - 1] = '0';//8.����� �Բ� ä���´�
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];//7.�ε����� Ȱ���� �迭�� ������ ���� �ٽ� ä������
				index--;
			}
		}
	}
	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {//�迭���� ������ �ƴ� �ε����� ���� �ڿ��� ���� ã��
				//System.out.println(str[i]);//12
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String str = "Mr John Smith    ";//1.���������� ��� ���ڸ� �� ������ ���� ��ŭ ����� ���� Ȯ��
		
		//System.out.println(str);
		//System.out.println(str.length());//17
		char[] arr = str.toCharArray();//2.���� �迭 �̿�
		
		//System.out.println(arr);
		//System.out.println(arr.length);
		
		int trueLength = findLastCharacter(arr) + 1;//3.�� ������ ������ �������� �迭�� ũ��
		
		//System.out.println(trueLength);
		
		replaceSpaces(arr, trueLength);//4.������ ä��+���ڸ� ���ġ	
		
		//System.out.println(arr);
		//System.out.println("\""+arr+"\"");
		
		System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");//9.���� ���ڹ迭 ��Ʈ������ ��ȯ ���
	}
}
