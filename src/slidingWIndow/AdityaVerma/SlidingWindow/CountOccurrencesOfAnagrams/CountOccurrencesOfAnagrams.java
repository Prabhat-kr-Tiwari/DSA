package slidingWIndow.AdityaVerma.SlidingWindow.CountOccurrencesOfAnagrams;

import java.util.HashMap;

public class CountOccurrencesOfAnagrams {


    int searchBruteForce(String pat, String txt) {
        // code here
        int m = pat.length();
        int n = txt.length();
        int count=0;
        
        if (m>n) return 0;
        for (int i = 0; i <= n-m; i++) {
            int[] freq = new int[26];
            for (int j = 0; j <m ; j++) {
                freq[pat.charAt(j)-'a']++;
                freq[txt.charAt(i+j)-'a']--;
            }
            boolean isAnagram = true;
            for(int v:freq){
                if (v!=0){
                    isAnagram=false;
                    break;
                }
            }
            if (isAnagram) {
                count++;
            }
        }
        return count;


    }
 static    int search(String pat, String txt) {
        // code here
        int i=0;
        int j=0;
        int k = pat.length();
        int size = txt.length();
        int ans =0;

        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : pat.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count =map.size();
        while (j<size){
            //calculation
            char ch = txt.charAt(j);
            if(map.containsKey(ch)){
               map.put(ch,map.get(ch)-1);
               if (map.get(ch)==0){
                   count--;
               }
            }

            if((j-i+1)<k){
                //reach the window
                j++;
            } else if ((j-i+1)==k) {
                //ans from calculation
                if (count==0){
                    ans++;
                }
                //maintain window size
                char startChar = txt.charAt(i);
                if (map.containsKey(startChar)){
                    if (map.get(startChar)==1){
                        count++;
                    }

                    map.put(startChar,map.get(startChar)+1);
                }

                //slide
                i++;
                j++;
            }

        }
        return ans;

    }
    public static void main(String[] args) {

      String  txt = "forxxorfxdofr", pat = "for";
        System.out.println(search(pat,txt));

    }
}
