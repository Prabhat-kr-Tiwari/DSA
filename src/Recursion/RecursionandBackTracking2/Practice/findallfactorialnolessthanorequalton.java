package Recursion.RecursionandBackTracking2.Practice;
//https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty[]=-1&page=1&query=problemTypefunctionaldifficulty[]-1page1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-factorial-numbers-less-than-or-equal-to-n
import java.util.ArrayList;

public class findallfactorialnolessthanorequalton {


    static ArrayList<Long> factorialNumbers(long N) {
        // code here
        ArrayList<Long> al = new ArrayList<>();
        ArrayList<Long> aln = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            al.add(fact(i));

        }
        //return al;
        ArrayList<Long> newList = new ArrayList<Long>();
        // Traverse through the first list
        for (Long element : al) {
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }
        for (long a : newList
        ) {
            if (a <=N) {
                aln.add(a);
            }

        }
        return aln;
    }

    static long fact(long n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialNumbers(6));

    }
}
