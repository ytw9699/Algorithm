package list.array.api;
	public class arrray01 {
	    public static void main(String[] args) {
	    
	        String[] student = new String[5];//student ��� �ϳ��� ������ ���� �����͸� ��ƺ���
	        student[0] = "������";
	        student[1] = "���̶�";
	        student[2] = "������";
	        student[3] = "������";
	        student[4] = "������";
	       //String[] student = {"������","���̶�","������","������","������"};//���� ǥ��
	        for(int i = 0; i < student.length; i++){
	            System.out.println(student[i]);
	        }
	    }
	}