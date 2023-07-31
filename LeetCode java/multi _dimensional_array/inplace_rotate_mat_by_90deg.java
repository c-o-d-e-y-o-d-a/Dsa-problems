/* you need to rotate an array by 90 degrees , you need to modify the given array and not use any extra space */


//Here's the brute approach solution with time compl = O(n*n) = space compl

import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static void inplaceRotate(int[][] arr, int n) {
		int [][] answerArr =new int[n][n];
		int j2 = n;

		for(int i=0;i<n;i++){
			j2--;
			int i2=0;
			for(int j=0;j<n;j++){
				answerArr[i][j]=arr[i2][j2];
				i2++;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=answerArr[i][j];
			}
		}
		
		}

}

/* Better approach - (works in O(1) time)

to rotate a matrix by 90 degrees in anti clockwise direction - 
we find that we can achieve the same end result by first transposing the matrix and then reversing each column
 */