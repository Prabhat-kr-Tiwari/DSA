package tenDaysRecursionChalengeloveBabbar.RecursionDay7;

public class subsequence {

    static void utilsubsequence(String str, int index, String currentString, int size) {

        if (index == size) {
            System.out.print(currentString + " ");
            return;
        }
        utilsubsequence(str, index + 1, currentString, size);
        utilsubsequence(str, index + 1, currentString + str.charAt(index), size);

    }
    static void subSequence(String s) {
        utilsubsequence(s, 0, " ", s.length());
    }
    public static void main(String[] args) {
        String s = "abc";
        subSequence(s);
    }
}
