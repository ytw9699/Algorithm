package b_ÀüÃ¼Å½»ö;

 public class bestInvitation2 {
	public static void main(String[] args) {
		
		String[] first=new String[]{"1","2","3","3","3","3"};
		String[] second=new String[]{"2","3","5","6","7","8"};
		
		System.out.println(bestInvitation(first,second));
		
}
	private static int bestInvitation(String[] first, String[] second) {
		int ans=0;
		int f;
		int s;
		
		for(int i=0; i<first.length; i++) {
			f=0;
			s=0;
			for(int j=0; j<first.length; j++) {
				if(first[i].equals(first[j]) || first[i].equals(second[j]) ) {
					f++;
				}
				if(second[i].equals(first[j]) || second[i].equals(second[j]) ) {
					s++;
				}
			}
			ans = Math.max(f,ans);
			ans = Math.max(s,ans);
		}
		return ans;
	}
}

 
