package list.array.api;
	public class arrray01 {
	    public static void main(String[] args) {
	    
	        String[] student = new String[5];//student 라는 하나의 변수에 여러 데이터를 담아보자
	        student[0] = "최진혁";
	        student[1] = "한이람";
	        student[2] = "최유빈";
	        student[3] = "한이은";
	        student[4] = "김주한";
	       //String[] student = {"최진혁","한이람","최유빈","한이은","김주한"};//같은 표현
	        for(int i = 0; i < student.length; i++){
	            System.out.println(student[i]);
	        }
	    }
	}