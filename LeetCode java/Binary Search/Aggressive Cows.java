// The maximum possible minimum distance between any two cows will be 3 when 4 cows are placed at positions {0, 3, 7, 10}.
//  Here distance between cows are 3, 4 and 3 respectively.

// my solution , the approach is not perfect and only passes 4/8 the test cases
import java.util.*;
public class Solution {
    public static int ceilSearch(int[] arr,int start, int end,int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{start = mid+1;}
            
        }
        return start;
        


    }
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        
        int low = 0;
        int high = stalls.length-1;
        int current = stalls[0];
        int diff = stalls[high]/k;
        int finalAns = Integer.MAX_VALUE;
        if(k==2){
            return (stalls[high]-stalls[0]);
        }
        while(low<=high){
            int a =ceilSearch(stalls,low,high,current+diff);
            finalAns = Math.min(finalAns,stalls[a]-current);
            current=stalls[a];
            low =  a+1;
        }
        return finalAns;


        
       
    }
}

