package c_3986;

import java.util.Scanner;
import java.util.Stack;
public class Main {
public static void main(String[] args) {
		
		int goodWordCount=0;//�����ܾ� ī��Ʈ
		
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
						if (stack.peek().equals(word[j])) {//���� ����� ���� �迭�� ����
							stack.pop();
						}else {
							 stack.push(word[j]); 
						} 
				}else{ 
					stack.push(word[j]);	
				} 
			}
			if(stack.isEmpty()) {//������ ����ִٸ� �����ܾ���
				goodWordCount++;
			}
		}
		System.out.println(goodWordCount);//�����ܾ� ī��Ʈ ���
	}
}

