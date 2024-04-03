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

/* Best solution using two pointers currently only working for 55/57 test cases*/
/* pointer method explanation -
- you need a sorted array for this method to work
- then you need to have one pointer which starts from first index and another that starts from last
- on adding the integer at position of first pointer with the element at the index of second pointer
if the sum is greater than the , just see the code its self explanatory */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        int[] nums2 = nums.clone();
        int start = 0;
        int endIndex = nums.length-1;
        Arrays.sort(nums);
        

        while(start!=endIndex){
            if(nums[start]+nums[endIndex]>target){
                endIndex--;
            }
            if(nums[start]+nums[endIndex]<target){
                start++;
            }
            if(nums[start]+nums[endIndex]==target){
                break;
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==nums[start]){
                resultArray[0]=i;

            }
            else if(nums2[i]==nums[endIndex]){
                resultArray[1]=i;
            }
        }
         
        
        



            
            
        
        return resultArray;

        
    }
}


/* hashmap method by using a single for loop(from leetcode editorial) */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}