package Ch_01_Arrays_and_Strings;
import CtCILibrary.AssortedMethods;

public class Question03_1 {
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {//5.인덱스0~12 문자 배열에서 공백을 센다
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;//13+2*2=17//6.그 공백을 포함해서 배열의 인덱스를만들어주고 
		
		//System.out.println("index="+index);//17
		//System.out.println(str.length);//17
		if (trueLength < str.length) {
			str[trueLength] = '\0';//배열의끝
		//System.out.println("str[trueLength]");	
		//System.out.println(str);//Mr John Smith
		//System.out.println(str[trueLength]);//암것도 안나옴
		}
		//System.out.println("trueLength="+trueLength);//13
		
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				//System.out.println("trueLength-1="+i);//공백인곳
				//System.out.println("index="+index);
				str[index - 1] = '0';//8.공백과 함께 채워온다
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];//7.인덱스를 활용해 배열을 끝에서 부터 다시 채워오고
				index--;
			}
		}
	}
	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {//배열에서 공백이 아닌 인덱스를 먼저 뒤에서 부터 찾고
				//System.out.println(str[i]);//12
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String str = "Mr John Smith    ";//1.최종적으로 모든 문자를 다 담을수 있을 만큼 충분한 공간 확보
		
		//System.out.println(str);
		//System.out.println(str.length());//17
		char[] arr = str.toCharArray();//2.문자 배열 이용
		
		//System.out.println(arr);
		//System.out.println(arr.length);
		
		int trueLength = findLastCharacter(arr) + 1;//3.뒤 공백을 제외한 실제적인 배열의 크기
		
		//System.out.println(trueLength);
		
		replaceSpaces(arr, trueLength);//4.공백을 채움+문자를 재배치	
		
		//System.out.println(arr);
		//System.out.println("\""+arr+"\"");
		
		System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");//9.최종 문자배열 스트링으로 변환 출력
	}
}
