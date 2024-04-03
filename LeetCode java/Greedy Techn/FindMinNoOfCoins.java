import java.util.ArrayList;
import java.util.List;
// tc - o(N) , sc - O(1), the space comp is const bc the size of ans array is no of coins and that is generally much smaller than the input
public class Solution {
    public static List<Integer> MinimumCoins(int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        while (n != 0) {
            if (n >= 1000) {
                ans.add(1000);
                n -= 1000;
            } else if (n >= 500) {
                ans.add(500);c
                n -= 500;
            } else if (n >= 100) {
                ans.add(100);
                n -= 100;
            } else if (n >= 50) {
                ans.add(50);
                n -= 50;
            } else if (n >= 20) {
                ans.add(20);
                n -= 20;
            } else if (n >= 10) {
                ans.add(10);
                n -= 10;
            } else if (n >= 5) {
                ans.add(5);
                n -= 5;
            } else if (n >= 2) {
                ans.add(2);
                n -= 2;
            } else if (n == 1) {
                ans.add(1);
                n = 0;
            }
        }
        return ans;
    }
}

//basically create an array with all coins and then just apply the check conditions to the element, 
//we need to find which element (From right the no is greater than , then subtract that from the no and add in ans)

// another way of writing the same solution - 
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Integer> MinimumCoins(int n) {
        // Array to store denominations.
        int[] denominations = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        List<Integer> ans = new ArrayList<>();
        int m = denominations.length;

        // Pick coins in decreasing order of their values.
        for (int i = m - 1; i >= 0; i--) {
            while (n >= denominations[i]) {
                n = n - denominations[i];
                ans.add(denominations[i]);
            }
        }

        return ans;
    }
}