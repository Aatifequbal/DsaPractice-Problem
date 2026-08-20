public class Twosum {
    static int[] twoSumProblem(int[] nums, int target){
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j< n; j++){
                if(nums[i] + nums[j] == target){
                    int ans[] = {i , j};
                    return ans;
                }
            }
        }

        int ans[] ={};
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,5,4,6};
        int ans[] = twoSumProblem(arr, 10);  
        System.out.println(ans[0]+" "+ans[1]);      
       
    }
}
