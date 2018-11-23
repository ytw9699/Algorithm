package Ch_01_Arrays_and_Strings;
import java.util.Arrays;
import CtCILibrary.AssortedMethods;

public class Question08_1 {
	public static void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;//���� ���Ҹ� ��� �ٲٱ� ���� �� �࿡ ���ϴ� ��� ����  0���� �ٲ�
		}		
	}
	public static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}		
	}			
	public static void setZeros(int[][] matrix) {
		//3.�迭2���� ������ 0�� ��ġ�� �Ҹ������� �Ǻ�
		boolean[] row = new boolean[matrix.length];	//��
		boolean[] column = new boolean[matrix[0].length];//��
		
		for (int i = 0; i < matrix.length; i++) {//��
			for (int j = 0; j < matrix[0].length;j++) {//��
				if (matrix[i][j] == 0) {//4. 
					row[i] = true; //���� 0�� ��� ���� ��ġ �ε����� �����Ѵ�.
					column[j] = true;//���� 0�� ��� ���� ��ġ �ε����� �����Ѵ�.
		 		}
			}
		}
		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				nullifyRow(matrix, i);//5.���� ���Ҹ� ���� 0���� �ٲ۴�
				//System.out.println(i);
			}
		}
		for (int j = 0; j < column.length; j++) {
			if (column[j]) {
				nullifyColumn(matrix, j);//6.���� ���Ҹ� ���� 0���� 
			}
		}
	}	
	public static void main(String[] args) {
		int nrows = 3;
		int ncols = 3;
		
		int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -3, 3);	//1.
		
		//System.out.println(matrix[0][0]);
		AssortedMethods.printMatrix(matrix);
		
		setZeros(matrix);//2. 0���� �ٲٱ� ���� �۾�
		
		System.out.println();
		
		AssortedMethods.printMatrix(matrix);//7.�������
	}
}
/*0. m*n ����� �� ���Ұ� 0�ϰ�� �ش� ���Ұ� ���� ��� ���� ��� ���Ҹ� 0���� �� ���ϴ� �˰���
1. �����ü�� 0���� �ٲٰ� �Ǵ�����������
2. 0�� ��ġ�� ����� ���(�迭2��) �ϳ��� ������

3. �������⵵�� O(MN)�� �ƴ϶� O(M)�̴�
2�����迭�� ��Ÿ���� �ƴ϶� 1�����迭�̴ٺ��ϱ�?*/

