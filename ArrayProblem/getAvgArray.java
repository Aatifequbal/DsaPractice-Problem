public class getAvgArray {

    static double getArray(int[] arr) {

        double sum = 0;
        int size = arr.length;

        for (int i : arr) {
            sum += i;
        }
        double avg = sum / size;
        return avg;

    }

    public static void main(String[] args) {
        int[] n = { 2, 4, 1, 3 };
        double dfg = getArray(n);
        System.out.println(dfg);
    }
}
