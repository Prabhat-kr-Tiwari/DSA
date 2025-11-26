package leetcode75.slidingWindow.MaximumNumberofVowelsinaSubstringofGivenLength;

public class MaximumNumberofVowelsinaSubstringofGivenLength {


    static int maxVowels(String s, int k) {
        int i =0;
        int j=0;
        int size=s.length();
        int max=0;
        StringBuilder stringBuilder = new StringBuilder();
        while (j<size){
            //calculation
            stringBuilder.append(s.charAt(j));
            if ((j-i+1)<k){
                j++;

            } else if ((j-i+1)==k) {
//                get ans from calultion
                int currentCountVowel =0;
                for (int l = 0; l < stringBuilder.length(); l++) {
                    if (isVowel(stringBuilder.charAt(l))){
                        currentCountVowel++;
                    }
                }
                max =  Math.max(currentCountVowel,max);


                //maintain window
                stringBuilder.delete(0,1);

                //slide
                i++;
                j++;

            }
        }
        return  max;

    }
    static int maxVowelsOptimize(String s, int k) {
        int i =0;
        int j=0;
        int size=s.length();
        int max=0;
        int currentCountVowel =0;

        while (j<size){
            //calculation
            if (isVowel(s.charAt(j))){
                currentCountVowel++;
            }
            if ((j-i+1)<k){
                j++;

            } else if ((j-i+1)==k) {
//                get ans from calultion

                max =  Math.max(currentCountVowel,max);


                //maintain window
                if (isVowel(s.charAt(i))){
                    currentCountVowel--;
                }

                //slide
                i++;
                j++;

            }
        }
        return  max;

    }

   static boolean isVowel(char c) {
        if (c == 'a' || c == 'A') {
            return true;
        } else if (c == 'e' || c == 'E') {
            return true;
        } else if (c == 'i' || c == 'I') {
            return true;
        } else if (c == 'o' || c == 'O') {
            return true;
        } else if (c == 'u' || c == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;
//        Output: 3
//        Explanation: The substring "iii" contains 3 vowel letters.
        System.out.println(maxVowels(s, k));
        System.out.println(maxVowelsOptimize(s, k));
    }
}
