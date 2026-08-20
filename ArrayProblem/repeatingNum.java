import java.util.*;
public class repeatingNum {
    static int getreaptingNum(int arr[]){

        HashMap<Integer , Integer> freq= new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);

        }
        for(int i : arr){
            if(freq.get(i) > 1){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,5,};
        int ans =getreaptingNum(arr);
        System.out.println(ans);
    }
}
