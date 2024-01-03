package matrix.matrixdiagonalsum;

public class MatrixDiagonalSum {

    /*
    Given a square matrix mat, return the sum of the matrix diagonals.
    Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
     */

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j || (i + j) == (mat.length - 1)) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
