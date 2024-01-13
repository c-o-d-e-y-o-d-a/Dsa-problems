/*You have a car with a gas tank of infinite capacity. There are ‘N’ gas stations along a circular route. Gas stations are numbered from 0 to N - 1. You begin the journey with an empty tank at one of the gas stations. You want to travel around the circular route once in the clockwise direction. I.e if you start to travel from station ‘i’, then you will go to i + 1, i + 2, …, n - 1, 0, 1, 2, i - 1 and then return back to ‘i’.

You are given two integer arrays ‘gas’ and ‘cost’. ‘gas[i]’ gives the amount of gas available at station ‘i’ and cost[i] gives the amount of gas required to travel from station ‘i’ to next station i.e station ‘i’+1 (or 0 if the station is N - 1).

Return the starting gas station's index if it is possible to complete cycle of given circular route once in the clockwise direction. If there are multiple possible starting gas station’s indexes, then return the minimum of those gas station indexes. If there is no such gas station then return -1.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
1
2
1 2
2 1
Sample Output 1:
1
Explanation of Sample Input 1 :
Test Case 1:
If you start from index 0, you can fill in 1 unit of gas. Now your tank has 1 unit of gas. But you need 2 units of gas to travel to station 1. Thus you can not start at station 0.
If you start from index 1, you can fill in 2 units of gas. Now your tank has 2 units of gas. You need 1 unit of gas to get to station 0. So, you travel to station 0 and still have 1 unit of gas left. You fill in 1 unit of additional gas, making your current gas = 2 unit. It costs you 2 amounts of gas to get to station 1, which you do and complete the cycle. Thus you can start at index 1.
Sample Input 2 :
1
5
1 2 3 4 5
3 4 5 1 2
Sample Output 2:
3
Explanation of Sample Input 2 :
Test Case 1:
If you start from index 3 and fill all available gas at each station, then you can reach station 4 with 3 units of gas, station 0 with 6 units of gas, station 1 with 4 units of gas, station 2 with 2 units of gas, and back to station 3 after consuming all the gas. 
We can show that index 3 is the minimum index of the gas station from where the complete circular trip is possible 
 */
// my sol - onlypassed 3/12 test cases:
import java.util.*;
public class Solution {
	public static int startingPoint(int[] gas, int[] cost, int n) {
		int i = 0;
		int ansInd = -1;
		int carry = 0;
		int step = 0;
		while(step<(2*n)){
			if(((gas[i]+carry)-cost[i])<0){
				ansInd=-1;
				carry=0;
				
				

			}
			
			else if(((gas[i]+carry) - cost[i])>0){
				if(ansInd==-1){
					ansInd = i;
				}
				
				carry= (gas[i]+carry) - cost[i];
				

			}
			i++;
			if(i==ansInd)break;
			
			i=i%n;
			step++;





		}
		return ansInd;
	}
} 

//brute force ( too simple so didn't write , official nc solution)