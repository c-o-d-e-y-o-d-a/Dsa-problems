/* my solution 25 / 73 testcases passed 
what it fails at - restarting the chain */

class Solution {
    public int longestConsecutive(int[] nums) {
        int finalAns = 1;
        if(nums.length!=0 && nums.length!=1){
            HashMap<Integer,Integer> ElementStorage = new HashMap<Integer,Integer>();
        Set<Integer> uniqueArray = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            uniqueArray.add(nums[i]);
            
        }
        Integer[] nums2 =uniqueArray.toArray( new Integer[uniqueArray.size()]) ;
        
        //you don't need a hashMap and hashSet seperately , hashSet allows you to
        //check if an element exists in O(1) time just like hashmaps
       for(int i=0;i<nums2.length;i++){
            ElementStorage.put(nums2[i],i);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(ElementStorage.containsKey(nums2[i]+1)){
                finalAns++;
                
            }
            
            
            
        }
        }
        if(nums.length==0){
            finalAns=0;
        }
        
        return finalAns;

        
        
    }
}

/* Better solution with tc - nlogn sc - O(1)  this is not pure brute force but still wrong bc the 
questions specifically asked to solve question in tc - O(n)
how this works, you just count it in a variable if the last index was exactly 1 less than 
the element at current index, you reset value of counting variable if it wasn't 
in the end you just compare the value of seqeunce with the max length found tillnow
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        Arrays.sort(nums);
        int sequenceLen = 1;
        int maxLen = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sequenceLen++;

            }
            else if(nums[i] == nums[i-1])continue;
            else{
                sequenceLen=1;
            }
            maxLen = Math.max(maxLen,sequenceLen);
        }
        return maxLen;
        
    }
}

/* solution to solve the question in O(n) time and O(n) space 

Runtime
Details
474ms
Beats 7.83%of users with Java
Memory
Details
62.13mb
Beats 29.03%of users with Java*/
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueArraySet = new HashSet<Integer>();
        int ans =1;
        if(nums.length==0)return 0;
        for(int i=0;i<nums.length;i++){
            uniqueArraySet.add(nums[i]);
        }//building an hashset so it can contain unique elements
        for(int i=0;i<nums.length;i++){
            if(uniqueArraySet.contains(nums[i]-1))continue;//we don't wanna run loops unecessarily here if the number before the current
            //number exists then it will not run the loop bc the elements are random in set and if the number right before the current number exists
            //then that needs to be the startpoint for the chain ex- 11 12 13 there is no need to even check from 12 if 11 exists
            //if you remove this if statement then tc beconmes O(n^2)
            
            int startVal = nums[i];
            while(uniqueArraySet.contains(startVal)){
                //here we check if the number right after the start point exists or not and we keep running this while loop to
                //move to the next element and subtract the value we get this way from the value of the element to get the 
                //length of the chain
                
                startVal++;

            }
            int len = startVal-nums[i];
            ans = Math.max(len,ans);//we finally if the length of chain is greater than that of all other elements

        }
        return ans;

    }
}