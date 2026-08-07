public class swapAlternateElement {
    static int[] swapSortedAlternateEleArray(int arr[]){
        for(int i=0; i<arr.length-1; i +=2){
            if(arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
               
            }
            
        }
        return arr ;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int ans [] = swapSortedAlternateEleArray(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
