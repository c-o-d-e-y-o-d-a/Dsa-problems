 /*
 Problem - find the minimum no of integers that need to be removed to make all the elements in array unique
 i.e. there is only one number of a value present


my approach - 
go through the arraylist and store each element in hashmap its not already ther , if it is there then increment the 
answer value by one

 runtime better than
93.62%

memory better than
99.12%

 
  */

 import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minElementsToRemove(ArrayList<Integer> arr) {
		int finalAns = 0;
		HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.size();i++){
			if(!(map1.containsKey(arr.get(i)))){
				map1.put(arr.get(i),1);
			}
			else{finalAns++;};
		}
		return finalAns;

		}
}

/* second approach - use a set

store all the elements in set and then subtract length of set from length of array 
rumtime   better than
93.62%

memory  better than
99.12%
*/

import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minElementsToRemove(ArrayList<Integer> arr) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int i=0;i<arr.size();i++){
			set1.add(arr.get(i));
		}
		
		return arr.size() - set1.size();

		}
}