// You have been given a matrix of ‘N’ rows and ‘M’ columns filled up with integers where every row is sorted in non-decreasing order. Your task is to find the overall median of the matrix i.e if all elements of the matrix are written in a single line, then you need to return the median of that linear array.

// The median of a finite list of numbers is the "middle" number when those numbers are listed in order from smallest to greatest. If there is an odd number of observations, the middle one is picked. For example, consider the list of numbers [1, 3, 3, 6, 7, 8, 9]. This list contains seven numbers. The median is the fourth of them, which is 6.
import java.util.ArrayList;

public class Solution {

    static int getFloor(ArrayList<Integer> arr, long num) {
        int start = 0;
        int end = arr.size() ;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) > num) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int getMedian(ArrayList<ArrayList<Integer>> matrix) {
        long low = 1;
        long high = 100000;
        long count = 0;
        long mid = 0;
        while (high > low) {
            mid =(low+high)/2;
            count = 0;
            for (int i = 0; i < matrix.size(); i++) {
                count += getFloor(matrix.get(i), mid);
            }
            if (count >= (matrix.size() * matrix.get(0).size() + 1)/2) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return (int) low;
    }
}
