/* the problem was not super difficult  

spac compl - O(n) and time compl - O(n)
runtime - better than 11% on codin ninjas
memory - better than 95% on codin ninjas


*/

public class Solution {
    public static int makeBeautiful(String str) {
        if(str.length()==1)return 0;
        int finalAns = 0;
        StringBuilder StartsWith0= new StringBuilder();
        StringBuilder StartsWith1 = new StringBuilder();
        int diffWithStart0 =0;
        int diffWithStart1 =0;
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                StartsWith0.append('0');
                StartsWith1.append('1');


            }
            else{
                StartsWith0.append('1');
                StartsWith1.append('0');

            }
            
        }

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=StartsWith0.charAt(i)){
                diffWithStart0+=1;
            }
             if(str.charAt(i)!=StartsWith1.charAt(i)){
                diffWithStart1+=1;
            }
        }
        finalAns=Math.min(diffWithStart0,diffWithStart1);


        return finalAns;
    }
}