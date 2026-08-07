public class arrayMultiplyBy10 {
    static int[] multiplyEachEle(int[] arr) {
        int size = arr.length;
        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int ans[] = multiplyEachEle(arr);
        System.out.println("printing answer array : ");
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
