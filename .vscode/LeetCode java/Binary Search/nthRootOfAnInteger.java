//first approach

public class Solution {

    static int getRoot(int num) {
        int mid = 0;
        int low = 0;
        int high = num;
        while (low <= high) {
            mid = low + (high - low) / 2;
            long sqr = (long)mid * mid; // Handle cases where sqr might overflow int range
            if (sqr == num) {
                return mid;
            } else if (sqr > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int NthRoot(int n, int m) {
        if (n <= 0 || m < 0) // Edge case: If n is non-positive or m is negative, return -1
            return -1;
        
        int temp = m;
        for (int i = 0; i < n; i++) {
            temp = getRoot(temp);
            if (temp == -1)
                return -1; // If no root is found, return -1 immediately
        }
        return temp;
    }
}
