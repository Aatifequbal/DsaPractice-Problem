package SortingMethod;

public class SelectionSort {
    // time complexity big O(n^2)
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 4, 1, 3, 2 };
        selectionSort(arr);
        System.out.println("Printing Sorted Array");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
