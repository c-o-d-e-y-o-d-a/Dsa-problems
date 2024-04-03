/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 
 */

//sc-o(n*n), tc-O(1)

import java.util.ArrayList; 
public class Solution {
	public static void pushZerosAtEnd(ArrayList<Integer> arr)
	{
		int n = arr.size();
		for(int i=0;i<n;i++){
			if(arr.get(i)==0){
				arr.add(0);
			}
		}
		for(int i=n-1;i>-1;i--){
			if(arr.get(i)==0){
				arr.remove(i);
			}
		}
	}
}

//sol with sc- o(n) and tc - O(n)

class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int ind = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans[ind]=nums[i];
                ind++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[ind]=0;
                ind++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
        
    }
}

//sc-O(1),tc-O(n)

class Solution {
    public void moveZeroes(int[] nums) {
        int firstZero = 0;
        int nonZero = 0;
        
        while (nonZero < nums.length) {
            if (nums[nonZero] != 0) {
                if (firstZero != nonZero) {
                    int temp = nums[firstZero];
                    nums[firstZero] = nums[nonZero];
                    nums[nonZero] = temp;
                }
                firstZero++;
            }
            nonZero++;
        }
    }
}
