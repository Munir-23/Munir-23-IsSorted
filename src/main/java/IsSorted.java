public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        if (arr == null){
            return false;
        }
        boolean isSorted = false;
        for (int i = 0; i < arr.length; i++){
            if(i == 0 ){ 
                continue;
             }
            // int prevNum = i--;
            if(arr[i] > arr[i-1]){
                System.out.println("Previous Number: " + arr[i-1]);
                System.out.println("Current Number: " + arr[i]);
            }
            else{
                return false;
            }
            if(i == arr.length - 1) {
                isSorted = true;
            }
        }
        return isSorted;

    }
}



//         if (arr == null){
//             return false;
//         }
//         boolean isSorted = false;
//         for (int i = 0; i < arr.length; i++){
//             if(i == 0 ){ 
//                 continue;
//              }
//             int prevNum = i--;
//             if(arr[i] > arr[prevNum]){
//                 System.out.println(arr[prevNum]);
//                 System.out.println(arr[i]);
            
//             }
//             else{
        
//                 return false;
//             }
//             if (i == arr.length -1){
//                 isSorted = true;
//             }
//         }
//         return isSorted;
//     }
// }

