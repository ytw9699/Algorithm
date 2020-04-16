package b_자료구조;
import java.util.Scanner;
import java.util.Stack;
public class stack2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i <= n; i++) {
            String str = sc.nextLine();
 
            String instruction[] = str.split(" ");
 
            switch (instruction[0]) {
            case "push":
                stack.push(Integer.parseInt(instruction[1]));
                break;
 
            case "pop":
                if(stack.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack.pop());
                }
                break;
 
            case "size":
                    System.out.println(stack.size());
                    break;
 
            case "empty":
                if(stack.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
                break;
 
            case "top":
                if(stack.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack.peek());
                }
                break;
	}
}
}
}

        
