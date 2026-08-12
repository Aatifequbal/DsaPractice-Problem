public class getSort {

    static int[] sortingFun(int arr[]) {
        int j = arr.length - 1;
        int i = 0;
        int temp;

        while (i < j) {

            if (arr[i] == 1 & arr[j] == 0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // arr [i] = 0;
                // arr[j] = 1;

            }
            if (arr[i] == 0) {

                i++;

            }
            if (arr[j] == 1) {
                j--;
            }

        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 0, 0, 1, 0, 1, 1, 1 };
        int ans[] = sortingFun(arr);

        for (int el : ans) {
            System.out.print(el + " ");
        }

    }

}

// public class getSort {

// static int [] returnSort(int nums[]){
// int i=0;
// int j=nums.length-1;

// while(i<j){
// if(nums[i] ==1 & nums[j]==0){
// int temp = nums[i];
// nums[i] = nums[j];
// nums[j] = temp;
// }
// if(nums[i]== 0){
// i++;
// }
// if(nums[j] ==1){
// j--;
// }
// }
// return nums;
// }
// public static void main(String[] args) {
// int arr[] = {1, 0, 1, 0, 0, 1, 0, 1, 1, 1};
// int ans[] = returnSort(arr);
// for(int el : ans){
// System.out.print(el+ " ");
// }
// }
// }