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