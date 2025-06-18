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
            if (!curr.children.containsKey(letter)) {
                return false;
            }
            curr = curr.children.get(letter);

        }
        return true;

    }


    public boolean delete(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        TrieNode curr = root;
        TrieNode nodeToDelete = null;
        char charToDelete = '\0';
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            //if that start letter is not present return false
            if (!curr.children.containsKey(letter)) {
                return false;
            }
            //
            if (curr.children.size() > 1 || curr.isEndOfWord) {
                nodeToDelete = curr;
                charToDelete = letter;
            }
            //move to next
            curr = curr.children.get(letter);

        }
        //remove node
        if (curr.children.isEmpty()) {
            nodeToDelete.children.remove(charToDelete);

        } else {
            curr.isEndOfWord = false;

        }
        return true;


    }
    public boolean delete(char[] key) {
        if (key == null || key.length == 0) {
            return false;
        }
        TrieNode curr = root;
        TrieNode nodeToDelete = null;
        char charToDelete = '\0';
        for (int i = 0; i < key.length; i++) {
            char letter = key[i];
            if (!curr.children.containsKey(letter)) {
                return false;
            }
            if (curr.children.size() > 1 || curr.isEndOfWord) {
                nodeToDelete = curr;
                charToDelete = letter;
            }
            curr = curr.children.get(letter);
        }
        if (curr.children.isEmpty()) {
            nodeToDelete.children.remove(charToDelete);
        } else {
            curr.isEndOfWord = false;
        }
        return true;
    }





    public static void main(String[] args) {
        Trie trie = new Trie();
        String[] dict = {"apple", "car", "abc","abcd", "app"};
        for (String s : dict) {
            trie.insert(s);
        }
        System.out.println(trie.search("abc"));
        trie.delete("abc");
        System.out.println(trie.search("abc"));
        int count=0;
        for (String word : dict) {
            if (trie.isPrefix("ab") && word.startsWith("ab")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
