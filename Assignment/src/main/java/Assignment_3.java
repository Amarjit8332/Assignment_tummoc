
public class Assignment_3 {
	public static int[][] Multiplication(int[][] A, int[][] B) {
		int x = A.length;
		int y = B[0].length;
		int[][] result = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				for (int k = 0; k < A[0].length; k++) {
		
					result[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return result;	
	}
		public static int[][] Addition(int[][] A, int[][] B) {
		
			int x = A.length;
			int y = A[0].length;
			int[][] result = new int[x][y];
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					result[i][j] = A[i][j] + B[i][j];
				}
			}
			return result;
		}
		
		public static int[][] Subtraction(int[][] A, int[][] B) {
		
			int x = A.length;
			int y = A[0].length;
			int[][] result = new int[x][y];
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					result[i][j] = A[i][j] - B[i][j];
				}
			}
			return result;
		}
		public static void Matrix(int[][] matrix) {
		
			for (int[] row : matrix) {
				for (int num : row) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
		
			int[][] A = {{1, 0}, {0, 1}};
			int[][] B = {{2, 3}, {3, 2}};
			System.out.println("A * B:");
			int[][] result1 = Multiplication(A, B);
			Matrix(result1);
			System.out.println("\nA * B + A:");
			int[][] result2 = Addition(result1, A);
			Matrix(result2);
			System.out.println("\nA * B - A:");
			int[][] result3 = Subtraction(result1, A);
			Matrix(result3);
		}
		

}
