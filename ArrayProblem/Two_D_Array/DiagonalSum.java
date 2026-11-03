package Two_D_Array;

public class DiagonalSum {
    public static int calDiagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }

                else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int optimalSolutionDiagonalSum(int matrixs[][]) {
        int sum = 0;
        int n = matrixs.length;
        for (int i = 0; i < n; i++) {
            // primary diigonals
            sum += matrixs[i][i];

            if (i != n - 1 - i) {

                sum += matrixs[i][n - 1 - i];
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int ans = calDiagonalSum(matrix);
        System.out.println(ans);

        int res = optimalSolutionDiagonalSum(matrix);
        System.out.println(res);
    }
}
