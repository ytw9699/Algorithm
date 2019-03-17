package Array;

	public class arrray02 {
	public static void main(String[] args) {
	    
	    String[] student = new String[5];
	    student[0] = "ÃÖÁøÇõ";
	    student[1] = "ÇÑÀÌ¶÷";
	    student[2] = "ÃÖÀ¯ºó";
	    student[3] = "ÇÑÀÌÀº";
	    student[4] = "±èÁÖÇÑ";
	    
	    student[3] = null;
	    
	    for(int i = 0; i < student.length; i++){
	    	if(student[i] != null) {
	        System.out.println(student[i]);
	    }
	    }
	}
	}