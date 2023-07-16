package Top100Codes.GettingStarted;

import java.util.ArrayList;

public class Factorsofanumber {
    static void factor(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }

        }
    }

    //using recursion
    static ArrayList<Integer> factorUsingRecursion(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 1;
        while (i <=n) {
            if (n % i == 0)
                i++;
            al.add(i);

        }
        factorUsingRecursion(n - 1);
        return al;
    }

    public static void main(String[] args) {
        int n = 10;
        factor(n);
    }
}
