//first approach - find peak element and apply binary search on both sides if they exist

// in a single binary search 
public class Solution {
    public static int search(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
           int mid = (end-start)/2 +start;
           if(arr[mid] == key) return mid;

           
           else if(arr[start] >= arr[mid]){
            if(key>=arr[mid] && key<=arr[end]){
                start = mid + 1;


            }
            else{
                end = mid - 1;
            }
           }
           else{
               if(key>=arr[start] && key<=arr[mid]){
                   end = mid - 1;
               }
               else{
                   start = mid + 1;
               }

           }



           
        }
        return -1;
    }
}

