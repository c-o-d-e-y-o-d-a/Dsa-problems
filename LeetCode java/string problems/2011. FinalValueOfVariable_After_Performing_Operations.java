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