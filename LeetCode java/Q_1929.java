class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = (2*nums.length);
        int[] nums2 = new int[l];
        for(int i=0;i<nums.length;i++){
            nums2[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums2[i+nums.length]=nums[i];
        }
        return nums2;

        
    
        
    }
}
//you create another array with twice the length and put all the elements inside 
//the new array by looping over the both the arrays twice