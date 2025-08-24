package Trie.PracticePhase1.medium.DeleteWordInTrie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    static class TrieNode {
        boolean isEndOfWord;
        Map<Character, TrieNode> children;

        public TrieNode() {
            isEndOfWord = false;
            children = new HashMap<>();
        }
    }

    boolean delete(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        TrieNode curr = root;
        TrieNode nodeToDelet = null;
        char charToDelete = '\0';

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)) {
                return false;
            }
            if (curr.children.size() > 1 || curr.isEndOfWord) {
                nodeToDelet = curr;
                charToDelete = letter;
            }
            curr = curr.children.get(letter);


        }
        if (!curr.isEndOfWord) return false;
        if (curr.children.isEmpty()) {
            nodeToDelet.children.remove(charToDelete);
        } else {
            curr.isEndOfWord = false;
        }
        return true;


    }
   

}
