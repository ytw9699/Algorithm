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
		//3.배열2개를 더만들어서 0의 위치를 불린값으로 판별
		boolean[] row = new boolean[matrix.length];	//행
		boolean[] column = new boolean[matrix[0].length];//열
		
		for (int i = 0; i < matrix.length; i++) {//행
			for (int j = 0; j < matrix[0].length;j++) {//열
				if (matrix[i][j] == 0) {//4. 
					row[i] = true; //값이 0인 행과 열의 위치 인덱스를 저장한다.
					column[j] = true;//값이 0인 행과 열의 위치 인덱스를 저장한다.
		 		}
			}
		}
		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				nullifyRow(matrix, i);//5.행의 원소를 전부 0으로 바꾼다
				//System.out.println(i);
			}
		}
		for (int j = 0; j < column.length; j++) {
			if (column[j]) {
				nullifyColumn(matrix, j);//6.열의 원소를 전부 0으로 
			}
		}
	}	
	public static void main(String[] args) {
		int nrows = 3;
		int ncols = 3;
		
		int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -3, 3);	//1.
		
		//System.out.println(matrix[0][0]);
		AssortedMethods.printMatrix(matrix);
		
		setZeros(matrix);//2. 0으로 바꾸기 위한 작업
		
		System.out.println();
		
		AssortedMethods.printMatrix(matrix);//7.최종출력
	}
}
/*0. m*n 행렬의 한 원소가 0일경우 해당 원소가 속한 행과 열의 모든 원소를 0으로 설 정하는 알고리즘
1. 행렬전체가 0으로 바꾸게 되는점이있으니
2. 0의 위치를 기록할 행렬(배열2개) 하나를 더두자

3. 공간복잡도는 O(MN)이 아니라 O(2M) > O(M)이다
2차원배열로 나타난게 아니라 1차원배열이다보니까?*/

