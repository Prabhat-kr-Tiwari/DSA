package Trie.GfgTrie.medium.maximumxorsubarray;

import java.util.HashMap;
import java.util.Map;

public class Trie {


    TrieNode root;
    public  Trie(){
        root = new TrieNode();
    }


    public class  TrieNode{
        Map<Integer,TrieNode > children;
        boolean isEndOfWord;


        public  TrieNode(){
            children = new HashMap<>();
            isEndOfWord = false;

        }
    }
    // Insert 32-bit representation of number into Trie
    void insert(int num) {
        TrieNode curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            curr.children.putIfAbsent(bit, new TrieNode());
            curr = curr.children.get(bit);
        }
    }

    // Search maximum XOR for given number with all numbers in the Trie
    int getMaxXOR(int num) {
        TrieNode curr = root;
        int maxXor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int toggleBit = 1 - bit; // opposite bit to maximize XOR
            if (curr.children.containsKey(toggleBit)) {
                maxXor |= (1 << i);
                curr = curr.children.get(toggleBit);
            } else {
                curr = curr.children.getOrDefault(bit, curr);
            }
        }
        return maxXor;
    }

    // Main function to find max XOR subarray
    public int maximumXORSubArray(int[] a) {
        int maxXor = Integer.MIN_VALUE;
        int prefixXor = 0;

        insert(0); // for subarrays starting at index 0

        for (int num : a) {
            prefixXor ^= num;
            insert(prefixXor);
            maxXor = Math.max(maxXor, getMaxXOR(prefixXor));
        }

        return maxXor;
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        int[] arr = {1,2,3,4};
        int a [] = {3,10,5,25,2,8};
        System.out.println("Max XOR Subarray: " + trie.maximumXORSubArray(a));
    }
}
