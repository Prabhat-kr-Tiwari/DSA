package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.ArrayList;
import java.util.List;

public class GeekandhisBinaryStrings {
    static List<String> BinaryString(int N) {
        List<String> arraylist = new ArrayList<>();
        BinaryStringDp(N, "", arraylist);
        return arraylist;
    }
    static void BinaryStringDp(int N, String s, List<String> binaryString) {
        if (s.length() == N) {
            binaryString.add(s);
            return;
        }
        BinaryStringDp(N, s + "0", binaryString);
        BinaryStringDp(N, s + "1", binaryString);
    }
    static int prefixStrings(int N) {
        int resultCount = 0;
        // Code here
        List<String> binaryStringList = BinaryString(2 * N);
        System.out.println(binaryStringList);
        for (String s : binaryStringList) {
            if (countOne(s, N)) {
                System.out.println("String->>"+s);
                resultCount++;
            }
        }
        return resultCount;
    }

    static Boolean countOne(String binaryString, int N) {
        int countOfZero = 0;
        int countOfOne = 0;
        char[] c = binaryString.toCharArray();
        for (char value : c) {
            if (value == '1') {
                countOfOne++;
            }
            if (value=='0'){
                countOfZero++;
            }
        }
        return (countOfZero == N)&&(countOfOne==N);
    }


    static final int MOD = 1000000007;


    static int prefixStrings1(int N) {
        List<String> validStrings = new ArrayList<>();
        generateValidStrings1(0, 0, 2 * N, "", validStrings);
        return validStrings.size() % MOD;
    }

    // Recursive function to generate valid binary strings
    static void generateValidStrings1(int ones, int zeros, int N, String current, List<String> validStrings) {
        // Base case: If the string length is 2N, add it to the list
        if (current.length() == N) {
            validStrings.add(current);
            return;
        }

        // Add '1' if the number of '1's is less than N
        if (ones < N / 2) {
            generateValidStrings1(ones + 1, zeros, N, current + "1", validStrings);
        }

        // Add '0' only if the number of '0's is less than the number of '1's
        if (zeros < ones) {
            generateValidStrings1(ones, zeros + 1, N, current + "0", validStrings);
        }
    }
    public static void main(String[] args) {
        System.out.println(prefixStrings(2));
    }
}
