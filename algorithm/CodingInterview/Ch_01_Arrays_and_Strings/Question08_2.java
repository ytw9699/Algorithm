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
			if (matrix[0][j] == 0) {//첫번째 행에 0이있는지 확인
				rowHasZero = true;
				break;
			}
		}		
		
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {//첫번째 열에 0이있는지 확인
				colHasZero = true;
				break;
			}
		}		
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {//나머지 배열에 0이있는지 확인후
					matrix[i][0] = 0; //0으로 바꾼다..
					matrix[0][j] = 0;
				     //System.out.println();
					//AssortedMethods.printMatrix(matrix);
					//System.out.println();
		 		}
			}
		}		
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {//첫번째 열에서 0이있는 행을 모두 0으로 바꾼다
				nullifyRow(matrix, i);
			}
		}		
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {//첫번째 행에서 0이있는 열을 모두 0으로 바꾼다
				nullifyColumn(matrix, j);
			}
		}	
		
		if (rowHasZero) {
			nullifyRow(matrix, 0);//첫번째 행을 0으로 바꾼다
		}
		
		if (colHasZero) {//첫번째 열을 0으로 바꾼다
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
