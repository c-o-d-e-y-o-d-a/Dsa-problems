/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Runtime
Details
15ms
Beats 25.74%of users with Java
Memory
Details
46.36mb
Beats 98.30%of users with Java
 */


/*HOW THE CODE WORKS-
you iterate once over the array and store each integer as key and the no of times it appears in array as its value
then you iterate over each value of hashmap to find the kay whose value is greater than half the length of array


space - O(n) - time same
 */
class Solution {
    public int majorityElement(int[] nums) {
        int halfLen = nums.length/2;

        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!(map1.containsKey(nums[i]))){
                map1.put(nums[i],1);
            }
            else{
                map1.put(nums[i],map1.get(nums[i])+1);
            }

        }
        for(Integer i : map1.keySet()){
            if(map1.get(i)>halfLen){
                return i;
            }

        }
        return -1;
    }
}


/* by sorting the array i guessed this approach but couldn't implemet it fully will provide both codes for future refrence */

class Solution {
    public int majorityElement(int[] nums) {
        int halfLen = nums.length/2;
        Arrays.sort(nums);
        int currentNum = nums[0];
        int finalAns =0;
        int count=0;

        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==currentNum){
                count++;
                
            }
            if(count>halfLen){
                finalAns=currentNum;
            }
            else{
                currentNum = nums[i];
                count=0;
            }
            

        }
        return finalAns;
        

        
    }
}
// this was my try at this type of solution but this didn't work

// this is the correct and super simple way of doing this question

/* logic used -
the majority element would always be at the index which is exactly in between the array 
after we have sorted the array ex--
let array be 2,1,1,2,2,2,4
after sorting array will be
1,1,2,2,2,2,4

time compl - nlog(n) space compl - O(n)
 */

class Solution {
    public int majorityElement(int[] nums) {
        int halfLen = nums.length/2;
        Arrays.sort(nums);
        return nums[halfLen];
    }
}



/* MORE's voting algorithm  */


