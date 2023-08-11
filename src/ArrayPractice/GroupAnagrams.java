package ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {


    static void checkAnagram(String a, String b) {


        boolean[] visited = new boolean[b.length()];

        boolean isAnagram = false;

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                isAnagram = false;
                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }

                }
                if (!isAnagram) {
                    break;
                }

            }
        }

        if (isAnagram) {
            System.out.println("anagram");
        } else {
            System.out.println("not");
        }
    }

    static boolean isAnagram(String a, String b) {
        int al[] = new int[256];
        int bl[] = new int[256];
        for (char c : a.toCharArray()
        ) {
            int index = (int) c;
            al[index]++;

        }
        for (char c : b.toCharArray()
        ) {
            int index = (int) c;
            bl[index]++;

        }

        boolean isEqual = Arrays.equals(al, bl);

       /* System.out.println(Arrays.toString(al));
        System.out.println(Arrays.toString(bl));*/
        /*if (isEqual){
            System.out.println("Anagram");
        }else{
            System.out.println("not anagram");
        }*/
        return isEqual;
    }

    //    List<List<String>>
    public static void groupAnagrams(String[] strs) {

        int n = strs.length;

        ArrayList<String> res = new ArrayList<String>();
//        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        boolean []visited=new boolean[strs.length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isAnagram(strs[i], strs[j])) {
                    if (!res.contains(strs[j])) {

                        res.add(strs[j]);
                    }
                }
            }
            ans.add(new ArrayList<String>(res));
//            ans.add(res);
        }

        System.out.println(res);
        System.out.println(ans);


    }

    public static void main(String[] args) {

       /* Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/

        //checkAnagram("aab", "abc");
        //System.out.println(an("aab","abc"));
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);


    }
}
