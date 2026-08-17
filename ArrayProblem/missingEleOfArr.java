// public class missingEleOfArr {

//     static int getMissing(int arr[]) {
//         int n = arr.length;
//         // Sorting
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }

//             }
//         }
//         // find missing element

//         int missEle = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != missEle) {
//                 return missEle;
//             }
//             missEle++;
//         }
//         return missEle;

//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 0, 4, 3 };
//         int ans = getMissing(arr);
//         // for (int i : ans) {
//         // System.out.println(i);
//         // }
//         System.out.println(ans);

//     }
// }


// 2nd method



// public class missingEleOfArr {
//     static int getMissing(int arr[]) {
//         int actSum = 0;
//         int expSum = 0;

//         for(int i=0; i<=arr.length; i++){
//             expSum+=i;
//         }
//         return expSum;
//         // for(int i=0; i< arr.length; i++ ){
//         //     actSum+= arr[i];
//         // }
//         // return expSum-actSum;

//     }
//     public static void main(String[] args) {
//         int arr[] = { 0, 1, 2,3, 4, 5 ,7};
//         int ans = getMissing(arr);
//         System.out.println(ans);

//     }
// }






public class missingEleOfArr {
    static int missingNumber(int nums[]) {
        int xorSum = 0;
        // what all the array element 
        for(int num : nums){
            xorSum =  xorSum ^ num;
        }
        //xor with all the element in the range
            for(int i=0; i<=nums.length; i++){
                xorSum = xorSum ^ i;
            }
        //return ans
        return xorSum;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1,2,3,5,6};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}
