/*
Coding ninjas problem-- 
check if a matrix is symmetric 
i.e check when a matrix is transposed if it remains the same

logic element at index [i][j] will be equal to element at index [j][i] for a mat to be symm


space compl sol - O(1)
time  compl sol - O(n*n)

beats 23% at runtime and beats 87% at memory
actually figured out the solution pretty quickly without using any hints

 */

import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]!=matrix[j][i]){return false;}
            }
        }
        return true;

        }
}
/* optimised version of code to beat 97% at memory */
public class Solution {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

/* version of code to beat 69% at runtime */
import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        // Write your code here.
        if(matrix.length != matrix[0].length){
            return false;// uses this condition to check if the matrice is square or not
        }
        boolean ans = true;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){//in my code i recalculate the length for each row , here its done once
                if(matrix[i][j] != matrix[j][i]){
                    ans = false;
                    break;
                }
            }
            if(!ans){
                break;
            }
        }
        return ans;
    }
}