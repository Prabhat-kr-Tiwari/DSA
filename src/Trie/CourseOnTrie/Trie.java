package Trie.CourseOnTrie;

import java.util.HashMap;
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

    void insert(String s) {
        if (s == null || s.isEmpty()) {
            return;
        }
        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)) {
                TrieNode newNode = new TrieNode();
                curr.children.put(letter, newNode);
            }
            curr = curr.children.get(letter);
        }
        curr.isEndOfWord = true;

    }

    boolean search(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)) {
                return false;
            }
            curr = curr.children.get(letter);

        }
        return curr.isEndOfWord;

    }

    public boolean isPrefix(String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (!curr.children.containsKey(letter)){
                return false;
            }
            curr = curr.children.get(letter);

        }
        return true;

    }


    public static void main(String[] args) {
        Trie trie = new Trie();
        String[] dict = {"Apple", "Career", "App", "Apply"};
        for (String s : dict) {
            trie.insert(s);
        }
        System.out.println(trie.search("App"));
        System.out.println(trie.search("Car"));
    }
}
