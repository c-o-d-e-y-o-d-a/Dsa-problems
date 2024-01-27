//used to solve largest of contigous array problem 
/* 

the part where we need to compare the finalAns with the sumtillnow is common BUT
there's a twist , everytime the value of the sumtillNOw is less than the current index
we make sumTillNOw = currentIndex, thats it , thats the trick
tc-O(n) sc - O(1)


Brute force for the solution is just going through the array and finding sum of possible arrays and comparing the sums
tc of that - O(n*n*n) or O(n*n)(if you store previous values)

 */

class Solution {
    public int maxSubArray(int[] nums) {
        int meh = 0;
        int msf = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            meh+=nums[i];
            if(meh<nums[i]){
                meh=nums[i];
            }
            if(meh>msf){
                msf=meh;
            }
        }
        return msf;
        
    }
}
//simplest way to implement kadane's algo


  for (int i = 1; i < n; ++i) {
            current = arr[i] + Math.max(current, 0);
            answer = Math.max(answer, current);
        }