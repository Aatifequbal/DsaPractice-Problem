import java.util.HashMap;

public class returnFrequency {

    static int[] highestAndLowest(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num , freq.getOrDefault(num,0)+1);
        }
        int highestFreq  = Integer.MIN_VALUE;
        int higestNum = -1;
        for(int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq= freq.get(key);

            if(currentFreq  > highestFreq){
                highestFreq=currentFreq;
                higestNum = currentKey;
            }
        }
         int lowestFreq  = Integer.MAX_VALUE;
        int   lowestNum = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq=  freq.get(key);

            if(currentFreq < lowestFreq){
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {higestNum , lowestNum};
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,5,};
        int ans []= highestAndLowest(arr);
        System.out.println("Higest freq num : "+ans[0]);
         System.out.println("lowest freq num : "+ans[1]);

    }
}