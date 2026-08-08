public class reverseArray {
    static void reverseAnArray(int arr[]){
        int n= arr.length;
        int i=0;
        int j=n-1;

        while(i <= j){
            //PERFORM THREE OPERATION
            // SWAP
            int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;

            //i++
            i++;

            //j--
            j--;
        }
        for(int k : arr){
            System.out.print(k+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        reverseAnArray(arr);
    }
}
