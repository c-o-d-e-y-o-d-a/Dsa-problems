import java.util.* ;
import java.io.*; //input array is already sorted and has unique numbers 
public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        int finalAns = 0;
        int end = n-1;
        int start = 0;
        while(start<end){
            if(arr[end]+arr[start]>target){
                end--;
            }
            else if(arr[end]+arr[start]<target){ //don't use if statements
                start++;
            }
            else if(arr[end]+arr[start]==target){//always remember to modify values at this condition of equality
                finalAns++;
                start++;
                end--;
            }
        }
        if(finalAns==0)return -1;
        return finalAns;
        
    }
}