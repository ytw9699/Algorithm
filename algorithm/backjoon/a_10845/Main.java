package a_10845;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        
        LinkedList<Integer> queue = new LinkedList();
        
        for (int i = 0; i <= n; i++) {
            String str = sc.nextLine();
 
            String instruction[] = str.split(" ");
 
            switch (instruction[0]) {
            case "push":
            	queue.offer(Integer.parseInt(instruction[1]));
                break;
 
            case "pop":
                if(queue.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(queue.poll());
                }
                break;
 
            case "size":
                    System.out.println(queue.size());
                    break;
 
            case "empty":
                if(queue.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
                break;
                
            case "front":
                if(queue.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(queue.peek());
                }
                break;
                
            case "back":
                if(queue.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(queue.get(queue.size()-1));
                }
                break;
	}
}
}
}