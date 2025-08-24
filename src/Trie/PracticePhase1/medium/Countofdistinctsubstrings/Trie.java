package Trie.PracticePhase1.medium.Countofdistinctsubstrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public class TrieNode {
        Map<Character, TrieNode> children;

        public TrieNode() {
            children = new HashMap<>();
        }
    }

    int countDistinctSubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            TrieNode curr=root;
            for (int j = i; j < s.length(); j++) {
            char letter = s.charAt(j);
            if (!curr.children.containsKey(letter)) {
                curr.children.putIfAbsent(letter, new TrieNode());
                count++;
            }
            curr = curr.children.get(letter);
            }

        }
        return count + 1;
    }

    static int count(String s) {
        HashSet<String> stringHashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder currString = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                currString.append(s.charAt(j));
                stringHashSet.add(currString.toString());
            }
        }
        return stringHashSet.size() + 1;


    }

    public static void main(String[] args) {
        System.out.println(count("ababa"));
        Trie trie= new Trie();
        System.out.println(trie.countDistinctSubstring("ababa"));
    }
}
