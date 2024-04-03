// semi optimised solution -
import java.util.*;
public class Solution {
    static boolean BinSearch(int[] arr,int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]>key){
                end = mid - 1;
            }
            else{start =  mid +1;}

        }
        return false;
    }
    public static boolean searchElement(int [][]MATRIX, int target) {
        boolean ans = false;
        int arrSize = MATRIX[0].length - 1;
        for(int i=0;i<MATRIX.length;i++){
            if(MATRIX[i][0]<= target && target<=MATRIX[i][arrSize]){
                ans = BinSearch(MATRIX[i],target);
            }
            if(ans)return ans;
        }
        return ans;
        
    }
}

// fully optimised approach - tc- O(log(n*m))

import java.util.*;
public class Solution {
    public static boolean searchElement(int [][]MATRIX, int target) {
        int start = 0;
        int end = (MATRIX.length * MATRIX[0].length)-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            int i = mid / MATRIX[0].length;
            int j = (mid % MATRIX[0].length) ;
            if(MATRIX[i][j] == target)return true;
            else if(MATRIX[i][j] > target){
                end = mid -1 ;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}