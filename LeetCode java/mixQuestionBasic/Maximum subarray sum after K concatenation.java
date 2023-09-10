//Maximum subarray sum after K concatenation

// Given an integer array arr and an integer k, modify the array by repeating it k times.

// For example, if arr = [1, 2] and k = 3 then the modified array will be [1, 2, 1, 2, 1, 2].

// Return the maximum sub-array sum in the modified array. Note that the length of the sub-array can be 0 and its sum in that case is 0.

// As the answer can be very large, return the answer modulo 109 + 7.

 

// Example 1:

// Input: arr = [1,2], k = 3
// Output: 9
// Example 2:

// Input: arr = [1,-2,1], k = 5
// Output: 2
// Example 3:

// Input: arr = [-1,-2], k = 7
// Output: 0


//brute force solution

import java.util.* ;
import java.io.*; 
public class Solution {

	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		int[] arr1 = new int[n*k]; 
		int i=0;
		while(i<n*k){
			arr1[i]=arr.get(i%n);
			i++;
		}
		int ans = Integer.MIN_VALUE;
		int msf = 0;
		for(int j=0;j<arr1.length;j++){
			msf = arr1[j] + Math.max(msf,0);
			ans = Math.max(ans,msf);
		}

		return (long)ans;
	}
}

