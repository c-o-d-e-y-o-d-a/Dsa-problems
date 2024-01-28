// brute force approach , time complexity - O(n*k)

public class Solution {
	public static int[] maxSlidingWindow(int[] arr, int n, int k) {
        int[] finalAns = new int[n-k+1];
		int k2 = 0;
		for(int i=0;i<n-k+1;i++){
			int largest = Integer.MIN_VALUE;
			for(int j=0;j<k;j++){
				largest = Math.max(largest,arr[i+j]);
			}
			finalAns[k2] = largest;
			k2++;
		}
		return finalAns;
	}
}