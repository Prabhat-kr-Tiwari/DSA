package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.HashMap;

/*Given a string s containing n lowercase alphabets and an integer k,
 a string is considered a "k-palindrome" if it can be converted into a
 palindrome by removing no more than k characters. Your task is to determine
  whether the given string s can be made into a k-palindrome or not.

        Example 1:

Input:
s = abcdecba
        k = 1
Output:
        true
Explanation:
        Since k = 1, by removing either 'd' or 'e', the string can become a
         palindrome.
        - Hence answer is true.*/
public class KPalindrome {

    static boolean isPalindrome(String s){
        boolean ispalin=false;
        StringBuilder rev=new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            rev.append(s.charAt(i));

        }
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == rev.charAt(i)) {
                ispalin = true;
//               break;
            }else{
                ispalin=false;
                break;
            }
        }
        return ispalin;

    }
   static boolean iskPalindrome(String str, int k) {
        // code here
       boolean ispalin=false;

       String currstr=str;
       System.out.println(currstr);
       for (int i = 0; i <k ; i++) {

           int n=currstr.length()/2;

           currstr.replace(currstr.charAt(n),' ');
           if (isPalindrome(currstr)){
               ispalin=true;
               continue;
           }else{
               iskPalindrome(currstr,' ');
           }


       }
       return ispalin;



   }
    static boolean iskPalindrome1(String str, int k) {
        return isKPalindromeHelper(str, 0, str.length() - 1, k);
    }

    static boolean isKPalindromeHelper(String str, int left, int right, int k) {
        // Base cases
        if (left >= right) return true;
        if (k < 0) return false;

        // If characters are equal, move both pointers
        if (str.charAt(left) == str.charAt(right)) {
            return isKPalindromeHelper(str, left + 1, right - 1, k);
        }

        // Try removing either left or right character and decrease k
        return isKPalindromeHelper(str, left + 1, right, k - 1) ||
                isKPalindromeHelper(str, left, right - 1, k - 1);
    }
    static boolean isKPalindromeDP1(String s,int k){

        HashMap<String,Boolean>hashMap=new HashMap<>();
        return isKPalindromeHelperDp1(s,0,s.length()-1,k,hashMap);
    }

    static boolean isKPalindromeHelperDp1(String s,int left,int right,int k, HashMap<String ,Boolean> hashMap){



        if (k<0) return false;
        if (left>=right) return true;
        String key = left + ":" + right + ":" + k;
        if (hashMap.containsKey(key)){
            return hashMap.get(key);
        }
        // If characters are equal, move both pointers
        if (s.charAt(left) == s.charAt(right)) {
            boolean result= isKPalindromeHelperDp1(s, left + 1, right - 1, k,hashMap);
            hashMap.put(key,result);
            return result;
        }
        boolean result=isKPalindromeHelperDp1(s, left + 1, right, k - 1,hashMap) ||
                isKPalindromeHelperDp1(s, left, right - 1, k - 1,hashMap);
        hashMap.put(s,result);
        return result;


    }
    static boolean isKPalindromeDP(String s, int k) {
        HashMap<String, Boolean> hashMap = new HashMap<>();
        return isKPalindromeHelperDp(s, 0, s.length() - 1, k, hashMap);
    }

    static boolean isKPalindromeHelperDp(String s, int left, int right, int k, HashMap<String, Boolean> hashMap) {
        if (k < 0) return false; // Base case: exceeded allowed modifications
        if (left >= right) return true; // Base case: single character or no characters left

        // Generate a unique key for the current state
        String key = left + ":" + right + ":" + k;

        // Check memoization
        if (hashMap.containsKey(key)) {
            return hashMap.get(key);
        }

        // If characters are equal, move both pointers
        if (s.charAt(left) == s.charAt(right)) {
            boolean result = isKPalindromeHelperDp(s, left + 1, right - 1, k, hashMap);
            hashMap.put(key, result);
            return result;
        }

        // If characters are not equal, consider both deletion scenarios
        boolean result = isKPalindromeHelperDp(s, left + 1, right, k - 1, hashMap) ||
                isKPalindromeHelperDp(s, left, right - 1, k - 1, hashMap);

        // Store result in memoization map
        hashMap.put(key, result);
        return result;
    }





    public static void main(String[] args) {

       String  s = "qqfwup";
        int k = 4;
        System.out.println(isKPalindromeDP1(s,k));

    }
}
