class Solution {
    public int[] buildArray(int[] nums) {
        int[] nums2 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
           
            nums2[i]=nums[nums[i]];
        }
        return nums2;

        
    }
}
//easy problem - easy solution , just put the formulae to make the new array as given in the formulae

// this is supposed to be a better solution apparently
// time complexity - O(n) space complexity -O(n)
class Solution {

    //using recursion
    public int[] buildArray(int[] nums) {
        aPermutation(nums,0);

        return nums;
    }
    
    void aPermutation(int[] nums,int start){
        if(start<nums.length){
        int temp=nums[start];
        int result=nums[temp];
        aPermutation(nums,start+1);
        nums[start]=result;
    }
  
    }
} 

//O(1) space comp solution
public int[] buildArray(int[] nums) {
	int mask = 1023; // Decimal value of the binary number '1111111111'
	for(int i = 0; i < nums.length; i++)
		nums[i] |= (nums[nums[i]] & mask) << 10;
	for(int i = 0; i < nums.length; i++)
		nums[i] = nums[i] >> 10;
	return nums;
}