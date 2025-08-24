package Trie.GfgTrie.medium.MaximumXORoftwonumbersinanarray;

import java.util.HashMap;
import java.util.Map;

class Solution {

    TrieNode root;

    public Solution() {
        root = new TrieNode();
    }

    public  class TrieNode {
        Map<Integer, TrieNode> children;

        public TrieNode() {
            children = new HashMap<>();
        }
    }

     void insert(int num) {
        TrieNode curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            curr.children.putIfAbsent(bit, new TrieNode());
            curr = curr.children.get(bit);
        }
    }

     int getMaxXOR(int num) {
        TrieNode curr = root;
        int maxXor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int toggleBit = 1 - bit;
            if (curr.children.containsKey(toggleBit)) {
                maxXor |= (1 << i);
                curr = curr.children.get(toggleBit);
            } else {
                curr = curr.children.get(bit);
            }
        }
        return maxXor;
    }

    public  int findMaximumXOR(int[] nums) {
        int maxXor = 0;
        for (int num : nums) {
            insert(num); // insert all elements first
        }

        for (int num : nums) {
            maxXor = Math.max(maxXor, getMaxXOR(num));
        }

        return maxXor;
    }

    public static void main(String[] args) {
       int a[] ={ 3,10,5,25,2,8};
       Solution s = new Solution();

        System.out.println(s.findMaximumXOR(a));
    }
}

//more optimized
class NewSolution {

    static class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }

    TrieNode root = new TrieNode();

    void insert(int num) {
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (node.children[bit] == null) {
                node.children[bit] = new TrieNode();
            }
            node = node.children[bit];
        }
    }

    int getMaxXOR(int num) {
        TrieNode node = root;
        int maxXor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int toggledBit = 1 - bit;
            if (node.children[toggledBit] != null) {
                maxXor |= (1 << i);//xor
                node = node.children[toggledBit];
            } else {
                node = node.children[bit];
            }
        }
        return maxXor;
    }

    public int findMaximumXOR(int[] nums) {
        int maxXor = 0;

        // Insert all numbers into Trie
        for (int num : nums) {
            insert(num);
        }

        // Query max XOR for each number
        for (int num : nums) {
            maxXor = Math.max(maxXor, getMaxXOR(num));
        }

        return maxXor;
    }

    public static void main(String[] args) {
        int a[] ={ 3,10,5,25,2,8};
        NewSolution s = new NewSolution();

        System.out.println(s.findMaximumXOR(a));
    }
}


