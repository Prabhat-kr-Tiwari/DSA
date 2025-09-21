package Trie.GfgTrie.hard.SearchQueryAutoComplete;

import java.util.*;

public class AutoCompleteSystem {

    public class TrieNode {
        Map<Character, TrieNode> children;
        Map<String, Integer> counts;
        boolean isEnd;

        public TrieNode() {

            children = new HashMap<>();
            counts = new HashMap<>();
            isEnd = false;

        }


    }
    TrieNode root;
    StringBuilder currentInput; // tracks ongoing input
    TrieNode currNode;
    public AutoCompleteSystem(String sentences[], int times[]) {

        root = new TrieNode();
        currentInput = new StringBuilder();
        currNode= root;
        for (int i = 0; i < sentences.length; i++) {

            insert(sentences[i],times[i]);
        }
    }
    private void  insert(String s,int freq){
        TrieNode curr = root;
        for (int i = 0; i <s.length() ; i++) {
            char letter = s.charAt(i);
            curr.children.putIfAbsent(letter,new TrieNode());
            curr = curr.children.get(letter);
            curr.counts.put(s,curr.counts.getOrDefault(s,0)+freq);

        }
        curr.isEnd = true;

    }

    ArrayList<String> input(char c) {

        ArrayList<String> result = new ArrayList<>();
        if (c=='#'){
            String sentence = currentInput.toString();
            insert(sentence,1);
            currentInput = new StringBuilder(); // reset for new input
            currNode =root;
            return result;
        }
        currentInput.append(c);
        if (currNode!= null){
            currNode = currNode.children.get(c);
        }
        if (currNode==null){
            return result;
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(currNode.counts.entrySet());
        list.sort((a,b)->{
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });

        int k = 3;
        for (Map.Entry<String,Integer> entry : list) {
            result.add(entry.getKey());
            if (--k == 0) break;
        }

        return result;
    }

    public static void main(String[] args) {

        // Initial data
        String[] sentences = {
                "i love you",
                "island",
                "ironman",
                "i love geeksforgeeks"
        };
        int[] times = {5, 3, 2, 2};

        AutoCompleteSystem system = new AutoCompleteSystem(sentences, times);

        // Simulate user typing
        System.out.println(system.input('i'));
        // Expected: [i love you, island, i love geeksforgeeks]

        System.out.println(system.input(' '));
        // Expected: [i love you, i love geeksforgeeks]

        System.out.println(system.input('a'));
        // Expected: []

        System.out.println(system.input('#'));
        // Expected: []

    }

}
