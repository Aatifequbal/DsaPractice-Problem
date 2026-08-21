package Two_D_Array;

import java.util.*;

public class rowSum {
    public List<Integer> sumOfEachRow(int[][]arr){
        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        for(int row=0; row<m; row++){
            int sum=0;
            for(int col=0; col<n; col++){
                int value = arr[row][col];
                sum+=value;
            }
            result.add(sum);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{4,6,7}};
        rowSum obj = new rowSum();
        List<Integer> result = obj.sumOfEachRow(arr);
        System.out.println(result);

    }
}
