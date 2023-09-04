/*
you basically need to find if sum of any two numbers in array equals third
 */
//tc - O(n log(n)) and sc - O(1)
import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static  ArrayList<Integer> findTriplets(int[] arr, int n) 
    {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Arrays.sort(arr);
		for(int i= n-1;i>=0;i--){
			int start = 0;
			int end = i-1;
			while(end>start){
				if(arr[start]+arr[end]==arr[i] ){
					ans.add(arr[i]);
					ans.add(arr[start]);
					ans.add(arr[end]);
					return ans;
				}
				else if(arr[start]+arr[end]<arr[i]){
					start++;

				}
				else{
					end--;
				}
			}
			
		}
		return ans;

		
	     
		
	}
}