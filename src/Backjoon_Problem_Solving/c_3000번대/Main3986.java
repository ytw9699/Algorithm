package c_3000번대;

import java.util.Scanner;
import java.util.Stack;
public class Main3986 {
public static void main(String[] args) {
		
		int goodWordCount=0;//좋은단어 카운트
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String[] words = new String[a];
		String[] word;
		
		sc.nextLine();
		
		for(int i=0; i<a; i++) {
			words[i]= sc.nextLine();
		}
		
		for(int i=0; i<a; i++) {
			word = words[i].split("");
			Stack<String> stack = new Stack();
		
			for(int j=0; j<word.length; j++){ 
				if (!stack.isEmpty()){
						if (stack.peek().equals(word[j])) {//스택 상단의 값과 배열의 값비교
							stack.pop();
						}else {
							 stack.push(word[j]); 
						} 
				}else{ 
					stack.push(word[j]);	
				} 
			}
			if(stack.isEmpty()) {//스택이 비어있다면 좋은단어임
				goodWordCount++;
			}
		}
		System.out.println(goodWordCount);//좋은단어 카운트 출력
	}
}

