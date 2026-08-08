public class rightShiftByOnePosition {

    static void rightShiftby1(int arr[]) {
        // step1: store last value of arr in temp
        int n = arr.length;
        int temp = arr[n - 1];

        // step2: shift all value of arr
        for (int i=n-1; i > 0; i--) {

            arr[i] = arr[i - 1];
        }
        // step3: replace temp value in arr[0] index
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        rightShiftby1(arr);
        for (int i : arr) {
            System.out.print(i +" ");

        }

    }

}



//K TIMES SHIFT;

// public class rightShiftByOnePosition {

//     static void rightShiftby1(int arr[], int k) {
//         int n = arr.length;

//         // Step 1: Last k elements ko temporary array mein store karo
//         int temp[] = new int[k];

//         for (int i = 0; i < k; i++) {
//             temp[i] = arr[n - 1 - i];
//         }

//         // Step 2: Baaki elements ko k positions right shift karo
//         for (int i = n - k - 1; i >= 0; i--) {
//             arr[i + k] = arr[i];
//         }

//         // Step 3: Temporary array ke elements ko starting mein place karo
//         for (int i = 0; i < k; i++) {
//             arr[i] = temp[i];
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {10, 20, 30, 40, 50, 60, 70};

//         // Array ko 2 positions right shift karo
//         rightShiftby1(arr, 3);

//         // Final array print karo
//         for (int i : arr) {
//             System.out.print(i + " ");
//         }
//     }
// }