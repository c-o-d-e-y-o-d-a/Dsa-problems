/* question - you need to check wether two strings are annagrams or not (same characters) 

approaches i thought of - 
1- use two hashmaps to store each character and the no of times each character exists in both array 
2- turn both strings in arrays and sort them and then compare
3- 

*/

//first approach - tc- 3% sc - 97% ,
import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean areAnagram(String str1, String str2){
        if(str1.length() != str2.length())return false;
        HashMap<Character,Integer>  map1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer>  map2 = new HashMap<Character,Integer>();
        for(int i=0;i<str1.length();i++){
            if(!map1.containsKey(str1.charAt(i))){
                map1.put(str1.charAt(i),1);
            }
            else{
                map1.put(str1.charAt(i),map1.get(str1.charAt(i))+1);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(!map2.containsKey(str2.charAt(i))){
                map2.put(str2.charAt(i),1);
            }
            else{
                map2.put(str2.charAt(i),map2.get(str2.charAt(i))+1);
            }
        }
        if(map1.equals(map2))return true;
        else{return false;}


    }
}