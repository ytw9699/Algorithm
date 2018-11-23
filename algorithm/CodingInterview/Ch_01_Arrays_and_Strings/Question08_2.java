package Ch_01_Arrays_and_Strings;

import CtCILibrary.AssortedMethods;

public class Question08_2 {
	public static void nullifyRow(int[][] matrix, int row) {//11.�� ���� ���� 0���� �ٲ۴�
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
		
		for (int j = 0; j < matrix[0].length; j++) {//
			if (matrix[0][j] == 0) {//3.ù��° �࿡ 0���ִ��� Ȯ��
				rowHasZero = true;//4.�ϳ��� �ִٸ� 
				break;
			}
		}		
		
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {//5.ù��° ���� 0���ִ��� Ȯ��
				colHasZero = true;//6.�ϳ��� �ִٸ� 
				break;
			}
		}		
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {//7.������ �迭�� 0���ִ��� Ȯ����
					matrix[i][0] = 0; //8.ù° ���� 0���� �ٲ۴�..
					matrix[0][j] = 0;//9. ù° ���� 0���� �ٲ۴�
		 		}
			}
		}		
			System.out.println();
			AssortedMethods.printMatrix(matrix);
		
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				nullifyRow(matrix, i);//10.ù��° ������ 0���ִ� ���� ��� 0���� �ٲ۴�
			}
		}		
		 	System.out.println();
		 	AssortedMethods.printMatrix(matrix);
			
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {//11.ù��° �࿡�� 0���ִ� ���� ��� 0���� �ٲ۴�
				nullifyColumn(matrix, j);
			}
		}	
		
			System.out.println();
		 	AssortedMethods.printMatrix(matrix);
		
		if (rowHasZero) {//12.ù��°�࿡ 0�� �ϳ����־��ٸ�
			nullifyRow(matrix, 0);//13. ù��° ���� ��� 0���� �ٲ۴�
		}
		
			System.out.println();
		 	AssortedMethods.printMatrix(matrix);
		
		if (colHasZero) {//14.ù��° ���� 0�� �ϳ��� �ִٸ� 
			nullifyColumn(matrix, 0);//15. ù��° ���� ��� 0���� �ٲ۴�
		}
	}	
	public static void main(String[] args) {
		int nrows = 4;
		int ncols = 4;
		int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -3, 3);//1.�迭�����	

		AssortedMethods.printMatrix(matrix);
		
		setZeros(matrix);//2.
		
		System.out.println();
		
		AssortedMethods.printMatrix(matrix);//16.�������
	}
}
//�̷��� �������ؾ� ��� ���� �� 0���� �ȹٲ��
//�������⵵�� O(1) �迭�̾ƴ� ������ ����ؼ�?
