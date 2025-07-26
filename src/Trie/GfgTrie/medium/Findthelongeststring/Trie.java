package Trie.GfgTrie.medium.Findthelongeststring;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();

    }

    public class TrieNode {
        Map<Character, TrieNode> children;
        boolean isEndOfWord;

        public TrieNode() {
            isEndOfWord = false;
            children = new HashMap<>();
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
        }
        curr.isEndOfWord = true;
    }

    boolean allPrefixesPresent(String s) {
        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)) {
                return false;
            }
            curr = curr.children.get(letter);
            if (!curr.isEndOfWord) {
                return false;
            }
        }
        return true;
    }


    public static String longestString(String[] words) {
        Trie t = new Trie();
        for (String word : words) {
            t.insert(word);
        }

        String ans = "";
        for (String s : words) {
            if (t.allPrefixesPresent(s)) {
                if (s.length() > ans.length() || (s.length() == ans.length() && s.compareTo(ans) < 0)) {
                    ans = s;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String[] words = {"p", "pr", "pro", "probl", "problem", "pros", "process", "processor"};
        System.out.println(longestString(words));
    }
}
