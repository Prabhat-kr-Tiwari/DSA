package Trie.GfgTrie.medium.CountwordsinaTrie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    TrieNode root;
    public Trie(){
        root = new TrieNode();

    }
    public  class  TrieNode{
        Map<Character,TrieNode> children;
        boolean isEndOfWord;
        int freq;
        public TrieNode(){
            children = new HashMap<>();
            isEndOfWord = false;
            freq =0;

        }
    }
    void insert(String s){
        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter  = s.charAt(i);
            if (!curr.children.containsKey(letter)){
                curr.children.putIfAbsent(letter, new TrieNode());
            }
            curr = curr.children.get(letter);
        }
        curr.isEndOfWord = true;
        curr.freq++;


    }


    public static int wordCount(TrieNode root) {
        int count = 0;

        if (root.isEndOfWord) {
            count += root.freq;
            System.out.println("isend of word  count="+count);
        }
        for (TrieNode child : root.children.values()) {
            count += wordCount(child);
            System.out.println("for loop count ="+count);
        }
        return count;


    }

    public static void main(String[] args) {
       String[] s = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
       Trie t = new Trie();

        for (String word:s){
            t.insert(word);
        }
        System.out.println(wordCount(t.root));

    }
}
