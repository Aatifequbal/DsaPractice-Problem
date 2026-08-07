public class findTargetElement {

    static boolean returnTarget(int arr[], int target) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                // System.out.println("target index is : " +i);
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 3, 1, 7 };
        boolean res = returnTarget(arr, 7);
        System.out.println(res);

    }
}
