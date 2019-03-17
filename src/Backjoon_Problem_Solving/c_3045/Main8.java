package c_3045;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main8 {

	//static long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

	static LinkedList dobleLink = new LinkedList();
	
	public static void main(String[] args) throws Exception {
			
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String firstinput =br.readLine();
		String nodesCount[] = firstinput.split(" ");
		
		int nodes = Integer.parseInt(nodesCount[0]);
		int count = Integer.parseInt(nodesCount[1]);
	
	  String[] order= new String[count];
	
		for(int i =0; i<count; i++) {
			order[i]= br.readLine();
		}
			br.close();
		
		for(int i =0; i<nodes; i++) {
			dobleLink.add(i+1);
		}
		
		for(int i =0; i<count; i++) {
			String action[] = order[i].split(" ");
			change(action[0],action[1],action[2]);
		}
		
		int max=0;
		int maxindex=0;
		int[] dp = new int[nodes];// 인덱스마다 각 증가 수열의 길이//dp 배열은 증가 수열의 길이를 넣을 것이다.
		int[] array = new int[nodes];// 인덱스마다 각 입력값
		int ans = 0;
		int k=0;
		int iteratorIndex=0;
		
		ArrayList sequence = new ArrayList<>();//증가 수열 인덱스
		
		ListIterator iterator = dobleLink.listIterator();
		
		while(iterator.hasNext()){
			array[iteratorIndex++]=(int)iterator.next();
     	 }
		
		dp[0] = 1;
			
			for (int i = 1; i < nodes; i++) {
			  k=0;
			  dp[i] = 1;
			  int[] temp = new int[i+1];
			  for (int j = 0; j < i; j++) {
			    if (array[j] < array[i] && dp[j] + 1 > dp[i]) {
			      dp[i] = dp[j] + 1;
			      temp[k++] = j;
			      if(dp[j] + 1 > max) {
			    	  max = dp[j] + 1 ;
			    	  maxindex = i;
			      }
			    }
			  }
			  temp[k++] = i;
			  sequence.add(temp);
			}
			  for(int i=1;i<nodes;i++) {
				  if (ans < dp[i]) {
				    ans = dp[i];
				  }
				}
				System.out.println(nodes - ans);//실행해야할 연산수 출력
				if(maxindex > 0) {
					int[] changearr = (int[])sequence.get(maxindex-1);
					
					for(int i=0; i<changearr.length; i++) {
						array[changearr[i]]=0;
					}
				}
		
		for(int i=0; i<nodes-1; i++) {
			if(array[i] > 0 && array[i]<nodes) {
				int a=array[i];
				int b=array[i]+1;
				System.out.println("A"+" "+a+" "+b);
				}
			else if( array[i] == nodes){
				int a=array[i];
				int b=array[i]-1;
				System.out.println("B"+" "+a+" "+b);	
			}
		}
		/*long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
		*/
		}
	private static void change(String selection, String X, String Y) {
		int x= Integer.parseInt(X);
   		int y= Integer.parseInt(Y);
   		
		if(selection.equals("A")) {//x노드를 y노드의 앞으로 이동
			dobleLink.remove((Object)x);//x노드 삭제후
			
			int index = dobleLink.indexOf(y);//y값의 인덱스를 반환
			
			dobleLink.add(index,x);//y인덱스 에 해당하는 값의 앞쪽에 x를 추가
		}else if(selection.equals("B")){ 
			dobleLink.remove((Object)x);//x노드 삭제후
			
			int index = dobleLink.indexOf(y);//y값의 인덱스를 반환
			dobleLink.add(index+1,x);//y인덱스 에 해당하는 값의 뒤쪽에 x를 추가
		}
	}
}