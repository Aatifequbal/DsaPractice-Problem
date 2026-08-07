public class getZerAndOneCount {
    static int[] getZerAndOneCount(int arr[]) {
        int zeroCount = 0;
        int oneCount = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else {
                oneCount++;

            }
        }
        int ans[] = { zeroCount, oneCount };
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0 };
        int ans[] = getZerAndOneCount(arr);
        System.out.println("sum of zeroCount: " + ans[0] + "\nSum of oneCount: " + ans[1]);

    }
}
