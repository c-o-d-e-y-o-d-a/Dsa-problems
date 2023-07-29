/*  coding ninja question

problem - 
you are given a 2d array with only 0s and 1s
you need to find the coverage of all zeroes combines
the coverage for a 0 is said to be increase by 1 if there is 
a 1 right next to it on right or left 
or there's a 1 right on top of it or ritht below it

ex- 
0 1 0
1 1 1
0 0 0
the first 0 has coverage of 2 because there's a 1 right and below it
and the 3rd 0 in 1st array has coverage of 1 too



approach - 
you iterate over the 2 arrays using double for loops 
for each element you check if it is 0
if it is then you check if the elements right next to it in any of the 4 directions exist
and if they do then are they equal to 1 , if they are you count it using a variable 



time compl - O(m*n)
space compl - O(1)
runtime beats 39% and memory beats 85%

 */

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
		int finalAns = 0;
		for(int i=0;i<mat.size();i++){
			for(int j=0;j<mat.get(i).size();j++){
				if(mat.get(i).get(j)==0){
					if(i-1>-1 && mat.get(i-1).get(j)==1){finalAns++;}
					if(i+1<mat.size() && mat.get(i+1).get(j)==1){finalAns++;}
					if(j-1>-1 && mat.get(i).get(j-1)==1){finalAns++;}
					if(j+1<mat.get(i).size() && mat.get(i).get(j+1)==1){finalAns++;}
					

				}
			}
		}


		
		return finalAns;
	}
}
