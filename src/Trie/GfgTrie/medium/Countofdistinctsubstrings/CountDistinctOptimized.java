package Trie.GfgTrie.medium.Countofdistinctsubstrings;

import java.util.Map;

public class CountDistinctOptimized {

    TrieNode root;
   public CountDistinctOptimized(){
        root = new TrieNode();
    }
    public class TrieNode{


       TrieNode [] children = new TrieNode[26];
    }

    public int countDistinctSubstring(String s) {
       int count =0;
        for (int i = 0; i <s.length() ; i++) {
            TrieNode curr = root;
            for (int j = i; j < s.length(); j++) {
                int index = s.charAt(j) - 'a';
                if (curr.children[index]==null){
                    curr.children[index] = new TrieNode();
                    count++;
                }
                curr = curr.children[index];
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        CountDistinctOptimized d = new CountDistinctOptimized();
        System.out.println(d.countDistinctSubstring("ababa"));
    }

}
