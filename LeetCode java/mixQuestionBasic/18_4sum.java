// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

 

// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2:

// Input: nums = [2,2,2,2,2], target = 8
// Output: [[2,2,2,2]]
 

//  solution is for the coding ninja one , where all indices must be different and you only need to return a boolean value and not the indices
//solutoin i came up with , passed 2/10 test cases , uses two pointers
import java.io.*;
import java.util.* ;

public class Solution {
  public static Boolean ifFourSumExists(int[] arr,int target,int n){
    int start1 = 0;
    int start2 = 1;
    int end1 = n-2;
    int end2 = n-1;
    
    while(start1<end1 && start1 <end2 && start2<end1 && start2<end2){
      int sum = arr[start1] + arr[start2] + arr[end1] + arr[end2];
      if(sum == target ) return true;
      if(sum<target){
        if(start1+1 == start2){start2++;}
        else{start1++;}
      }
      else if(sum>target){
        if(end1+1 == end2){
          end1--;
        }
        else{
          end2--;
        }
      }

    }
    return false;

  }
  public static String fourSum(int[] arr, int target, int n) {
    Arrays.sort(arr);
    if(ifFourSumExists(arr,target,n)){return "Yes";}
    else{return "No";}
      
  }
}

//

f
