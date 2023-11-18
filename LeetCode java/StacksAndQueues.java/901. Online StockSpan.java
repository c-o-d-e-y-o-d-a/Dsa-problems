//brute force solution, tc-O(N*N) sc -O(N) where n is length of array
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
   
        ArrayList<Integer> finalAns = new ArrayList<Integer>();
        for(int i=0;i<price.size();i++){
            finalAns.add(0);
        }
        for(int i=1;i<price.size();i++){
            int counter = 0;
            int j = i;
            while(j>=0 && price.get(i)>=price.get(j)){
                counter++;
                j--;

            }
            finalAns.set(i,counter);
        }
        finalAns.set(0,1);
        return finalAns;
    }
}

//optimised approach 
//how it works - find nearest previous greater element and subtract the indices to get the answers.
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Stack;


public class Solution {

    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        ArrayList<Integer> finalAns = new ArrayList<Integer>();
        Stack<Integer> s1 = new Stack<>();
        
        finalAns.add(1);
        s1.push(0);
        for(int i=1;i<price.size();i++){
            while(!s1.isEmpty() && price.get(i)>=price.get(s1.peek())){
                s1.pop();
            }
            if(s1.isEmpty()){
                finalAns.add(i+1);
            }
            else{
                finalAns.add(i-s1.peek());
            }
            s1.push(i);

        }
        return finalAns;







        
        
    }
}