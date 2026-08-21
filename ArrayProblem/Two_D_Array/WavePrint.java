package Two_D_Array;

import java.util.ArrayList;
import java.util.List;

public class WavePrint {
    public List<Integer> wavePrintMatrix(int[][]matrix){
        List<Integer> result = new ArrayList<>();
        int n = matrix[0].length;
        int m = matrix.length;

        for(int col=0; col<n; col++ ){
            if((col & 1)==0){
                for(int row=0; row<m; row++){
                    result.add(matrix[row][col]);
                }
            }else{
                for(int row=n-1; row>=0; row--){
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        WavePrint obj = new WavePrint();
        List<Integer> result = obj.wavePrintMatrix(arr);
        System.out.print(result+" ");
    }
}
