public class UniqueEle {
    static int uniqueEleOfArr(int arr[]){
        int xor = 0;
        for(int el : arr){
            xor^= el;
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,5,4,6,5,3,4,-9,-9,6,112};
        int ans = uniqueEleOfArr(arr);
        System.out.println(ans);
    }
}
