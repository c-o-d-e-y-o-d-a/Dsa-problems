import java.util.* ;
import java.io.*; 
class TrieNode {
    public TrieNode children[];
    public int wordCount;
    public int prefixCount;

    TrieNode() {
        children = new TrieNode[26];
        wordCount = 0;
        prefixCount = 0;
    }
}

class Trie {

    public TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }
            curr = curr.children[index];
            curr.prefixCount++;
        }
        curr.wordCount++;
    }

    public int countWordsEqualTo(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return 0;
            }
            curr = curr.children[index];
        }
        return curr.wordCount;
    }

    public int countWordsStartingWith(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return 0;
            }
            curr = curr.children[index];
        }
        return curr.prefixCount;
    }

    public int countUniqueWords(TrieNode node) {
        if (node == null) return 0;
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                count += countUniqueWords(node.children[i]);
            }
        }
        return count + 1;
    }

    public void erase(String word) {
        TrieNode curr = root;
        TrieNode toBeDeleted = null;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            TrieNode parent = curr;
            curr = curr.children[index];
            curr.prefixCount--;

            if (toBeDeleted != null) {
                toBeDeleted = null;
            }

            if (curr.prefixCount == 0) {
                if (toBeDeleted == null) {
                    parent.children[index] = null;
                }
                toBeDeleted = curr;
            }
        }

        curr.wordCount--;

        if (toBeDeleted != null) {
            toBeDeleted = null;
        }
    }
}
public class Solution {
    public static int distinctSubstring(String word) {
        Trie trie = new Trie();

        
        for (int i = 0; i < word.length(); i++) {
            String temp = word.substring(i);
            trie.insert(temp);
        }

        int ans = trie.countUniqueWords(trie.root);
        return (ans-1);
        
    }
}
