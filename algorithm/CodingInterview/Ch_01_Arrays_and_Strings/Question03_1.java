package Ch_01_Arrays_and_Strings;
import CtCILibrary.AssortedMethods;

public class Question03_1 {
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;//0~12배열인덱스의 공백을 센다
			}
		}
		index = trueLength + spaceCount * 2;
		
		System.out.println("index="+index);
		
		if (trueLength < str.length) 
			str[trueLength] = '\0';
		
		System.out.println("trueLength="+trueLength);//13
		
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				System.out.println("trueLength="+i);//
				System.out.println("index="+index);
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
	
	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {//공백이 아니냐
				System.out.println(str[i]);//12
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		
		System.out.println(str);
		System.out.println(str.length());
		
		char[] arr = str.toCharArray();
		
		System.out.println(arr);
		System.out.println(arr.length);
		
		int trueLength = findLastCharacter(arr) + 1;
		
		System.out.println(trueLength);
		
		replaceSpaces(arr, trueLength);	
		
		System.out.println(arr);
		
		System.out.println("\""+arr+"\"");
		
		System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
	}
}
