package b_ÀüÃ¼Å½»ö;
import java.util.HashMap;
 public class bestInvitation3 {
	public static void main(String[] args) {
		
		String[] first=new String[]{"1","2","3","3","3","3"};
		String[] second=new String[]{"2","3","5","6","7","8"};
		
		System.out.println(bestInvitation(first,second));
		
}
	private static int bestInvitation(String[] first, String[] second) {
		int ans=0;
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0; i<first.length; i++) {
			if(map.containsKey(first[i])) {
				map.put(first[i], map.get(first[i])+1);
			}else {
				map.put(first[i],1);
			}
			if(map.containsKey(second[i])) {
				map.put(second[i], map.get(second[i])+1 );
			}else {
				map.put(second[i],1);
			}
		}
		
		for(String key : map.keySet()) {
			ans = Math.max(ans, map.get(key));
		}
		
		return ans;
	}
}

 
