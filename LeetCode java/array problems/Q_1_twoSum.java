/* brute force solution with tc- O(n^2) and sc - O(1)
Runtime
49 ms
Beats
43.43%
Memory
43.6 MB
Beats
91.40%*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    resultArray[0]=i;
                    resultArray[1]=j;
                }
            }
        }
        return resultArray;

        
    }
}
/* bettter solution with tc-O(n) and sc -O(n), uses hashmap (NOTE - IN HASHMAPS YOU DON'T NEED TO ITERATE
OVER EACH ELEMENT TO CHECK IF THEY CONTAIN A CERTAIN ELEMENT) to store the difference between the target and 
each integer in array and then checks if the difference is equal to any integer in the array , overall better 
Runtime
5 ms
Beats
59.24%
Memory
43.4 MB
Beats
96.17% */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
         HashMap<Integer, Integer> difference = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++){
            difference.put(target-nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(difference.containsKey(nums[i])){
                if(i!=difference.get(nums[i])){
                    resultArray[0]=i;
                    resultArray[1]=difference.get(nums[i]);

                }
                
            }
        }
        



            
            
        
        return resultArray;

        
    }
}