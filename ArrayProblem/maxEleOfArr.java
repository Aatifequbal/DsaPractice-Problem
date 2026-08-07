public class maxEleOfArr {
    static int maximumElementOfArray(int arr[]) {
        int maxEle = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }

            // //===== MATH.MAX()===
            // int maxEle = arr[0];
            // for (int i = 0; i < arr.length; i++) {
            // maxEle = Math.max(maxEle , arr[i]);

        }
        return maxEle;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 59, 3, 1, 7 };
        int ans = maximumElementOfArray(arr);
        System.out.println(ans);

    }

}
