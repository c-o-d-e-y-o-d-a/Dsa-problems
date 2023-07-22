/* leetcode - 41 hard problem
 Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 */

//simplest and best solution with tc-nlogn and sc - O(1)
class Solution {
    public int firstMissingPositive(int[] nums) {
        int finalAns =1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==finalAns){
                finalAns++;
            }
        }
        return finalAns;
        
    }
}