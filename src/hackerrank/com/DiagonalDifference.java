package hackerrank.com;

import java.util.Scanner;

public class DiagonalDifference {
	
    static int diagonalDifference(int[][] a) {
    	int result = 0;
    	result = secondDiagonal(a) - firstDiagonal(a);
		return result;
    }

	private static int firstDiagonal(int[][] a) {
		int total = 0;
        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j){
				total = total + a[i][j];
				}
			}
		}
		return total;
	}
	
	private static int secondDiagonal(int[][] a) {
		int total = 0;
        for (int i = 0; i < a.length; i++) {
			for (int j = a.length; j >= 0; j--) {
				if (j == ((a.length - 1) -i)){
				total = total + a[i][j];
				}
			}
		}
		return total;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }

}
