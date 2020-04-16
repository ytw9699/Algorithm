package Array;
	public class arrray02 {
	public static void main(String[] args) {
	    
	    String[] student = new String[5];
	    student[0] = "최진혁";
	    student[1] = "한이람";
	    student[2] = "최유빈";
	    student[3] = "한이은";
	    student[4] = "김주한";
	    
	    student[3] = null;
	    
	    for(int i = 0; i < student.length; i++){
	    	System.out.println(student[i]);
	    }
}
}