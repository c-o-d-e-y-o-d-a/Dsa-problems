class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] solutionArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int smallerNumCount =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    smallerNumCount++;
                }
            }
            solutionArray[i]=smallerNumCount;
        }
        return solutionArray;
        
    }
} 
//my solution
//space complexity - O(n), time compl.. - O(n^2)


//some other person's O(n) (time complexity)solution
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];

        for(int i = 0; i < nums.length; ++i)
            count[nums[i]]++;

        int sum = 0;

        for(int i = 0; i < 101; ++i) {
            sum += count[i];
            count[i] = sum;
        } 

        for(int i = 0; i < nums.length; ++i)
            if(nums[i] != 0)
                nums[i] = count[nums[i] - 1];

        return nums;
    }
} 