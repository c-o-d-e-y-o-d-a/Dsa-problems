// An array ‘A’ of ‘N’ integers is provided. Return the maximum possible number which can be created by taking bitwise XOR of any 2 integers of the array.
//brute force tc-O(n*n)
public class Solution {
    public static int maximumXor(int []A) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A.length;j++){
                ans = Math.max(ans,(A[i]^ A[j]));

            }
        }
        return ans;
    }
}
