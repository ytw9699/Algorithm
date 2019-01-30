package b_ÀüÃ¼Å½»ö;

 public class KiwiJuiceEasy1 {
	public static void main(String[] args) {
		
		String[] first=new String[]{"1","2","3","3","3"};
		String[] second=new String[]{"2","3","5","6","7"};
		
		System.out.println(bestInvitation(first,second));
		
}
	private static int bestInvitation(String[] first, String[] second) {
		int max=0;
		int temp=0;
		
		for(int i=0; i<first.length; i++) {
			for(int k=0; k<first.length; k++){
				if(first[i].equals(first[k]) || first[i].equals(second[k]) ) {
					temp++;
					if(temp > max)
						max=temp;
				}
			}
			temp=0;
		}
		
		for(int i=0; i<second.length; i++) {
			for(int k=0; k<second.length; k++){
				if(second[i].equals(second[k]) || second[i].equals(first[k]) ) {
					temp++;
					if(temp > max)
						max=temp;
				}
			}
			temp=0;
		}
		return max;
	}
}

 
