/* you basically swap the smallest element to the right of each element with that element
time comopl - O(n) ; space compl - O(1)
 */

import java.util.* ;
import java.io.*; 
public class Solution {
	public static void selectionSort(int arr[], int n) {
		for(int i=0;i<n-1;i++){
			int smallElInd = i;
			
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[smallElInd]){
					smallElInd=j;
				}
				

			}
			int temp = arr[i];
			arr[i]=arr[smallElInd];
			arr[smallElInd]=temp;
		}
		
	}
}