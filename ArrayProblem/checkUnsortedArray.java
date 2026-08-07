public class checkUnsortedArray {
    static int checkUnsortedArrayel(int arr[]) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i + 1] <= arr[i]) {
                return arr[i + 1];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 4, 9 };
        int ans = checkUnsortedArrayelmet(arr);
        System.out.println(ans);
    }

}