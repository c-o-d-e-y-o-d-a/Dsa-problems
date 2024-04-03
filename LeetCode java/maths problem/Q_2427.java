/*Given two positive integers a and b, return the number of common factors of a and b.

An integer x is a common factor of a and b if x divides both a and b.

 

Example 1:

Input: a = 12, b = 6
Output: 4
Explanation: The common factors of 12 and 6 are 1, 2, 3, 6. */
class Solution {
    public int commonFactors(int a, int b) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer> ();
        ArrayList<Integer> arr1 = new ArrayList<Integer> ();
        for(int i=1;i<a+1;i++){
            if(a%i==0){
                arr.add(i);
            }
        }
        for(int i=1;i<b+1;i++){
            if(b%i==0){
                arr1.add(i);
            }
        }
        if(arr.size()>=arr1.size()){
            for(int elem : arr1){
                if(arr.contains(elem)){
                    answer=answer+1;
                }

            }
        }
        else if(arr.size()<arr1.size()){
            for(int elem : arr){
                if(arr1.contains(elem)){
                    answer=answer+1;
                }

            }
        }
        return answer;

        
    }
}
//beats 5% in runtime and 90% in memory
//space compl - O(n) time compl - O(n)

//much shorter code than mine

// 0ms runtime , better than 100% , memory better than 62 something though
class Solution {
    public int commonFactors(int a, int b) {
        int count =0;
        int min=Math.min(a,b);
        for(int i =1;i<=min;i++){
             if(a%i==0 && b%i==0) {
             count++;
        
            }
        }
        return count;
    }
}