package GreedyAlgorithm.Practice;

import java.util.ArrayList;

public class GoodorBadstring {


/*
    In this problem, a String S is composed of lowercase
    alphabets and wildcard characters i.e. '?'. Here, '?'
    can be replaced by any of the lowercase alphabets. Now you have to classify the given String on
    the basis of following rules:

    If there are more than 3 consonants together or more than 5 vowels together, the String is considered
    to be "BAD". A String is considered "GOOD" only if it is not “BAD”.*/

    static ArrayList<Integer> countVowel(String s) {
        int countVowel= 0;
        int maxcount=0;

        ArrayList<Integer>al= new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                countVowel++;
                maxcount=Math.max(countVowel,maxcount);
            }else {
                countVowel=0;
//                countConstant++;
            }

        }
        al.add(maxcount);
//        al.add(countConstant);
        return al;
    }
    static ArrayList<Integer> countConsonant(String s) {
        int countConsonant = 0;
        int maxCount = 0;

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                countConsonant++;
                maxCount = Math.max(countConsonant, maxCount);
            } else {
                countConsonant = 0;
            }
        }
        al.add(maxCount);
        return al;
    }


    static int isGoodorBad(String S) {
        // code here
        ArrayList<Integer>al=countVowel(S);
        ArrayList<Integer>al2=countConsonant(S);

//        System.out.println(al);
        int val=al.get(0);
        int val2=al2.get(0);
        System.out.println(val);
        System.out.println(val2);

        return val;



    }
    public static int classifyString(String s) {
        int consecutiveConsonants = 0;
        int consecutiveVowels = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '?' || isVowel(c)) {
                consecutiveVowels++;
                consecutiveConsonants = 0;
            } else {
                consecutiveConsonants++;
                consecutiveVowels = 0;
            }

            if (consecutiveConsonants > 3 || consecutiveVowels > 5) {
                return 0; // It's a BAD string
            }
        }

        return 1; // It's a GOOD string
    }

    // Helper function to check if a character is a vowel
    public static boolean isVowel(char c) {
        return "aeiou".contains(String.valueOf(c));
    }


    public static void main(String[] args) {
        String S = "bcdaeiou??";
        System.out.println(classifyString(S));


    }
}
