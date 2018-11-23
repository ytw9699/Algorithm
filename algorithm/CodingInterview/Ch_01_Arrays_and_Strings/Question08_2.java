package Ch_01_Arrays_and_Strings;

import CtCILibrary.AssortedMethods;

public class Question08_2 {
	public static void nullifyRow(int[][] matrix, int row) {//11.그 행을 전부 0으로 바꾼다
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
			if (matrix[0][j] == 0) {//3.첫번째 행에 0이있는지 확인
				rowHasZero = true;//4.하나라도 있다면 
				break;
			}
		}		
		
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {//5.첫번째 열에 0이있는지 확인
				colHasZero = true;//6.하나라도 있다면 
				break;
			}
		}		
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length;j++) {
				if (matrix[i][j] == 0) {//7.나머지 배열에 0이있는지 확인후
					matrix[i][0] = 0; //8.첫째 열을 0으로 바꾼다..
					matrix[0][j] = 0;//9. 첫째 행을 0으로 바꾼다
		 		}
			}
		}		
			System.out.println();
			AssortedMethods.printMatrix(matrix);
		
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				nullifyRow(matrix, i);//10.첫번째 열에서 0이있는 행을 모두 0으로 바꾼다
			}
		}		
		 	System.out.println();
		 	AssortedMethods.printMatrix(matrix);
			
		for (int j = 1; j < matrix[0].length; j++) {
			if (matrix[0][j] == 0) {//11.첫번째 행에서 0이있는 열을 모두 0으로 바꾼다
				nullifyColumn(matrix, j);
			}
		}	
		
			System.out.println();
		 	AssortedMethods.printMatrix(matrix);
		
		if (rowHasZero) {//12.첫번째행에 0이 하나라도있었다면
			nullifyRow(matrix, 0);//13. 첫번째 행을 모두 0으로 바꾼다
		}
		
			System.out.println();
		 	AssortedMethods.printMatrix(matrix);
		
		if (colHasZero) {//14.첫번째 열에 0이 하나라도 있다면 
			nullifyColumn(matrix, 0);//15. 첫번째 열을 모두 0으로 바꾼다
		}
	}	
	public static void main(String[] args) {
		int nrows = 4;
		int ncols = 4;
		int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -3, 3);//1.배열만들고	

		AssortedMethods.printMatrix(matrix);
		
		setZeros(matrix);//2.
		
		System.out.println();
		
		AssortedMethods.printMatrix(matrix);//16.최종출력
	}
}
//이러한 순서로해야 모든 곳이 다 0으로 안바뀐다
//공간복잡도는 O(1) 배열이아닌 변수를 사용해서?
