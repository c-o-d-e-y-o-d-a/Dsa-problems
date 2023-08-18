/*

we keep on goind through the array and swapping a number with the no right next to it if the 
number right next to it is greater than the no 

time com - O(n*n)  ,space - O(1)

 */











import java.util.* ;
import java.io.*; 

public class Solution {
    
    public static void bubbleSort(int[] arr, int n) {   
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

    }

}