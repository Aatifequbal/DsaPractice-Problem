public class arrayIntersaction {
    static void printintersection(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }

            }

        }

    }

    public static void main(String[] args) {
        int arr1[] = { 9, 7, 2, 4, 5 };
        int arr2[] = { 0, 9, 2, 11, 5 };
        printintersection(arr1, arr2);

    }
}






















// ONLY FOR PRACTICE PERPOSE 

// public class arrayIntersaction {

//     static void arrayIntersaction(int arr1[], int arr2[]){
  
//         for(int i=0; i<=arr1.length; i++){
//             for(int j=0; j<arr2.length; j++){
//                 if(arr1[i] == arr2[j]){
//                     System.out.println(arr1[i]);
//                     break;
//                 }
//             }
//         }
//     }
    

    

//     public static void main(String[] args) {
//         int arr1[] = { 9, 7, 2, 4, 5 };
//         int arr2[] = { 0, 9, 2, 11, 5 };
//         arrayIntersaction(arr1, arr2);
       

//     }
// }
