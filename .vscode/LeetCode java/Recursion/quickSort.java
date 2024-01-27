// tc - o(n*n)
// avg case is n log n

import java.util.Collections;
import java.util.List;

public class Solution {
    public static void quickSortHelper(List<Integer> arr, int l, int r){
		// Base condiition.
        if(l >= r){
            return;
        }

        int pivot = arr.get(r);

        int i = l, j = l;
		// Splitting the array.
        while(i < r){

            if(arr.get(i) <= pivot)
            {
                Collections.swap(arr, i, j);
                j++;
            }
            i++;
        }

        Collections.swap(arr, r, j);

		// Call quickSortHelper on both halves.
        quickSortHelper(arr, l, j - 1);

        quickSortHelper(arr, j + 1, r);
    }

    public static List<Integer> quickSort(List<Integer> arr) {

        quickSortHelper(arr, 0, arr.size() - 1);

        return arr;    
    }

}


