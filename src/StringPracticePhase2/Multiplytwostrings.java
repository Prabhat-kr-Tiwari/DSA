package StringPracticePhase2;

import java.util.Arrays;

public class Multiplytwostrings {
/*s1 = "0033"
s2 = "2"
Output:
66*/
    static int countNumber(int a){
        int count=0;
        while (a!=0){
            int digit=a%10;
            a=a/10;
            count++;
        }
        return count;
    }

    static void multiply(int a,int b){

        int array[]=new int[countNumber(a)];
        int newnumber=0;
        int i=0;
        while (a!=0){
            int digit=a%10;
            array[i++]=digit;
            a=a/10;

        }
        System.out.println(Arrays.toString(array));
    }
    public static String removeLeadingZeros(String input) {
        int startIndex = 0;

        // Find the index of the first non-zero digit
        while (startIndex < input.length() && input.charAt(startIndex) == '0') {
            startIndex++;
        }

        // If startIndex is equal to the length of the input, it means the string is all zeros
        if (startIndex == input.length()) {
            return "0";
        }

        return input.substring(startIndex);
    }

   public static void multiplyStrings(String s1, String s2)
    {
        String snew=removeLeadingZeros(s1);
        String s2new=removeLeadingZeros(s2);


        int i=Integer.parseInt(snew);
        int i2=Integer.parseInt(s2new);
        System.out.println(i*i2);

    }
    public static void main(String[] args) {
        multiplyStrings("0010","0020");

    }
}
