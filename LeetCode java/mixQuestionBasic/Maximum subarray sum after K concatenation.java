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

// better approach - if k i.e. the no of times you need to concat is 1 , then simply return the kandane's sum of that array
//if k is greater than 1 and sum of all elements in the array is negative , then max sum will be equal to when kandane's algo is applied
//after concatening the array at the end once , if sum is +ve , then the greatest sum can be found using the formulae - kandaneSumOf2Arrays + (K-2) * sum of the array;

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int kandaneSum(ArrayList<Integer> arr1){
		
		int msf = Integer.MIN_VALUE;
		int cMaxVal = 0;
		for(int i=0;i<arr1.size();i++){
			cMaxVal = Math.max(arr1.get(i), cMaxVal + arr1.get(i));
			msf = Math.max(cMaxVal, msf);
		}
		return msf;
	}

	public static int kandaneSumOfTwo(ArrayList<Integer> arr1,int n){
		for(int i=0;i<n;i++){
			arr1.add(arr1.get(i));
		}
		return kandaneSum(arr1);
	}

	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		int sum =0;

		for(int i=0;i<arr.size();i++){
			sum += arr.get(i);
		}
		if(k==0)return 0;
		if(k==1) return (long) kandaneSum(arr);
		else if(sum<0) return (long)kandaneSumOfTwo(arr,n);
		else{return (long)(kandaneSumOfTwo(arr,n) + (k-2)*sum);}
		 
		
	}
}


//another approach: most basic thing to do is to get back to the starting index of the array using the modulo '%' property


import java.util.*;

public class Solution {

    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {

        int msf = Integer.MIN_VALUE;
        int mrn = 0;

        for (int i = 0; i < n * k; i++) {
            mrn = Math.max(arr.get(i % n), mrn + arr.get(i % n));
            msf = Math.max(msf, mrn);
        }

        return (long) msf;
    }
}