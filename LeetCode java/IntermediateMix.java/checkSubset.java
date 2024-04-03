//using hashmaps , using recursion, 2 ways to solve , here's the hashmap method

import java.util.*;

public class Solution {
    public static boolean checkSubset(int[] arr1, int[] arr2, int n, int m) {
        if (m > n) {
            return false;
        }

        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (!map1.containsKey(arr1[i])) {
                map1.put(arr1[i], 1);
            } else {
                map1.put(arr1[i], map1.get(arr1[i]) + 1);
            }
        }

        for (int j = 0; j < m; j++) {
            if (map1.containsKey(arr2[j])) {
                map1.put(arr2[j], map1.get(arr2[j]) - 1);
                if (map1.get(arr2[j]) < 0) {
                    return false; // More occurrences of arr2[j] found in arr2 than in arr1
                }
            } else {
                return false; // Element in arr2 not present in arr1
            }
        }

        return true;
    }
}
