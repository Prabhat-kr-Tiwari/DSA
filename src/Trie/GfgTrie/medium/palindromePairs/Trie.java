package Trie.GfgTrie.medium.palindromePairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public class TrieNode {
        Map<Character, TrieNode> children;
        int wordIndex;
        List<Integer> palindromeSiffixList;

        public TrieNode() {
            children = new HashMap<>();
            wordIndex = -1;
            palindromeSiffixList = new ArrayList<>();

        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {

            if (s.charAt(left++) != s.charAt(right--)) return false;

        }
        return true;
    }

    //insert in reverse
    void insert(String s, int index) {
        if (s.isEmpty() || s == null) {
            return;
        }
        TrieNode curr = root;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (isPalindrome(s, 0, i)) {
                curr.palindromeSiffixList.add(index);
            }
            char letter = s.charAt(i);
            curr = curr.children.computeIfAbsent(letter, k -> new TrieNode());
        }
        curr.wordIndex = index;
        curr.palindromeSiffixList.add(index);
    }

    public boolean search(String word, int index) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            if (curr.wordIndex != -1 && curr.wordIndex != index && isPalindrome(word, i, word.length() - 1)) {
                return true;
            }
            char c = word.charAt(i);
            if (!curr.children.containsKey(c)) {
                return false;
            }
            curr = curr.children.get(c);
        }
        for (int otherIndex : curr.palindromeSiffixList) {
            if (otherIndex != index) {
                return true;
            }
        }
        return false;
    }
    static boolean palindromepair(int N, String arr[]) {
        Trie sol = new Trie();

        for (int i = 0; i < N; i++) {
            sol.insert(arr[i], i);
        }
        sol.printTrieAsTree();

        for (int i = 0; i < N; i++) {
            if (sol.search(arr[i], i)) {
                return true;
            }
        }

        return false;
    }
    public void printTrieAsTree() {
        printTrieHelper(root, new StringBuilder(), 0);
    }

    private void printTrieHelper(TrieNode node, StringBuilder prefix, int depth) {
        if (node.wordIndex != -1) {
            System.out.println("  ".repeat(depth) + "(END) Word Index: " + node.wordIndex);
        }
        if (!node.palindromeSiffixList.isEmpty()) {
            System.out.println("  ".repeat(depth) + "PalindromeSuffixList: " + node.palindromeSiffixList);
        }

        for (Map.Entry<Character, TrieNode> entry : node.children.entrySet()) {
            System.out.println("  ".repeat(depth) + "-> '" + entry.getKey() + "'");
            prefix.append(entry.getKey());
            printTrieHelper(entry.getValue(), prefix, depth + 1);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }





    public static void main(String[] args) {
//        String arr[] = {"geekf", "geeks", "or", "keeg", "abc", "bc"};
        String arr[] = {"abc", "cba", "xyx"};

        Trie t = new Trie();


        System.out.println(palindromepair(arr.length, arr));

    }

}



