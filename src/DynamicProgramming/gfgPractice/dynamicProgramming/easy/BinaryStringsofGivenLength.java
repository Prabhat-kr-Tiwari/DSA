package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringsofGivenLength {

    static List<String> BinaryString(int N) {
        List<String> arraylist = new ArrayList<>();
        BinaryStringDp(N, "", arraylist);
        return arraylist;
    }

    static void BinaryStringDp(int N, String s, List<String> result) {

        if (s.length()==N){
            result.add(s);
            return;
        }
        BinaryStringDp(N,s+"0",result);
        BinaryStringDp(N,s+"1",result);
    }

    public static void main(String[] args) {

        int N = 3;
        List<String> binaryStrings = BinaryString(N);
        System.out.println("Binary strings of length " + N + ": " + binaryStrings);
    }
}
