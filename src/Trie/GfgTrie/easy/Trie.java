package Trie.GfgTrie.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Unique rows in boolean matrix

Given a binary matrix your task is to find all unique rows of the given matrix in the order of their appearance in the matrix.

        Example 1:

Input:
row = 3, col = 4
M[][] = {{1 1 0 1},{1 0 0 1},{1 1 0 1}}
Output: $1 1 0 1 $1 0 0 1 $
Explanation: Above the matrix of size 3x4
looks like
1 1 0 1
        1 0 0 1
        1 1 0 1
The two unique rows are R1: {1 1 0 1} and R2: {1 0 0 1}.
As R1 first appeared at row-0 and R2 appeared at row-1, in the resulting list, R1 is kept before R2.*/


public class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    class TrieNode{
        Map<Integer,TrieNode> children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new HashMap<>();
        }

    }
    //modified insert to only insert unique value
    boolean  insert(int[] row){


        TrieNode curr = root;
        for (int i =0;i<row.length;i++){
            int letter = row[i];
            if (!curr.children.containsKey(letter)) {
                TrieNode newNode= new TrieNode();
                curr.children.putIfAbsent(letter,newNode);
            }
            curr = curr.children.get(letter);

        }
//        already exist
        if (curr.isEndOfWord){
            return false;
        }
        curr.isEndOfWord =true;
        return true;//new row inserted

    }


    public static void main(String[] args) {
        Trie trie = new Trie();
        int[][] M = {{1, 1, 0, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}};
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M.length; i++) {
           boolean isNew =  trie.insert(M[i]);
           if (isNew){

               ArrayList<Integer> arrayList =new ArrayList<>();
               for(int e:M[i]){
                   arrayList.add(e);
               }
               result.add(arrayList);
           }

        }
        System.out.println(result);



    }


}