/* couldn't pass all the test cases 

300 / 335 testcases passed*/

class Solution {
    public boolean checkPossibility(int[] nums) {
        int lenOfnums = nums.length;
        Boolean finAns = true;
        int num = 0;

        for(int i=1;i<lenOfnums;i++){
            if(i!=nums.length-1 && i!=0){
                if(nums[i]>nums[i+1] || nums[i-1]>nums[i]){
                num++;

                

            }

            }
            else if(i==lenOfnums-1){
                if(nums[i]<nums[i-1]){
                    num++;
                }
            }
            


        }
        if(num==0 || num==1){
            return true;
        }
        else{
            return false;
        }
        
    }
}