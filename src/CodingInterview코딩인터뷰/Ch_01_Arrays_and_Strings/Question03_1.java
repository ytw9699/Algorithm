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

/*0.���ڿ��� ����ִ� ��� ������ '%20'���� �ٲٴ� �޼ҵ带 �����
1.���������� ��� ���ڸ� �� ������ ���� ��ŭ ����� ���� Ȯ��
2.���ڿ��� ���� ���̰� �Բ��־����ٰ� ����(���� �迭 �̿�)

Mr John      Smith
1. i = 16
2. i= 12
3. trueLength = 13
4. spacecount = 2
5. index = 17 
6. str.length = 17
7. i=12
8.str[16]=str[12]
9. index = 16
10. i=11
11.str[15]=str[11]
12. index = 15
13. i=10
14.str[14]=str[10]
15. index = 14
16. i=9
17.str[13]=str[9]
18. index = 13
19. i=8
20. str[12]=str[8]
21. index= 12
22. i=7, 
23. str[11]='0'
24. str[10]='2'
25. str[9]='%'
26. index=9*/
