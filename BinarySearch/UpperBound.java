package BinarySearch;

public class UpperBound {
    static int getUpperBound(int arr[] , int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] <= target){
                start= mid+1;
            }
            else{
                ans = mid;
                end= mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        int target = 12;
        int ans = getUpperBound(arr, target);
        System.out.println("ans: "+ans);
    }
}
