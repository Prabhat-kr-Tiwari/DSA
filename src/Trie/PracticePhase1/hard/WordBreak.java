package Trie.PracticePhase1.hard;

import java.util.*;

public class WordBreak {


    //naive
    public static boolean wordBreakUsingSegmentation(String s,Set<String> set){
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        //empty string is segemtn
        dp[0] = true;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <i ; j++) {
                if (dp[j]&&set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];

    }

    //optimized
//    using trie
    TrieNode root;
    public WordBreak(){

        root = new TrieNode();
    }
    public class TrieNode{
        Map<Character ,TrieNode> children;
        boolean isEndOfWord;

        public TrieNode(){
            children = new HashMap<>();
            isEndOfWord = false;

        }
    }
    void insert(String s){
        TrieNode curr = root;
        for (int i = 0; i <s.length() ; i++) {
            char  ch = s.charAt(i);
            if (!curr.children.containsKey(ch)){
                curr.children.putIfAbsent(ch, new TrieNode());
            }
            curr = curr.children.get(ch);
        }
        curr.isEndOfWord = true;
    }
    boolean search(String s){
        if (s == null||s.isEmpty()) return false;
        TrieNode curr = root;
        for (int i = 0; i <s.length() ; i++) {
            char ch  = s.charAt(i);
            if (!curr.children.containsKey(ch)){
                return false;
            }
            curr = curr.children.get(ch);
        }
        return curr.isEndOfWord;
    }
    public static boolean wordBreakUtil(String s, WordBreak trie, Map<String, Boolean> memo) {
        if (s.isEmpty()) return true;

        if (memo.containsKey(s)) return memo.get(s);

        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (trie.search(prefix) && wordBreakUtil(s.substring(i), trie, memo)) {
                memo.put(s, true);
                return true;
            }
        }

        memo.put(s, false);
        return false;
    }

    public static boolean wordBreak(String s, String[] dictionary) {
        // code here
        WordBreak trie = new WordBreak();
        for (String string : dictionary) {
            trie.insert(string);
        }
        Map<String, Boolean> memo = new HashMap<>();

        return wordBreakUtil(s, trie,memo);

    }
    public static void main(String[] args) {
      String   s = "ilike";
      String[] dictionary = {"i", "like", "gfg"};
        Set<String> set = new HashSet<>();
        Collections.addAll(set,dictionary);
//        System.out.println(wordBreakUsingSegmentation(s,set));
        System.out.println(wordBreak(s,dictionary));
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        String []a = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++) {
            a[i] =stringList.get(i);
        }

    }
}
