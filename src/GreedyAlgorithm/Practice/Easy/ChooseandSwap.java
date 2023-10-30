package GreedyAlgorithm.Practice.Easy;

public class ChooseandSwap {



    static  String chooseandswap(String A){
        // Code Here


        char [] s=A.toCharArray();
        char first=s[0];
        char second=s[2];



        for (int i = 0; i <A.length() ; i++) {
            if(A.charAt(i)==first){
                A=A.replace(A.charAt(i),second);
            } else if (A.charAt(i)==second) {
                A=A.replace(A.charAt(i),first);

            }

        }

        return A;
    }
    static String chooseandswap2(String A) {
        if (A == null || A.length() < 2) {
            return A; // Nothing to swap
        }

        char[] s = A.toCharArray();
        char first = s[0];
        char second = s[2];
        char temp = 0; // Temporary variable for swapping

        for (int i = 0; i < A.length(); i++) {
            if (s[i] == first) {
                s[i] = second;
            } else if (s[i] == second) {
                s[i] = first;
            }
        }

        return new String(s);
    }

    public static void main(String[] args) {

      String  A = "ccad";
        System.out.println(chooseandswap2(A));

    }
}
