import java.util.*;

public class Solution {
    public static int[] mergesort(int[] arr) {
        if (arr.length <= 1) return arr;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        left = mergesort(left);
        right = mergesort(right);

        return merge(left, right);
    }

    public static void mergeSort(int[] arr,int n) {
        int[] sortedArray = mergesort(arr);
        System.arraycopy(sortedArray, 0, arr, 0, sortedArray.length);//this code doesn't sort the array in place by default,that is why we need this line
    }


//easy part below
    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int aInd = 0;
        int bInd = 0;
        int cInd = 0;

        while (aInd < a.length && bInd < b.length) {
            if (a[aInd] < b[bInd]) {
                c[cInd] = a[aInd];
                aInd++;
            } else {
                c[cInd] = b[bInd];
                bInd++;
            }
            cInd++;
        }
//adding the extra elements 
        while (aInd < a.length) {
            c[cInd] = a[aInd];
            cInd++;
            aInd++;
        }

        while (bInd < b.length) { 
            c[cInd] = b[bInd];
            cInd++;
            bInd++;
        }

        return c;
    }
}
