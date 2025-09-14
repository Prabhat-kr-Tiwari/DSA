package Trie.PracticePhase1.hard.ShortestUniqueprefixforeveryword;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    public  class TrieNode{
        int freq;
        boolean isEndOfWord;
        Map<Character,TrieNode> children;
        public TrieNode(){
            freq = 0;
            isEndOfWord = false;
            children = new HashMap<>();
        }

    }

    void insert(String s){

        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)){
                curr.children.putIfAbsent(letter , new TrieNode());

            }
            curr=curr.children.get(letter);
            curr.freq++;
        }
        curr.isEndOfWord= true;

    }
    int isPrefix(String s){
        TrieNode curr =root;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            curr = curr.children.get(letter);
            if (curr.freq==1){
                return i;
            }
        }
        return s.length()-1;
    }
    static String[] findPrefixes(String[] arr, int N) {
        // code here
        Trie t = new Trie();
        String []result =  new String[N];
        for(String s:arr){
            t.insert(s);
        }
        for (int i = 0;i<N;i++){
            int endIndex =  t.isPrefix(arr[i]);
            result[i] = arr[i].substring(0,endIndex+1);
        }
        return result;

    }


    public static void main(String[] args) {
        String[] arr = {"zebra", "dog", "duck", "dove"};
        String[] ans = findPrefixes(arr, arr.length);
        for (String val : ans) {
            System.out.print(val + " ");
        }
    }
}
