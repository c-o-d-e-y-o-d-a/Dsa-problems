import java.util.*;

public class Solution {
    public static int findCelebrity(int n) {
        //making a stack with all elements
        Stack<Integer> helpStack = new Stack<Integer>();
        for(int i=0;i<n;i++){
            helpStack.push(i);
        }

        while(helpStack.size()>1){

            int a = helpStack.pop();
            int b = helpStack.pop();

            if(Runner.knows(a,b)){
                helpStack.push(b);
            }
            else{
                helpStack.push(a);
            }

        }

        boolean isAns = true;
        int ans = helpStack.pop();
        for(int i=0;i<n;i++){
            if(Runner.knows(ans,i)){
                isAns=false;
            }
        }

        if(isAns)return ans;
        else{return -1;}

        


    }

    
}

//you check two elements at a time if one knows other you then store the other else store the firs tone