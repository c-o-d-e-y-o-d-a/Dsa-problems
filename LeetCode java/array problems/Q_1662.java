//mysolution with tc - O(n) sc - O(1)
//problem i faced in this sol - was not using the java methods like. concat and .equals
//wasinstead doing += and ==

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String a1 = "";
        String a2 = "";
        for(int i =0;i<word1.length;i++){
            a1=a1.concat(word1[i]);
        }
        for(int i =0;i<word2.length;i++){
            a2=a2.concat(word2[i]);
        }
        
        if(a1.equals(a2)){
            return true;
        }
        else{return false;}
    }
}