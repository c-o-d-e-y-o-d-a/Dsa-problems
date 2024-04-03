//my solution , is not working rn
import java.util.* ;
import java.io.*; 
public class Solution {
    static boolean isValid(int[] arr, int m, int targSum) {
    int count = 1;
    int cSum = 0;
    for (int i = 0; i < arr.length; i++) {
       cSum += arr[i];
       if(cSum > targSum){
           count++;
           cSum = arr[i];
       }
    }
    return count <= m;
}
        
        


    
    public static long ayushGivesNinjatest(int n, int m, int[] arr) {
    if (n > m) return -1;

    int start = 0;
    int end = 0;
    long finalAns = 0;

    for (int i = 0; i < arr.length; i++) {
        end = end + arr[i];
        start = Math.max(start, arr[i]);

    }
    

    while (start <= end) {
        int mid = start + (end - start) / 2 ;
        if (isValid(arr, m, mid)) {
            finalAns = mid;
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
    return (long) finalAns+1;
}
}