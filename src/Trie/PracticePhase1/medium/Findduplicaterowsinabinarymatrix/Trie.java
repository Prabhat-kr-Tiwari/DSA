package Trie.PracticePhase1.medium.Findduplicaterowsinabinarymatrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Trie {

    TrieNode root;

    public Trie() {

        root = new TrieNode();

    }

    public class TrieNode {
        Map<Integer, TrieNode> children;
        boolean isAlreadyPresent;
        boolean isEndOfWord;

        public TrieNode() {
            children = new HashMap<>();
            isAlreadyPresent = false;
            isEndOfWord = false;
        }
    }

    boolean insert(int[] s) {
        TrieNode curr = root;
        for (int j : s) {
            curr.children.putIfAbsent(j, new TrieNode());
            curr = curr.children.get(j);
        }
        if (curr.isAlreadyPresent) {
            return true;
        } else {
            curr.isAlreadyPresent = true;
            return false;
        }
    }

    public ArrayList<Integer> repeatedRows(int matrix[][], int m, int n) {
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
    }
}
