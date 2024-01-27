import java.util.*;
class Node{
    boolean ifEnd;
    Node[] charArr = new Node[26];
    Node(){
        for(int i=0;i<26;i++){
            charArr[i] = null;
        }
        ifEnd= false;
    }
}

public class Trie {


    static Node root;

    Trie() {
        root = new Node();
    }


    //Inserts a word into the trie

    public static void insert(String word) {
        Node cntr = root;
        for(int i=0;i<word.length();i++){
            int ind = word.charAt(i) - 'a';
            if (cntr.charArr[ind] == null){
                Node a = new Node();
                cntr.charArr[ind] = a;
                cntr = a;
            }
            else if(cntr.charArr[ind] != null){
                cntr = cntr.charArr[ind];

            }
        }
        cntr.ifEnd = true;
    }


    //Returns if the word is in the trie

    public static boolean search(String word) {
        Node cntr = root;
        for(int i=0;i<word.length();i++){
            int ind = word.charAt(i) - 'a';
            if(cntr.charArr[ind]==null){
                return false;
            }
            else if(cntr.charArr[ind]!=null){
                cntr = cntr.charArr[ind];
            }
        }
        return cntr.ifEnd;
    }

    
    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String word) {
        Node cntr = root;
        for(int i=0;i<word.length();i++){
            int ind = word.charAt(i) - 'a';
            if(cntr.charArr[ind]==null){
                return false;
            }
            else if(cntr.charArr[ind]!=null){
                cntr = cntr.charArr[ind];
            }
        }
        return true;
    }

    
}

