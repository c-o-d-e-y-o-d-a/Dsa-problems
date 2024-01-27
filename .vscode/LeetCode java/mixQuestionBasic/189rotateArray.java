/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4] */

//logic used - the array is back to its original form after shifting it array.length times
class Solution {
    public void rotate(int[] nums, int k) {
        if(k==nums.length)return;
        if(k>nums.length){
            k=k%nums.length;
        }
        
        

        int[] ans = new int[nums.length];
        int ind = 0;
        for(int i=nums.length-k;i<nums.length;i++){
            ans[ind]=nums[i];
            ind++;  
        }
        for(int i=0;i<nums.length-k;i++){
            ans[ind]=nums[i];
            ind++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];

        }
        
    }
}

//solution with tc- o(n*n) and sc - o(1)
//passed 37 out of 38 test cases
//uses swapping last element len-1 time , till it reaches the beginning

class Solution {
    public void rotate(int[] nums, int k) {
        if(k==nums.length)return;
        if(k>nums.length){
            k=k%nums.length;
        }
        for(int i=0;i<k;i++){
            int ind = nums.length-1;
            while(ind>0){
                int temp = nums[ind];
                nums[ind]=nums[ind-1];
                nums[ind-1]=temp;
                ind--;
            }
        }
        

        
        
    }
}

//solution with linear time and constant space
//reverse the array toget last elements infront and then reverse the first k elements
//and then reverse the rest

class Solution {
    public void reverse(int[] arr,int ind1,int ind2){
        while(ind1<ind2){
            int temp = arr[ind1];
            arr[ind1]=arr[ind2];
            arr[ind2]=temp;
            ind1++;
            ind2--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(k==nums.length)return;
        if(nums.length==1)return;
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        

        
        
    }
}
// for a 2d array , question on coding ninja

import java.util.* ;
import java.io.*; 
public class Solution {
	public static void reverse(int[] mat,int ind1,int ind2){
		while(ind1<ind2){
			int temp= mat[ind1];
			mat[ind1] = mat[ind2];
			mat[ind2] = temp;
			ind1++;
			ind2--;
		}
	}
	public static int[][] rotateMatRight(int[][] mat, int n, int m, int k) {
		k=k%m;
		for(int i=0;i<n;i++){
			reverse(mat[i],0,m-1);
			reverse(mat[i],0,k-1);
			reverse(mat[i],k,m-1);

		}
		return mat;
	}
}