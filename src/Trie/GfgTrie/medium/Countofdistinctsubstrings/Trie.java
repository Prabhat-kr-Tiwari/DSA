package Trie.GfgTrie.medium.Countofdistinctsubstrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Trie {

   TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    class TrieNode {


        Map<Character, TrieNode> children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new HashMap<>();
        }
    }
    public  int countDistinctSubstring(String s) {
        // your code here
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            TrieNode currnode =root;
            for (int j = i; j < s.length(); j++) {
                char letter  = s.charAt(j);
                if (!currnode.children.containsKey(letter)){
                    currnode.children.put(letter,new TrieNode());
                    count++;
                }
                currnode = currnode.children.get(letter);
            }

        }
        return count+1;
    }

    static  int countDistinctSubString(String s){
        HashSet<String> stringHashSet = new HashSet<>();
        for (int i = 0; i <s.length(); i++) {
            StringBuilder currstring = new StringBuilder();
            for (int j = i; j <s.length() ; j++) {
                currstring.append(s.charAt(j));
                stringHashSet.add(currstring.toString());
            }
        }
        return stringHashSet.size()+1;

    }
    public static void main(String[] args) {

        //8
        Trie  t =  new Trie();
        System.out.println(t.countDistinctSubstring("ababa"));
        System.out.println(countDistinctSubString("ab"));
        System.out.println();
    }
}
