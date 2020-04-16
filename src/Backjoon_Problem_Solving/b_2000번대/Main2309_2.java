package b_2000번대;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main2309_2 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 100;
        int size = 9;
        int sum = 0;
        int[] input = new int[size];
        
        for(int i=0; i < size; i++) {
        	input[i] = Integer.parseInt(br.readLine());
            sum += input[i];
        }
        br.close();
        
        boolean checked = false;
        for(int i=0; i < size; i++) {
            for(int j = i+1; j < size; j++) {
                if(sum - (input[i] + input[j]) == max) {//전체합에서 두수를 뺀것이 100이라면
                	input[i] = Integer.MIN_VALUE;
                	input[j] = Integer.MIN_VALUE;
                    checked = true;
                    break;
                }
                if(checked) break;
            }
        }
        Arrays.sort(input);
        
        for(int value:input) { 
        	if(value != Integer.MIN_VALUE) 
        		System.out.println(value);
        }
    }
}

