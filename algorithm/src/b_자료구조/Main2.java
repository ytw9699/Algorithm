package b_자료구조;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2 {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        StringBuffer sb = new StringBuffer(br.readLine());
	        StringTokenizer st = new StringTokenizer(sb.reverse().toString());
	        
	        int intA = Integer.parseInt(st.nextToken());
	        int intB = Integer.parseInt(st.nextToken());
	        
	        bw.write(String.valueOf(Math.max(intA, intB)));
	        bw.flush();
	    }
}
