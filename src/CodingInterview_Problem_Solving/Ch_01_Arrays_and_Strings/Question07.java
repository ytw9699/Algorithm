package Ch_01_Arrays_and_Strings;

import CtCILibrary.*;

public class Question07 {

	public static boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) 
			return false; // Not a square
		
		int n = matrix.length;
		//System.out.println(n);
		
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;//0
			int last = n - 1 - layer;//2
			for(int i = first; i < last; i++) {
				int offset = i - first;//0
				int top = matrix[first][i]; // save top//matrix[0],[0]

				// left -> top
				matrix[first][i] = matrix[last-offset][first]; 			

				// bottom -> left
				matrix[last-offset][first] = matrix[last][last - offset]; 

				// right -> bottom
				matrix[last][last - offset] = matrix[i][last]; 

				// top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(3, 3, 0, 9);
		AssortedMethods.printMatrix(matrix);
		System.out.println(rotate(matrix));
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}

}
