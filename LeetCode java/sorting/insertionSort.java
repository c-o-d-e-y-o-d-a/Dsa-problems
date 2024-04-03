import java.util.* ;
import java.io.*; 
tc - O(n*n)  , sc - O(1)
/* how isnertion sort works - you basically divide the array into 2 parts , one sorted and one unsorted
, you assume the 1st element is sorted , then you 

 */

public class Solution {

	public static void insertionSort(int n , int[] arr) {
		for(int i=1;i<arr.length;i++){
			int j = i-1;
			int current = arr[i];
			while(j>=0 && arr[j]>current){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		
		
	}
}
