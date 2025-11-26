package slidingWIndow.gfgPractice.slidingWIndowTag.easy.CheckifPermutationisSubstring;

/*Check if Permutation is Substring
Difficulty: EasyAccuracy: 36.89%Submissions: 2K+Points: 2
Given two strings txt and pat having lowercase letters, the task is to check if any permutation of pat is a substring of txt.

        Examples:

Input: txt = "geeks", pat = "eke"
Output: true
Explanation: "eek" is a permutation of "eke" which exists in "geeks".
Input: txt = "programming", pat = "rain"
Output: false
Explanation: No permutation of "rain" exists as a substring in "programming".
Constraints:
        1 ≤ txt.size() ≤ 105
        1 ≤ pat.size() ≤ txt.size()
Both the strings consist of lowercase English alphabets.*/
public class CheckifPermutationisSubstring {


    static boolean search(String txt, String pat) {
        // Write your code here
        int i = 0;
        int j = 0;
        int size = txt.length();
        if (pat.length() > txt.length()) return false;
        int[] freqPat = new int[26];
        int[] freqWin = new int[26];
        for (char k : pat.toCharArray()) {
            freqPat[k - 'a']++;
        }
        int windowSize = pat.length();
        while (j < size) {
            freqWin[txt.charAt(j) - 'a']++;
            if (j - i + 1 < windowSize) {
                j++;
            } else if (j - i + 1 == windowSize) {
                //get ans
                if (matches(freqPat, freqWin)) return true;

                freqWin[txt.charAt(i) - 'a']--;
                i++;
                j++;


            }
        }
        return false;
    }

    static boolean matches(int[] a, int[] b) {
        for (int k = 0; k < 26; k++) {
            if (a[k] != b[k]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String txt = "geeks";
        String pat = "eke";
       String txt1 = "programming";
        String pat1 = "rain";
        System.out.println(search(txt1, pat1));
    }
}
