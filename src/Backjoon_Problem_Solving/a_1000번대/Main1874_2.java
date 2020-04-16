package a_1000번대;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main1874_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int yesNo = 1;//yes는1 no는0
        int n = Integer.parseInt(br.readLine());
        
        int i, temp, max = 0, top = 0;
        int stack[] = new int[n];
        
        while (n-- > 0) {
            temp = Integer.parseInt(br.readLine());
            
            if (temp > max){
                for (i = max+1; i <= temp; i++) {
                    stack[top++] = i;
                    sb.append("+\n");
                }
                max = temp;
            }else if (stack[top - 1] != temp) {
                	yesNo =0; 
            }
            top--;
            sb.append("-\n");
        }// end while
        if(yesNo == 0) {
        	System.out.print("NO");
        }else {
        	System.out.println(sb);
        }
    }
}

