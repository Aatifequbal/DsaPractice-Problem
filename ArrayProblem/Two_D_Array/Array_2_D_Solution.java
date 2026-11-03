package Two_D_Array;

class Array_2_D_Solution {
    public static void print_7(int arr[][], int key) {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key) {
                    count++;

                }
            }
        }
        System.out.println(count);
        return;
    }

    public static int calSecondRowOfMatrix(int nums[][]) {
        int sum = 0;

        for (int j = 0; j < nums[1].length; j++) {
            sum += nums[1][j];
        }
        return sum;

    }

    public static void findTransPoseOfMatrix(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arrays [][] = {{4,7,8},{8,8,7}};
        print_7(arrays, 77);

        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(calSecondRowOfMatrix(nums));

        int mat[][] = { { 11, 12, 13 }, { 21, 22, 23 } };
        findTransPoseOfMatrix(mat);

    }
}