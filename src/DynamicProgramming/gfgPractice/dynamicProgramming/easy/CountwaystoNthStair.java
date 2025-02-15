package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

import java.util.*;

public class CountwaystoNthStair {


   /* static HashSet<String> distinctWays = new HashSet<>();

    static void countDistinctWays(int n, String path) {
        if (n == 0) {
            // Add the path to the set when you reach the 0th step
            distinctWays.add(path);
            return;
        }
        if (n < 0) {
            return; // Invalid case
        }

        // Recur with step of size 1
        countDistinctWays(n - 1, path + " 1 ");

        // Recur with step of size 2
        countDistinctWays(n - 2, path + " 2 ");
    }*/

    static HashSet<List<Integer>> distinctWays = new HashSet<>();

    static void countDistinctWays(int n, List<Integer> path) {
        if (n == 0) {
            List<Integer> sortedPath = new ArrayList<>(path);
            Collections.sort(sortedPath);
            // Add the path to the set when you reach the 0th step
            distinctWays.add(sortedPath); // Ensure a new list is stored
            return;
        }
        if (n < 0) {
            return; // Invalid case
        }

        // Recur with step of size 1
        path.add(1);
        countDistinctWays(n - 1, path);
        path.remove(path.size() - 1); // Backtrack

        // Recur with step of size 2
        path.add(2);
        countDistinctWays(n - 2, path);
        path.remove(path.size() - 1); // Backtrack
    }
    static Long countWays(int n) {
        // your code here


        if (n==2||n==1){
            return (long) n;
        }

        long left= countWays(n-1);
        long right=countWays(n-2);
        return left+right;

    }
    public static void main(String[] args) {
        countDistinctWays(4,new ArrayList<>());
        System.out.println("Number of distinct ways: " + distinctWays.size());
        System.out.println("Distinct paths: " + distinctWays);

        System.out.println(countWays(4));

        for (List<Integer> way : distinctWays) {
            System.out.println(way);
        }

    }









}
