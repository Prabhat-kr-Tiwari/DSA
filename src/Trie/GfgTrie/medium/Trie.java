package Trie.GfgTrie.medium;

import java.util.HashMap;
import java.util.Map;

//Word Boggle
public class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    class TrieNode {


        Map<Character, TrieNode> children;
        boolean isEndOfWord;
        boolean isVisited;

        public TrieNode() {
            children = new HashMap<>();
            isVisited = false;
            isEndOfWord = false;
        }
    }

    void insert(String s) {
        TrieNode curr = root;

        if (s.isEmpty()) return;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)) {
                TrieNode newNode = new TrieNode();
                curr.children.put(letter, newNode);
            }
            curr = curr.children.get(letter);
        }
        curr.isEndOfWord = true;
        curr.isVisited = false;
    }

    boolean search(String s) {
        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)) {
                return false;
            }
        }
        if (curr.isEndOfWord && !curr.isVisited) {
            curr.isVisited = true;
            return true;
        }
        return false;


    }
   /* public String[] wordBoggle(char board[][], String[] dictionary) {
        // Write your code here



    }*/

    public static void main(String[] args) {
       int N = 4;
        String []dictionary = {"GEEKS","FOR","QUIZ","GO"};
       int R = 3, C = 3;
      char [][]  board = {{'G','I','Z'},{'U','E','K'},{'Q','S','E'}};


    }

}
