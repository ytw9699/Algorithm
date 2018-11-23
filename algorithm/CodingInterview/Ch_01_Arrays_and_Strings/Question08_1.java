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
		boolean[] row = new boolean[matrix.length];	//��
		boolean[] column = new boolean[matrix[0].length];//��
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {
					row[i] = true; //���� 0�� ��� ���� ��ġ �ε����� �����Ѵ�.
					column[j] = true;//���� 0�� ��� ���� ��ġ �ε����� �����Ѵ�.
		 		}
			}
		}
		for (int i = 0; i < row.length; i++) {//���� ���Ҹ� ���� 0���� �ٲ۴�
			if (row[i]) {//�ٽ��f���
				nullifyRow(matrix, i);
				//System.out.println(i);
			}
		}
		for (int j = 0; j < column.length; j++) {//���� ���Ҹ� ���� 0���� 
			if (column[j]) {
				nullifyColumn(matrix, j);
			}
		}
	}	
	public static void main(String[] args) {
		int nrows = 3;
		int ncols = 3;
		
		int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -3, 3);	
		
		//System.out.println(matrix[0][0]);
		
		AssortedMethods.printMatrix(matrix);
		
		setZeros(matrix);
		
		System.out.println();
		
		AssortedMethods.printMatrix(matrix);
	}
}
