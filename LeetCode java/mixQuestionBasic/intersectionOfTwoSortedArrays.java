/* find the intersection of two sorted arrays and return the elements present in both in the same order they appear (return an arraylist) */
import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m){
		ArrayList<Integer> AnswerArray = new ArrayList<Integer>();
		int smallArr = 0;
		int bigerArr = 0;
		while(smallArr<n && bigerArr<m){
			if(arr1.get(smallArr).equals(arr2.get(bigerArr))){//don't use == way of comparing with objects, use proper methods  , when i was using == it was taking toomuch time to execute andi was failing bigger test cases
				AnswerArray.add(arr1.get(smallArr));
				smallArr++;
				bigerArr++;
			}
			else if(arr1.get(smallArr)>arr2.get(bigerArr)){
				bigerArr++;
			}
			else{
				smallArr++;
			}

			
		}
		return AnswerArray;
		

		
	}
}

//another approach will be to jusg store elements in an hashmap and then compare
