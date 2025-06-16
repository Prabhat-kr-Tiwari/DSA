package Trie.GfgTrie.medium;

import java.util.HashMap;

public class Mostfrequentwordinanarrayofstrings {


    public static String mostFrequentWord(String arr[], int n) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String ans = "";
        int max_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);

            } else {
                hashMap.put(arr[i], 1);
            }
            max_count = Math.max(max_count, hashMap.get(arr[i]));
        }
        for (int i = 0; i < n; i++) {
            if (hashMap.get(arr[i]) == max_count) {
                ans = arr[i];
                hashMap.put(arr[i], hashMap.get(arr[i]) - 1);
            }
        }


        return ans;


    }

    public static void main(String[] args) {
       int N = 3;
        String arr[] = {"geeks","for","geeks"};
        System.out.println(mostFrequentWord(arr,N));
    }
}
