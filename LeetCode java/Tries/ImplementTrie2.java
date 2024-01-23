import java.util.*;
import java.io.*;

public class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';
            if (curr.charArr[ind] == null) {
                Node a = new Node();
                curr.charArr[ind] = a;
                curr.childCount++;
            }
            curr = curr.charArr[ind];
        }
        curr.wordCount++;
    }

    public int countWordsEqualTo(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {

            int ind = word.charAt(i) - 'a';

            if (curr.charArr[ind] == null) {
                return 0;
            }

            curr = curr.charArr[ind];
        }
        return curr.wordCount;
    }

    public int countWordsStartingWith(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int ind = word.charAt(i) - 'a';

            if (curr.charArr[ind] == null) {
                return 0;
            }
            
            curr = curr.charArr[ind];
        }
        return curr.childCount;
    }

    public void erase(String word) {
    Node curr = root;
    Node toBeDeleted = null;
    Node parent = null;

    for (int i = 0; i < word.length(); i++) {
        int index = word.charAt(i) - 'a';

        parent = curr;
        curr = curr.charArr[index];
        curr.childCount--;

        if (toBeDeleted != null) {
            toBeDeleted = null;
        }

        if (curr.childCount == 0) {
            if (toBeDeleted == null) {
                parent.charArr[index] = null;
            }
            toBeDeleted = curr;
        }
    }

    // Check if the last character in the word needs to be deleted
    int lastIndex = word.charAt(word.length() - 1) - 'a';
    if (toBeDeleted != null) {
        parent.charArr[lastIndex] = null;
        toBeDeleted = null;
    } else if (parent != null) {
        parent.charArr[lastIndex] = null;
    }

    // Update parent's child count
    if (parent != null) {
        parent.childCount--;
    }

    // Update word count
    curr.wordCount--;
}

}

class Node {
    Node[] charArr;
    int wordCount;
    int childCount;

    Node() {
        charArr = new Node[26];
        wordCount = 0;
        childCount = 0;
    }
}
//my code , failing for a few test cases

/*

	Time complexity: O(N * L) 
        insert - O(N)
        countWordsEqualTo - O(N)
        countWordsStartingWith - O(N)
        erase - O(N)
	Space complexity: O(N * L) 

	Where 'N' and 'L' represents the numbers of words 
	and the longest word in words.

*/
//official solution on coding ninja

class TrieNode{
	public TrieNode childern[];
	public int wordCount;
	public int prefixCount;
	
	TrieNode(){
		childern = new TrieNode[26];
		wordCount = 0;
		prefixCount = 0;
	}
};


public class Trie {

    // Declare a variable root that denotes the root of the Trie.
    public TrieNode root;
    
    // Initialize the Trie.
    public Trie() {
        root = new TrieNode();
    }
    
    
    // In this function we are inserting the word into our Trie.
    public void insert(String word){
    	 TrieNode curr = root;
    	 
    	 // Iterating through the string word.
    	 for(int i=0;i<word.length();i++){
    	 	int index = word.charAt(i) - 'a';
    	 	
    	 	if(curr.childern[index] == null){
    	 		curr.childern[index] = new TrieNode();
    	 	}
    	 	curr = curr.childern[index];
    	 	curr.prefixCount++;
    	 }
    	 curr.wordCount++;
    }
      
     public int countWordsEqualTo(String word){
    	 TrieNode curr = root;
    	 
    	 // Iterating through the string word.
    	 for(int i=0;i<word.length();i++){
    	 	int index = word.charAt(i) - 'a';
    	 	
    	 	if(curr.childern[index] == null){
    	 		return 0;
    	 	}
    	 	curr = curr.childern[index];
    	 }
    	 return curr.wordCount;
    }
    
    public int countWordsStartingWith(String word){
    	  TrieNode curr = root;
    	  
    	 // Iterating through the string word.  
    	 for(int i=0;i<word.length();i++){
    	 	int index = word.charAt(i) - 'a';
    	 	
    	 	if(curr.childern[index] == null){
    	 		return 0;
    	 	}
    	 	curr = curr.childern[index];
    	 }
    	 return curr.prefixCount;
    }
    
    // In this function we are removing the word from "TRIE".
    public void erase(String word){
    	 TrieNode curr = root;
    	 TrieNode toBeDeleted = null;
    	 
    	  // Iterating through the string word.   
    	  for(int i=0;i<word.length();i++){
    	 	int index = word.charAt(i) - 'a';
    	 	
    	 	// Store the parent of current character.
    	 	TrieNode parent = curr;
    	 	curr = curr.childern[index];
    	 	curr.prefixCount--;
    	 	
    	 	
    	 	if(toBeDeleted != null){
    	 		toBeDeleted = null;
    	 	}
    	 	
    	 	
			// If the prefixCount of current node is 0 that means we have reached at the end of the word that has to be deleted.
    	 	if(curr.prefixCount == 0){
    	 		if(toBeDeleted == null){
    	 			parent.childern[index] = null;
    	 		}
    	 		toBeDeleted = curr;
    	 	}
    	 }
    	 
    	 curr.wordCount--;
    	 if(toBeDeleted != null){
    	 	toBeDeleted = null;
    	 }
    }
    
}
