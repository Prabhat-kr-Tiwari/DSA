package rbAnjaliCodes.ProblemOfDay12072025;

public class MaximuXOROfTwoNumberInArray {


    //brute forece
    public static int findMaximumXOR(int[] nums) {
        int maxXor  = Integer.MIN_VALUE;


        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {

                int currxor = nums[i]^nums[j];
                maxXor = Math.max(currxor,maxXor);
            }
        }
        return maxXor;

    }


    public static void main(String[] args) {
        int [] nums = {3,10,5,25,2,8};
//        Output: 28
        System.out.println(findMaximumXOR(nums));
    }
}
class Solution {

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
                maxXor |= (1 << i);
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
}

