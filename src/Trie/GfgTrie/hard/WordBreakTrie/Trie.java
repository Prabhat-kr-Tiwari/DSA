package Trie.GfgTrie.hard.WordBreakTrie;

import java.util.*;

public class Trie {

    TrieNode root;
    public Trie(){
        root= new TrieNode();
    }
    public class TrieNode{
        boolean isEndOfWord;
        Map<Character,TrieNode> children;
        public TrieNode(){
            children = new HashMap<>();
            isEndOfWord = false;
        }

    }
    void insert(String s){
      TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!curr.children.containsKey(c)){
                curr.children.putIfAbsent(c, new TrieNode());

            }
            curr = curr.children.get(c);
        }
        curr.isEndOfWord = true;

    }
   /* public static Set<String> substring(String s){

        Set<String> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <s.length() ; j++) {

                result.add(s.substring(i,j+1));
            }
        }
        return result;
    }*/
    boolean search(String s){
        if (s==null||s.isEmpty())
        {return false;}

        TrieNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!curr.children.containsKey(letter)){
                return false;
            }
            curr = curr.children.get(letter);
        }
        return curr.isEndOfWord;
    }
    public static boolean wordBreakUtil(String s, Trie t){
        if (s.isEmpty()){
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (t.search(s.substring(0,i)) && wordBreakUtil(s.substring(i), t)) {
                return true;
            }
        }
        return false;
    }

    public static int wordBreak(String A, ArrayList<String> B) {
        Trie t = new Trie();
        for (String s : B) {
            t.insert(s);
        }
        return wordBreakUtil(A, t) ? 1 : 0;
    }

    public static boolean canSegmentString(String s, Set<String> dictionary) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;  // Empty string can be segmented

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dictionary.contains(s.substring(j, i))) {
                    dp[i] = true;
                    System.out.println(s.substring(j,i));
                    break;
                }
            }
        }
        for (boolean b : dp) {
            System.out.print(b+"  ");
        }

        return dp[n];
    }
    public static int wordBreakUsingSegmentation(String A, ArrayList<String> B) {
        // code here
        int n = A.length();
        Set<String> dictionary = new HashSet<>(B);

        boolean[] dp = new boolean[n + 1];
        dp[0] = true;  // Empty string can be segmented

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dictionary.contains(A.substring(j, i))) {
                    dp[i] = true;
                    System.out.println(A.substring(j,i));
                    break;
                }
            }
        }

        return dp[n] ?1:0;

    }

    public static void main(String[] args) {
      String[]  B = { "i", "like", "sam", "sung", "samsung",
                "mobile","ice","cream", "icecream", "man",
                "go", "mango" };
        ArrayList<String> s = new ArrayList<>(Arrays.asList(B));

      String A = "ilike";
      Set<String > set = new HashSet<>();
//        Collections.addAll(set, B);
//        System.out.println(canSegmentString(A,set));
        System.out.println(wordBreak(A,s));
    }
}
