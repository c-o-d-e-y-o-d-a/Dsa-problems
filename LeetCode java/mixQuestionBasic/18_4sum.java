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

/*
    Time Complexity: O(N^2)
    Space complexity: O(N^2)

    Where 'N' is the number of element present in the given array.
*/

import java.util.HashMap;

public class Solution {
    public static String fourSum(int[] arr, int target, int n) {

        HashMap < Integer, Pair > map = new HashMap < > ();
        /* 
            Preparing a HashMap which will store sum of two 
            elements of array arr[] as key and their 
            indexes as value.
        */
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                map.put(arr[i] + arr[j], new Pair(i, j));
            }
        }
        
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int requiredSum = target - (arr[i] + arr[j]);
                /* 
                    If HashMap contains required sum then we must
                    ensure that both pairs does not contain 
                    common indexes.
                */
                if (map.containsKey(requiredSum) && !commonIdx(map.get(requiredSum), new Pair(i, j))) {
                    return "Yes";
                }
            }
        }
        // If we can not found the target sum then we return No.
        return "No";

    }

    private static boolean commonIdx(Pair p1, Pair p2) {
        return p1.idx1 == p2.idx1 || p1.idx1 == p2.idx2 || p1.idx2 == p2.idx1 || p1.idx2 == p2.idx2;
    }

    // Custom Pair class to store pair of indexes.
    static class Pair {
        int idx1;
        int idx2;

        Pair(int idx1, int idx2) {
            this.idx1 = idx1;
            this.idx2 = idx2;
        }
    }
}