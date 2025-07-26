package Trie.GfgTrie.medium.MostfrequentwordinanarrayofstringsGFG;

import Trie.PracticePhase1.hard.WordBreak;

import java.util.HashMap;
import java.util.Map;

/*Input:
N = 3
arr[] = {geeks,for,geeks}
Output: geeks
Explanation: "geeks" comes 2 times.*/
public class Trie {


    static TrieNode root;

    public Trie(){
        root = new TrieNode();

    }
    public class TrieNode{
        Map<Character,TrieNode> children;
        boolean isEndOfWord;
        int occurrence;

        public TrieNode(){
            children = new HashMap<>();
            isEndOfWord = false;
            occurrence =0;
        }
    }
    void insert(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            if (!curr.children.containsKey(ch)){


            curr.children.putIfAbsent(ch, new TrieNode());
            }
            curr = curr.children.get(ch);

        }
        curr.isEndOfWord = true;
        curr.occurrence += 1; // Only increment here — when full word ends
    }

    int getOccurrence(String s){
        TrieNode curr = root;
        for (char ch:s.toCharArray()){
            if (!curr.children.containsKey(ch)){
                return 0;
            }
            curr = curr.children.get(ch);
        }

        return curr.occurrence;

    }
    public String mostFrequentWord(String arr[], int n) {
        root = new TrieNode();
        int maxFreq = 0;
        String result = "";

        for (int i = n - 1; i >= 0; i--) {
            insert(arr[i]);
            int occ = getOccurrence(arr[i]);

            if (occ > maxFreq) {
                maxFreq = occ;
                result = arr[i];
            }

        }

        return result;


    }

    public static void main(String[] args) {
       String [] arr = {"geeks","for","geeks"};
       String ar[] = {"hello","world"};
     String a[] ={  "budxdu", "budxdu", "akfwn" ,"akfwn" ,"budxdu", "akfwn" ,"suoko", "akfwn" ,"budxdu", "dhxeg", "suoko", "akfwn", "dhxeg"};


     Trie t = new Trie();
        System.out.println(t.mostFrequentWord(a, a.length));
    }
}
