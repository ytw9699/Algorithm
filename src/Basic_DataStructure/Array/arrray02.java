package Array;

	public class arrray02 {
	public static void main(String[] args) {
	    
	    String[] student = new String[5];
	    student[0] = "������";
	    student[1] = "���̶�";
	    student[2] = "������";
	    student[3] = "������";
	    student[4] = "������";
	    
	    student[3] = null;
	    
	    for(int i = 0; i < student.length; i++){
	    	if(student[i] != null) {
	        System.out.println(student[i]);
	    }
	    }
	}
	}