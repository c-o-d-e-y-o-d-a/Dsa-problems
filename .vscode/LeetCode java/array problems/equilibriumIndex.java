/* time complexity - O(n*n), takes too long , so gives runtime error */

import java.util.* ;
import java.io.*; 
public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		int currIndex = 1;
		int answer = -1;
	
		while(currIndex!=arr.length-1){
			int sum1 = 0;
			int sum2 = 0;
			for(int i=0;i<currIndex;i++){
				sum1+=arr[i];
			}
			for(int i=currIndex+1;i<arr.length;i++){
				sum2+=arr[i];
			}
			if(sum1==sum2){
				answer=currIndex;
			}
			else{
				currIndex++;
			}

		}
		return answer;	
	}
	
}


/* better approach time complexity - O(n)
you take the totalSum of the array and use 

my approach - 
find the sum of all elements in the array
transverse through the array and subtract the element at current index from the sum and store it in a new variable
keep adding all the elements to the right of the index and see if half of the value after subtracting the current element is equal to the
sum of elements to the right ,
- the element at equillibrium index is not counted in sum
- 


this approach didn't work , i don't know why




approach from the official solutions - 

keep most things the same and subtract the sum of values to the left and current element from total sum if the answer is 
equal to the sum of values to the left then return the index












*/


import java.util.* ;
import java.io.*; 
public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){
		int n = arr.length;
		int arraySum =0,leftSum = 0;

		for(int i=0;i<n;i++){
			arraySum+=arr[i];
		}
		for(int i=0;i<n;i++){
			
			if(leftSum == arraySum - leftSum -arr[i] ){
				return i;
			}
			leftSum+=arr[i];
		}
		return -1;
	}

	
}