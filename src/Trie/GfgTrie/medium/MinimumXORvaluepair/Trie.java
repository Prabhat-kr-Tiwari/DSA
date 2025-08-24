package Trie.GfgTrie.medium.MinimumXORvaluepair;



public class Trie {

    //brute force
    static int minxorpair(int N, int arr[]) {

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, arr[i - 1] ^ arr[i]);
        }
        return ans;
    }

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

    int getMinXor(int num) {
        TrieNode node = root;
        int minXor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int toggledBit = 1 - bit;

            if (node.children[bit] != null) {

                node = node.children[bit];
            } else {
                minXor |= (1 << i);
                node = node.children[toggledBit];

            }
        }
        return minXor;

    }

     int minxorpair2(int N, int arr[]) {
        int minXor =Integer.MAX_VALUE;
        for (int num :arr){
            insert(num);
        }
        for(int num:arr){
            minXor = Math.min(minXor,getMinXor(num));
        }
        return minXor;
    }
    int minxorpair3(int N, int arr[]) {
        int minXor = Integer.MAX_VALUE;

        insert(arr[0]); // insert first element

        for (int i = 1; i < N; i++) {
            int num = arr[i];
            // query against previously inserted numbers
            minXor = Math.min(minXor, getMinXor(num));
            // insert current number for future queries
            insert(num);
        }
        return minXor;
    }



    public static void main(String[] args) {

        int arr[] = {9, 5, 3};
        Trie t  = new Trie();

        System.out.println(t.minxorpair3(arr.length, arr));
    }
}
