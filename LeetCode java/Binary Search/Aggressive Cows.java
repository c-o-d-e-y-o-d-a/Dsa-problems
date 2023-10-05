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
// optimised solution - 
import java.util.*;
public class Solution {
    public static boolean check(int[] arr,int gap,int cowNo){
        int cowsPlaced = 1;
        int len = arr.length;
        int lastEl = arr[0];
        for(int i=0;i<len;i++){
            if(lastEl+gap<=arr[i]){                         //this code checks wether at a certain gap , all cows will get a stall or not
                
                cowsPlaced++;
                

                if(cowsPlaced==cowNo){
                return true;
                }
                lastEl = arr[i];
                

            }
            
            
            


        }
        return false;




    }
    
    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        if(k==2){
            return stalls[stalls.length-1] - stalls[0];
        }
        int low = 1;//this is the minimum possible gap between the stalls
         int high = stalls[stalls.length - 1] ;   // this is the max possible gap bw the stalls ( its actually supposed to be smallerlol)
  
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(check(stalls,mid,k)){
                low = mid+1;
                ans = mid;

            }
            else{
                high = mid - 1;


            }

        }
        return ans;
        
        


        
       
    }
}
