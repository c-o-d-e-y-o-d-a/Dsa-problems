import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int key = arr.get(i);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        int j = k - 1;
        while (j < arr.size() - 1) {

            int distinctCount = map.size();
            ans.add(distinctCount);
            if (map.get(arr.get(i)) == 1) {
                map.remove(arr.get(i));
            } else {
                map.put(arr.get(i), map.get(arr.get(i)) - 1);
            }
            i++;
            j++;
            if (map.containsKey(arr.get(j))) {
                map.put(arr.get(j), map.get(arr.get(j)) + 1);
            } else {
                map.put(arr.get(j), 1);
            }

        }//need to run the loop one more time for the last element
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (i = arr.size() - k + 1; i < arr.size(); i++) {
            if (map.containsKey(arr.get(i))) {
                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            } else {
                map.put(arr.get(i), 1);
            }
        }
        ans.add(map.size());
        return ans;
    }
}
