package Trie.GfgTrie.hard.ShortestUniqueprefixforeveryword;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    TrieNode root;

    public Trie() {

        root = new TrieNode();
    }

    public class TrieNode {
        Map<Character, TrieNode> children;
        boolean isEndOfWWord;
        int freq;

        public TrieNode() {
            children = new HashMap<>();
            isEndOfWWord = false;
            freq =0;
        }
    }

    void insert(String s) {
        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)) {
                curr.children.putIfAbsent(letter, new TrieNode());
            }
            curr = curr.children.get(letter);
            curr.freq++;
        }
        curr.isEndOfWWord = true;
    }
   /* boolean isPrefix(String s){
        TrieNode curr = root;
        for (int i = 0; i <s.length() ; i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)){
                return false;
            }
            curr = curr.children.get(letter);
        }

        return true;
    }*/
   int  isPrefix(String s){
       TrieNode curr = root;
       for (int i = 0; i <s.length() ; i++) {
           char letter = s.charAt(i);

           curr = curr.children.get(letter);
           if (curr.freq == 1){
               return i;
           }
       }

       return s.length()-1;
   }

    static String[] findPrefixes(String[] arr, int n) {
        Trie t = new Trie();
        for (String string : arr) {
            t.insert(string);
        }
        // code here
        String[] result = new String[n];

        for (int i =0;i< arr.length;i++){
            String word = arr[i];
            int endIndex = t.isPrefix(word);
            result[i] = word.substring(0,endIndex+1);

        }
        return result;

    }

    public static void main(String[] args) {

        String[] arr = {"zebra", "dog", "duck", "dove"};
        String[] ans = findPrefixes(arr, arr.length);
        for (String val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
