import java.util.*;

public class Solution {

    public static int findKthElement(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = cols - 1;
        int top = 0;
        int bottom = rows - 1;

        int counter = 0;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                counter++;
                if (counter == k) {
                    return matrix[top][i];
                }
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                counter++;
                if (counter == k) {
                    return matrix[i][right];
                }
            }
            right--;

            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    counter++;
                    if (counter == k) {
                        return matrix[bottom][i];
                    }
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    counter++;
                    if (counter == k) {
                        return matrix[i][left];
                    }
                }
                left++;
            }
        }

        return -1;
    }
}
