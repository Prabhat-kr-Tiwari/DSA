package String1;

import java.util.Arrays;

public class checkanagram {

    static boolean isAnagram(String s, String t) {


        char[] ch=s.toCharArray();
        char[] ch2=t.toCharArray();
        int n1 = ch.length;
        int n2 = ch2.length;

        // If length of both strings is not
        // same, then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(ch);
        Arrays.sort(ch2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (ch[i] != ch2[i])
                return false;

        return true;
    }
    static boolean anagrams(String s1, String s2) {
        int a[] = new int[256];

        for(int i = 0; i<s1.length(); i++) {
            a[s1.charAt(i)]++;
        }

        for(int e: a) {
            System.out.print(e+" ");
        }

        System.out.println();
        for(int i = 0; i<s2.length(); i++) {
            a[s2.charAt(i)]--;
        }
        for(int e: a) {
            System.out.print(e+" ");
        }

        for(int e: a) {
            if(e != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("hello","ellho"));
        System.out.println(anagrams("rat","car"));

    }

}
