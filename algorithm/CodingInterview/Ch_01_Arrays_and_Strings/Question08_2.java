package Ch_01_Arrays_and_Strings;

import CtCILibrary.AssortedMethods;

public class Question08_2 {
	public static void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}		
	}

	public static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}		
	}		
	
	public static void setZeros(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;		
		
		for (int j = 0; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {//ù��° �࿡ 0���ִ��� Ȯ��
				rowHasZero = true;
				break;
			}
		}		
		
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {//ù��° ���� 0���ִ��� Ȯ��
				colHasZero = true;
				break;
			}
		}		
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {//������ �迭�� 0���ִ��� Ȯ����
					matrix[i][0] = 0; //0���� �ٲ۴�..
					matrix[0][j] = 0;
				     //System.out.println();
					//AssortedMethods.printMatrix(matrix);
					//System.out.println();
		 		}
			}
		}		
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {//ù��° ������ 0���ִ� ���� ��� 0���� �ٲ۴�
				nullifyRow(matrix, i);
			}
		}		
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {//ù��° �࿡�� 0���ִ� ���� ��� 0���� �ٲ۴�
				nullifyColumn(matrix, j);
			}
		}	
		
		if (rowHasZero) {
			nullifyRow(matrix, 0);//ù��° ���� 0���� �ٲ۴�
		}
		
		if (colHasZero) {//ù��° ���� 0���� �ٲ۴�
			nullifyColumn(matrix, 0);
		}
	}	
	public static void main(String[] args) {
		int nrows = 4;
		int ncols = 4;
		int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -3, 3);		

		AssortedMethods.printMatrix(matrix);
		
		setZeros(matrix);
		
		System.out.println();
		
		AssortedMethods.printMatrix(matrix);
	}
}
