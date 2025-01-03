package DynamicProgramming.AdityaVerma.matrixaChain;

public class ScrambledStringRecursive {

    public static boolean scrambledString(String a, String b) {
        // Base cases
        if (a.equals(b)) return true;
        if (a.length() != b.length()) return false;
        if (a.length() <= 1) return a.equals(b);

        int n = a.length();
        boolean flag = false;

        // Recursively check for each split
        for (int i = 1; i <= n - 1; i++) {
            System.out.println("a.substring(0,i)  "+a.substring(0,i));
            System.out.println("a.substring(n-i) "+a.substring(n-i));
            System.out.println("a.substring(i) "+a.substring(i));
            System.out.println("a.substring(0,n-i)"+a.substring(0,n-i));
            // Check if swapping or no-swapping gives scrambled match
            if ((scrambledString(a.substring(0, i), b.substring(n - i)) &&
                    scrambledString(a.substring(i), b.substring(0, n - i))) ||
                    (scrambledString(a.substring(0, i), b.substring(0, i)) &&
                            scrambledString(a.substring(i), b.substring(i)))) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String a = "great";
        String b = "rgeat";
        String S1="coder", S2="ocder";
        System.out.println(scrambledString(a, b)); // Output: true
    }
}
