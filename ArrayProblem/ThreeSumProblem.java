import java.util.ArrayList;
import java.util.List;

public class ThreeSumProblem {
    List<List<Integer>> threeSum(int[]nums){

       List <List<Integer>> output = new ArrayList<>();
        int n = nums.length;
        int target=0;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j< n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i] + nums[j] +nums[k] == target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    output.add(temp);

                }
            }
                
            }
        }
        return output;
       
    }
    public static void main(String[] args) {
    int arr[] = {1, 0, 1, 2, -1, -4};

    ThreeSumProblem obj = new ThreeSumProblem();

    List<List<Integer>> ans = obj.threeSum(arr);

    System.out.println(ans);
}
}
