/*

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2

space compl - O(n)
time compl - O(n*n) this is becuase of the linkedhashMap , to find an element in the linked hashmap through its index 
you need to go over each element like you do in an array , hence the space complexity of searching in an linkedhashMap using a index is O(n)

 */

HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
for(int i=0;i<s.length();i++){
    char car = s.charAt(i);
    if(map1.containsKey(car)){
        map1.put(car,map1.get(car)+1);
    }
    else{
        map1.put(car,1);
        set1.add(car); // add the key to the set
    }
}

for(Character key:set1){ // loop through the set
    if(map1.get(key)==1){
        return s.indexOf(key); // return the index of the first unique character
    }
}


/*
Solution without using a linkedhashmap-
space compl - O(n)
time compl - O(n)
 */

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char car = s.charAt(i);
            if(!(map1.containsKey(car))){
                map1.put(car,1);

            }
            else{
                map1.put(car,map1.get(car)+1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map1.get(s.charAt(i))==1){
                return i;
            }
        }

return -1;
        
    }
}