//tc-O(n) sc-O(n)
//hard question
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hash1 = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                hash1.add(nums[i]);

            }
            
        }
        for(int i =1;i<=nums.length;i++){
            if(!(hash1.contains(i))){
                return i;
            }

        }
        return nums.length+1;
        
        
    }
}

//you need to find the smallest positive integer not present in the array
// the values such an integer can take will always be from 1 to the length of the array( think about it)