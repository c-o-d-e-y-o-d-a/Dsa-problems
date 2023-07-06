/*Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 

Example 1:

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.  
time compl - O(n^2)  space coml - O(1)

*/

class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int prod = (nums[i]-1)*(nums[j]-1);
                if(prod>maxProd){
                    maxProd = prod;

                    
                }
            }
        }
        return maxProd;
        
        
    }
}


/*Time Complexity = O(n)
Space Complexity = O(1)
  solution with better space complexity*/

  public int maxProduct(int[] nums) 
    {
        //Declare 2 values & assign them to 0
        //Its ok to assign zero
        //Since range of elemnts is given as, 1 <= nums[i] <= 10^3,
        int winner=0, runner=0;
        
		//Now, our task to find the maximum 2 values.
		for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > winner)
            {
                runner = winner;
                winner = nums[i];
            }
            else if(nums[i] > runner)
            {
                runner = nums[i];
            }
        }
        
		//Finally returning the result.
        return (winner-1) * (runner-1);
    }