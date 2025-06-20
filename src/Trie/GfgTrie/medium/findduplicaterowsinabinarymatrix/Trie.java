package Trie.GfgTrie.medium.findduplicaterowsinabinarymatrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Trie {

    TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    public class TrieNode{
        Map<Integer,TrieNode > children;
        boolean isEndOfWord;
        boolean isAlreadyPresent;


        public TrieNode(){
            children = new HashMap<>();
            isEndOfWord = false;
            isAlreadyPresent = false;
        }
    }
    boolean insert(int[] arr) {
        TrieNode curr = root;
        for (int val : arr) {
            curr.children.putIfAbsent(val, new TrieNode());
            curr = curr.children.get(val);
        }

        if (curr.isEndOfWord) {
            return true;  // row already exists
        } else {
            curr.isEndOfWord = true;
            return false; // new row
        }
    }

    public  ArrayList<Integer> repeatedRows(int matrix[][], int m, int n) {
        // code here

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (insert(matrix[i])) {
                result.add(i);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        int[][] matrix1 = {
                {1, 0},
                {1, 0}
        };
        System.out.println(trie.repeatedRows(matrix1, 2, 2));  // Output: [1]

        int[][] matrix2 = {
                {1, 0, 0},
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        System.out.println(trie.repeatedRows(matrix2, 4, 3));
    }
}
