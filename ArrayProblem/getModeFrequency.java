import java.util.HashMap;

public class getModeFrequency {
    static int modeFrequency(int arr[]){
        HashMap<Integer , Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);

        }
        // for(int i: freq.keySet()){
        //     System.out.println(i+ " ->"+freq.get(i));
        // }

        int maxFreq = -1;
        int maxFreqKeyIs = -1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyKiFrequency = freq.get(key);
            if(currentKeyKiFrequency >maxFreq){
                // mujhe naya max mil gya
                maxFreq = currentKeyKiFrequency;
                maxFreqKeyIs = currentKey;
            }
        }
        // jab loop se bahar aaoge to maxFreq wali key ready hoga
        return maxFreqKeyIs;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,4,5,5,5,5,5};
        int ans =modeFrequency(arr);
        System.out.println(ans);
    }
}
