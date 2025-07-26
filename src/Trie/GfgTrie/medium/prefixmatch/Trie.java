package Trie.GfgTrie.medium.prefixmatch;

//gfg
//Prefix match with other strings

import javax.swing.plaf.PanelUI;
import java.util.HashMap;
import java.util.Map;

public class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    class TrieNode {

        Map<Character, TrieNode> children;
        int prefixCount;

        public TrieNode() {
            children = new HashMap<>();
            prefixCount = 0;
        }
    }

    public void insert(String s) {
        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)) {
                TrieNode newNode = new TrieNode();
                curr.children.put(letter, newNode);

            }
            curr = curr.children.get(letter);
            curr.prefixCount++;
        }

    }

    public int countPrefix(String s) {
        TrieNode curr = root;
        for (char e : s.toCharArray()) {
            if (!curr.children.containsKey(e)) {
                return 0;
            }
            curr = curr.children.get(e);


        }
        return curr.prefixCount;


    }

    public static int klengthpref(String[] arr, int n, int k, String str) {
        if (str.length() < k) return 0;

        String prefix = str.substring(0, k);
        System.out.println(prefix);

        Trie trie = new Trie();
        for (String word : arr) {
            if (word.length() >= k) { // Only insert if the word has at least k characters
                trie.insert(word);
            }
        }

        return trie.countPrefix(prefix);
    }

    public static int prefixCount(String[] words, String pref) {
        Trie trie = new Trie();
        for (String word : words) {
                trie.insert(word);

        }

        return trie.countPrefix(pref);

    }

    public static void main(String[] args) {
        String[] arr = {"abba", "abbb", "abbc", "abbd", "abaa", "abca"};
        String str = "abbg";
        int k = 3;

    /*    String[] arr = {"geeks", "geeksforgeeks", "forgeeks"};

        String str = "ge";
        int k = 5;
*/

       /* String arr[] = {"a", "b", "c", "ab", "bc", "abc"};
        String str = "abc";*/

       String [] words = {"leetcode","win","loops","success"};
        String pref = "code";
        System.out.println(klengthpref(arr, arr.length, 6, str)); // Output: 4
//        System.out.println(prefixCount(arr,str));
    }
}
