package a_1000번대;

import java.util.Scanner;
public class Main1316 
{    
	public static void main(String[] args) 
   {
	
    Scanner sc= new Scanner(System.in);
   
    int wordCount = sc.nextInt();//입력 단어 갯수
    
    int output = wordCount;//일단 입력받은 단어들이 전부 그룹단어라고 가정
    
    sc.nextLine();
    
    String words = new String();
    
    for(int i=0; i<wordCount; i++) {
    	words = sc.nextLine().trim();
    	output = output - groupCheck(words);//그룹단어 체크
    }
    System.out.println(output);//그룹단어수 출력
   }
	
	static int groupCheck(String words) 
   {//그룹단어라면 0리턴, 아니라면 1리턴
		
		char temp;
		
		int groupWord = 0;//일단 0을주고 그룹단어로 가정하고 시작 
		
		char[] currentWord = words.toCharArray();//문자 배열로 담는다
		temp = currentWord[0];
		
		outerLoop:
		for(int k=1; k<currentWord.length; k++) {//단어하나씩 접근
			if(temp != currentWord[k]) {//비교를 통해 temp의 값과 다른값이 나온다면
				for(int j=k+1; j<currentWord.length; j++) {//그룹단어인지 체크 반복
					if(temp == currentWord[j]) {//그룹단어가 아니라면
						groupWord = groupWord+1;//1을 더하고 출력
						break outerLoop;//반복문 2개 빠져나가자
					}
				}
				temp=currentWord[k];//비교 값을 바꿔준다
			}
		}
	   return groupWord;//그룹단어가 아니라면 1출력 맞으면 0출력
	}
}
