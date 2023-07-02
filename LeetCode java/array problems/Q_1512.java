class Solution {
    public int numIdenticalPairs(int[] nums) {
        int no_of_pairs = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    no_of_pairs++;
                }

            }
        }
        return no_of_pairs;
    }
}

//mysolution - time complexity - O(n^2), space complexity - O(1)


// code to solve in tc - o(n) and sc - o(n),sacrifices space for time
// code from someone else
class Solution {
    public int numIdenticalPairs(int[] guestList) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int ans = 0;
        
        for(int friend:guestList)
        {
            int friendCount = hm.getOrDefault(friend,0);
            ans+=friendCount;
            hm.put(friend,friendCount+1);
        }
        
        
        return ans;
    }
}