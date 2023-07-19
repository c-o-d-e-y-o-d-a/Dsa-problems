/* my code that passed 7/8 test cases */
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		if(arr.length>1){
			int largestVal=arr[0] ;
			int secondLargeVal = arr[0];
			for(int i=0;i<arr.length;i++){
				largestVal = Math.max(largestVal,arr[i]);

			}
			for(int i=0;i<arr.length;i++){
				if(arr[i]!=largestVal){
					secondLargeVal = Math.max(secondLargeVal,arr[i]);
				}
			}
			if(largestVal==secondLargeVal){
				return -1;
			}
			else{
				return secondLargeVal;
			}
			

		}
		else{return -1;}
		
	}
}
 /* here is the updated code that works for all test cases */

 import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		if(arr.length>1){
			int largestVal=arr[0] ;
			int secondLargeVal = arr[0];
			for(int i=0;i<arr.length;i++){
				largestVal = Math.max(largestVal,arr[i]);

			}
			for(int i=0;i<arr.length;i++){
				if(arr[i]!=largestVal){
					secondLargeVal = Math.max(secondLargeVal,arr[i]);
				}
			}
			if(largestVal==secondLargeVal){
				return -1;
			}
			else{
				return secondLargeVal;
			}
			

		}
		else{return -1;}
		
	}
}

/* differences between the two codes -- 

I made the following changes to your code to make it work correctly for all test cases:

I changed the initialization of the secondLargeVal variable from arr[0] to Integer.MIN_VALUE. This ensures that the secondLargeVal variable is correctly initialized to the smallest possible value, so that it can be updated correctly in the second loop.

I changed the condition in the second loop from if(arr[i]!=largestVal) to if(arr[i]!=largestVal && arr[i]>secondLargeVal). This ensures that the secondLargeVal variable is only updated if the current element is not equal to the largest value and is greater than the current value of secondLargeVal.

I changed the condition in the final if statement from if(largestVal==secondLargeVal) to if(secondLargeVal==Integer.MIN_VALUE). This ensures that the function returns -1 if all elements in the array are equal, since in this case, the secondLargeVal variable will not be updated and will remain equal to its initial value of Integer.MIN_VALUE.

These changes should make the code work correctly for all test cases, including the one you provided. Let me know if you have any further questions or issues! 😊 */



/* 
the three ways to solve the problem were - 
1- sort the array and return the element at a certain index
2- find the largest and second largest elements (if they exist) using two different loops
3- fidn the largest and second largest elements in a single loop */