public static String getSiblingGender(String a, int gen) {
    if(gen <= 0) return a;
    StringBuilder ans = new StringBuilder();
    for(int i = 0; i < a.length(); i++){
        ans.append(a.charAt(i));
    }
    for(int i = 0; i < a.length(); i++){
        if(a.charAt(i) == '0'){
            ans.append('1');
        }
        else{
            ans.append('0');
        }
    }
    gen--;
    return getSiblingGender(ans.toString(), gen);
}

public static char kthChildNthGeneration(int n, long k) {
    String a = getSiblingGender("0", n);
    if(k < a.length()){
        return a.charAt((int)k);
    }
    // Add error handling for when k is out of bounds.
}
//my solution incomplete and weird approach
//code written by me after seeing the solution, passes 9 / 11 test cases lol

public class Solution {
    public static String helper(int n , long k){
        if(n == 1 || k == 1) return "Male";
        int parGen = n - 1;
        int parchild = (int)(k+1)/2;
        String parentGender = helper(parGen,parchild);
        if(parentGender.equals("Male") && (int)k%2 == 0){
            return "Female";
        }
        if(parentGender.equals("Male") && (int)k%2 == 1){
            return "Male";
        }
        if(parentGender.equals("Female") && (int)k%2 == 1){
            return "Female";
        }
        else{
            return "Male";
        }
        
    }
    
	public static String kthChildNthGeneration(int n, long k) {
        return helper(n,k);
        
        
		  
	}

}

// passes all test cases , there was a problem with data types here

public class Solution {
    public static String helper(int n , long k){
        if(n == 1 || k == 1) return "Male";
        int parGen = n - 1;
        long parchild = (k+1)/2;
        String parentGender = helper(parGen,parchild);
        if(parentGender.equals("Male") && k%2 == 0){
            return "Female";
        }
        if(parentGender.equals("Male") && k%2 == 1){
            return "Male";
        }
        if(parentGender.equals("Female") && k%2 == 1){
            return "Female";
        }
        else{
            return "Male";
        }
        
    }
    
	public static String kthChildNthGeneration(int n, long k) {
        return helper(n,k);
        
        
		  
	}

}

// official solution 
 /*
    Time Complexity: O(min(N, log(K)))
    Space Complexity: O(N)

    Where N is the generation number and K is the position of the child in the Nth generation. 
*/

public class Solution {

	public static String kthChildNthGeneration(int n, long k) {
		
		// Base Condition
		if (n == 1 || k == 1) {
			return "Male";
		}
		
		// Parent of the Kth child of Nth generation
		long par = (k + 1) / 2;

		// Recursively find the gender of the parent
		String parGender = kthChildNthGeneration(n - 1, par);

		// If Kth child of Nth generation is the first child of its parent
		if (k == 2 * par - 1) {
			return parGender;
		}
		
		// If Kth child of Nth generation is the second child of its parent
		else {
			if (parGender == "Male") {
				return "Female";
			}
			else {
				return "Male";
			}
		}
	}
} 