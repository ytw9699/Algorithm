package Ch_01_Arrays_and_Strings;

import java.util.Arrays;
import CtCILibrary.AssortedMethods;

public class Question08_1 {
	public static void nullifyRow(int[][] matrix, int row) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;//행의 원소를 모두 바꾸기 위해 그 행에 속하는 모든 열은  0으로 바꿈
		}		
	}
	public static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}		
	}			
	public static void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];	//행
		boolean[] column = new boolean[matrix[0].length];//열
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {
					row[i] = true; //값이 0인 행과 열의 위치 인덱스를 저장한다.
					column[j] = true;//값이 0인 행과 열의 위치 인덱스를 저장한다.
		 		}
			}
		}
		for (int i = 0; i < row.length; i++) {//행의 원소를 전부 0으로 바꾼다
			if (row[i]) {//다시훓어나감
				nullifyRow(matrix, i);
				//System.out.println(i);
			}
		}
		for (int j = 0; j < column.length; j++) {//열의 원소를 전부 0으로 
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
