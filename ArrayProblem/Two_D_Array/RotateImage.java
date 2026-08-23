package Two_D_Array;

public class RotateImage {

    public static void rotate(int[][] matrix) {

        //step1 transpose
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse row
        for(int row=0; row<n; row++){
            int start=0;
            int end = n-1;

            while(start < end){
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;

                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3, },
                { 5, 6 ,7,},
                { 9,8,4 }
        };

        rotate(matrix);

        // Print rotated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}