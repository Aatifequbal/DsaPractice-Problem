package Two_D_Array;

public class TransPose {
    public int[][] transpose(int[][]matrix){
        if(matrix == null || matrix.length== 0){
            return new int [0][0];
        }
        //for original array 
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        // for new array
        int newtotalRows = totalCols;
        int newtotalCols = totalRows;
        int ans [][] = new int[newtotalRows][newtotalCols];

        //Actual ligic
        for(int i=0; i<totalRows; i++){
            for(int j=0; j<totalCols; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        TransPose t = new TransPose();
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int res[][]= t.transpose(arr);
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
