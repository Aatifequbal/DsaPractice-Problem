public class getPos_Neg_num {
    static int[] getPosNegNum(int arr[]) {
        int psoNum = 0;
        int negNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                psoNum += arr[i];
            } else {
                negNum += arr[i];
            }
        }
        int ans[] = { psoNum, negNum };
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 4, -3, 8, -7 };
        int ans[] = getPosNegNum(arr);
        System.out.println("positive somOfNum : " + ans[0]);
        System.out.println("negative somOfNum : " + ans[1]);

    }
}
