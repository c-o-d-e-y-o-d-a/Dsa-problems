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