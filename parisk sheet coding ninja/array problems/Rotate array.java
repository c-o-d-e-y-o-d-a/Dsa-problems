/*
rotate array by java question my solution

You performed better than
35.85%
Runtime
651 ms




You performed better than
76.1%
Memory
18467 kB


MISTAKES I MADE IN THE CODE
- DIDN'T VISUALISE WHAT I HAD TO DO TO SOLVE THE PROBLEM IN DETAIL AND THAT CAUSED ME TO IMPLEMENT THE LOOPS THE WRONG WAY

- FIRST MAKE A NEW ARRAY WITH THE SAME LENGTH AND PUT THE ELEMENTS IN THE SECOND STARTING FROM THE Kth index
- put the elements before the kth index starting from the length of array - val of k index position
space compl - O(n)
time compl - O(n)
 */
 

import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int lengthOfArr = sc.nextInt();
		int[] arr = new int[lengthOfArr];
		for(int i=0;i<lengthOfArr;i++){
			arr[i]=sc.nextInt();
			
		}
		int valOfK = sc.nextInt();
		int[] resultArray = new int[lengthOfArr];
		for(int i=0;i<(lengthOfArr-valOfK);i++){
			  resultArray[i]=arr[i+valOfK];
		}
		int beginIndex =0;
		for(int i=(lengthOfArr-valOfK);i<lengthOfArr;i++){
			resultArray[i]=arr[beginIndex];
			++beginIndex;

		}
		for(int i=0;i<resultArray.length;i++){
			System.out.print(resultArray[i]+" ");
			
		}


	}
}