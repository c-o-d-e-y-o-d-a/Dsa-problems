import java.util.*;
/**************************************
    
    Following is the point class
    
    class point {
		int x;
		int y;
	
		point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	 }
  
 **************************************/
//brute force approach
public class Solution {
	static long distance(point a, point b){
		int x1 = a.x;
		int y1 = a.y;
		int x2 = b.x;
		int y2 = b.y;
		long dist = (long) (Math.pow((x1-x2),2) +  Math.pow((y1-y2),2));

		return dist;

	}
	
	public static long closestPair(point coordinates[], int n) {
		long ans = Long.MAX_VALUE;
		long temp = 0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				temp = distance(coordinates[i],coordinates[j]);
				ans = Math.min(temp,ans);


			}
		}
		return ans;

		
		
		
	}
	
}
