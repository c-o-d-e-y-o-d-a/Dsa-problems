// here's the brute force solution -beats 100% on runtime on leetcode
//you basically get the no of each int in array and add that no of integers in the array at the required index , this takes 
//2 for loops but we need to optimise the solution to solve the problem in a single for loop
class Solution {
    public void sortColors(int[] arr) {
        int noOf0s = 0;
        int noOf1s = 0;
        int noOf2s = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)noOf0s++;
            if(arr[i]==1)noOf1s++;
            if(arr[i]==2)noOf2s++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<noOf0s){
                arr[i]=0;
            }
            else if(i>=noOf0s&&i<noOf0s+noOf1s){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
    }
}

/* actual dnf algorithm 

how it works - 
we keep 3 points , mid ,low and high , mid and low start at 0 index, high starts at the end 
we use the mid pointer to find elements that need to be swapped and high and low to store the places where these should be swapped with










*/


import java.util.* ;
import java.io.*; 
public class Solution 


{

    static void swap(int[] arr1 , int swapIndex1, int swapIndex2){
        int temp = arr1[swapIndex1];
        arr1[swapIndex1] = arr1[swapIndex2];
        arr1[swapIndex2] = temp;

    }
    static void sort012(int[] arr)
    {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;


            }
            else if(arr[mid]==1)mid++;
            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }

           
        }

    }
}