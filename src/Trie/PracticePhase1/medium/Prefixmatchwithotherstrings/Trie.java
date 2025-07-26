package Trie.PracticePhase1.medium.Prefixmatchwithotherstrings;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    TrieNode root;

    public Trie(){
        root = new TrieNode();
    }
    public class  TrieNode{

        boolean isEndOfWord;
        Map<Character , TrieNode> children;
        int prefixCount;
        public TrieNode(){
            isEndOfWord = false;
            children = new HashMap<>();
            prefixCount = 0;
        }
    }
    void  insert(String s){

        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter  = s.charAt(i);
            if (!curr.children.containsKey(letter)){
                curr.children.putIfAbsent(letter, new TrieNode());
            }
            curr = curr.children.get(letter);
            curr.prefixCount++;
        }

        curr.isEndOfWord = true;
    }

    public  int prefixCount(String s){
        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)){
                return 0;
            }
            curr =  curr.children.get(letter);
        }
        return curr.prefixCount;
    }
    public static int klengthpref(String[] arr, int n, int k, String str) {
        // code here
        if(str.length()<k) return 0;
        String substr = str.substring(0,k);
        Trie trie = new Trie();
        for(String word:arr){
            if(word.length()>=k){
                trie.insert(word);
            }

        }
        return trie.prefixCount(substr);
    }

    public static void main(String[] args) {
      int   n = 6 ;
        String[] arr = {"abba", "abbb", "abbc", "abbd", "abaa", "abca"};
        String str  ="abbg";
        int k = 3;
        System.out.println(klengthpref(arr,n,k,str));

    }
}
