package Two_D_Array;

public class SearchInSortedMatrix {
    //brute force approach 
    //tc O(n^) 
    //sc O(1)
     public static void findkey(int matrix[][], int key) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == key) {
                    // System.out.println(matrix[i][j]);
                    System.out.println(i + " ," + j);
                }
            }
        }
    }
    //top to bottom
    //tc O(n+m) 
    //sc O(1)
    public static void find(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m - 1;

        while (row < n && col >= 0) {
            int mid = row + (col - row) / 2;

            if (matrix[row][col] == key) {
                System.out.println(row + "," + col);
                return;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("-1");

    }
    // bottom to top
    //top to bottom
    //tc O(n+m) 
    //sc O(1)
    public static boolean stearsSearch(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = n - 1;
        int col = 0;

        while (n >= 0 && col < m) {
            if (matrix[row][col] == key) {
                System.out.println(row + "," + col);
                return true;
            } else if (matrix[row][col] > key) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("key not found : ");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 },
                { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

        stearsSearch(arr, 45);
    }
}
