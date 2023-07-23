/* easy first question on strings 
Runtime
Details
1ms
Beats 73.42%of users with Java
Memory
Details
41.59mb
Beats 71.97%of users with Java

 */

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int finalAns = 0;
        for(int i=0;i<operations.length;i++){
            
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                finalAns++;
            }
            else{
                finalAns--;
            }
        }
        return finalAns;
        
    }
}
/* small change in code to beat 100% in rum time , but you will sacrifice space

Runtime
Details
-ms
Beats 100.00%of users with Java
Memory
Details
41.70mb
Beats 48.12%of users with Java */

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int finalAns = 0;
        for(int i=0;i<operations.length;i++){
            
            if(operations[i].charAt(1)=='+'){
                finalAns++;
            }
            else{
                finalAns--;
            }
        }
        return finalAns;
        
    }
}