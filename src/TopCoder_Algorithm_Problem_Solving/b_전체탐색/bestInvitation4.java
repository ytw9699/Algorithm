package b_전체탐색;
import java.util.HashMap;
 public class bestInvitation4 {
	public static void main(String[] args) {
		
		String[] first=new String[]{"1","2","3","3","3","3"};
		String[] second=new String[]{"2","3","5","6","7","8"};
		
		System.out.println(bestInvitation(first,second));
		
}
	private static int bestInvitation(String[] first, String[] second) {
		int ans=0;
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0; i<first.length; i++) {
			map.put(first[i],0);	
			map.put(second[i],0);	
		}
		for(int i=0; i<first.length; i++) {
			map.put(first[i],map.get(first[i])+1);	
			map.put(second[i],map.get(second[i])+1);	
		}
			
		for(String key : map.keySet()) {
			ans = Math.max(ans, map.get(key));
		}
		return ans;
	}
}

 
