package slidingWIndow.AdityaVerma.SlidingWindow.VariableSizeSlidingWindow.LongestSubstringWithKUniqueCharacters;

import java.util.HashMap;

public class LongestSubstringWithKUniqueCharacters {


    static int longestKSubstr(String s, int k) {
        // code here

        int ans  = 0;
        int i=0;
        int j=0;
        int size = s.length();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        while (j<size){
            //calculation
            hashMap.put(s.charAt(j), hashMap.getOrDefault(s.charAt(j), 0) +1);

            //reach windpw
            if (hashMap.size()<k){
                j++;
            } else if (hashMap.size()==k) {

                //get ans from calc
                ans = Math.max(ans,j-i+1);
                j++;
            } else if (hashMap.size()>k) {
                //maintain window size
                while (hashMap.size()>k){
                    int currentCount = hashMap.get(s.charAt(i));
                    hashMap.put(s.charAt(i),currentCount-1);
                    if (hashMap.get(s.charAt(i))==0){
                        hashMap.remove(s.charAt(i));
                    }
                    //slide
                    i++;
                }

                //slid
                j++;
            }


        }
        return ans;


    }
    public static void main(String[] args) {

       String s = "aabacbebebe";int  k = 3;
        System.out.println(longestKSubstr(s,k));
    }
}
