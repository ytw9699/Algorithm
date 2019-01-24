package a_1000번대;

import java.util.Scanner;
public class Main1316 {
    public static void main(String[] args) {
    	
	    Scanner sc= new Scanner(System.in);
       
	    int count = sc.nextInt();
	    
	    int outCount = count;
	  
	    char temp;
	    
	    sc.nextLine();
	    
	    String words[] = new String[count];
	    
	    for(int i=0; i<count; i++) {
	    	words[i] = sc.nextLine().trim();
	    }
       
	    for(int i=0; i<count; i++) {//입력받은 단어 수 만큼 반복
	    	
	    	char[] charARR = words[i].toCharArray();//문자 배열로 담는다
	    	temp = charARR[0];
	    	
	    	outerLoop:
	    	for(int k=1; k<charARR.length; k++) {//단어하나씩 접근
	    		if(temp != charARR[k]) {//비교를 통해 temp의 값과 다른값이 나온다면
	    			for(int j=k+1; j<charARR.length; j++) {//그룹단어인지 체크 반복
	    				if(temp == charARR[j]) {//그룹단어가 아니라면
	    					outCount = outCount-1;//전체 단어갯수에서 -1씩 해간다
	    					break outerLoop;//반복문 2개 빠져나가자
	    				}
	    			}
	    			temp=charARR[k];//비교 값을 바꿔준다
	    		}
	    	}
	    }
	   System.out.println(outCount);//그룹단어수 출력
    }
}
