// find square root of n;


// given solution passes 29/30 of the test cases



import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		int low = 1;
		int high =(int)N;
		
		while(low<=high){
			int mid = ((high-low)/2) + low;
			if(Math.pow(mid,2)<=N && Math.pow(mid+1,2)>N){
				return mid;
			}
			else if(Math.pow(mid,2)>N ){
				high = mid-1;

			}
			else{
				low = mid+1;
			}


		}
		return -1;
	}
}


//most eff way to solve the problem 

public class Solution {

	// Function to find the square root of 'N'
	public static int sqrtN(long N) {
		
		// Corner case
	    if(N == 0)
	    {
	        return 0;
	    }
	    
	    // Take 'ans' variable to store the square root of given number 'N'
	    int ans = 1;

	    // Run loop while square of 'ans' is less than equal to 'N'
	    while(ans <= (N / ans))
	    {
	        // Increament 'ans' by 1
	        ans++;
	    }

	    // Return 'ans'-1
	    return (int)(ans - 1);

	}

}