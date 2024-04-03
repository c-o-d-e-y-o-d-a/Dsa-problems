// make a function to check wether an array can be made non decreasing just by changing 1 element at max 
import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean isPossible(int[] arr, int n) {
		int notInOrderIndex = -1;
		for(int i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				if(notInOrderIndex!=-1){return false;}
			
			notInOrderIndex = i;
			}
		}
		if(notInOrderIndex == -1 || notInOrderIndex == 0 || notInOrderIndex == n-2){
			return true;
		}
		if(arr[notInOrderIndex-1]<=arr[notInOrderIndex+1]){return true;}
		if(arr[notInOrderIndex] <= arr[notInOrderIndex+2]){return true;}
		return false;
		
	}
}

// tc - O(log(n)0)
//how code works

// we divide the problem into 3 possible conditions 
// 1- when the array is sorted ( we can return true here directly)
// 2- when there's only one problem index in the array 
// here there are 2 possible scenarios , the element is the starting or ending one, the problem index is in between
// 3- there's more than one problem index in the array (here we cannot do anything)