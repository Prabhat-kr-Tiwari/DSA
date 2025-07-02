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
    int count(String s){
        TrieNode root  = new TrieNode();
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            TrieNode currnode =root;
            for (int j = i; j >=0 ; j--) {
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

                currstring.append(s.charAt(i));
                stringHashSet.add(String.valueOf(currstring));
            }
        }
        return stringHashSet.size()+1;

    }
    public static void main(String[] args) {

        //8
        System.out.println(countDistinctSubString("abab"));
        System.out.println();
    }
}
