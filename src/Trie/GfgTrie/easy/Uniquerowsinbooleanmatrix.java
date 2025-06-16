package Trie.GfgTrie.easy;

import Trie.CourseOnTrie.Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Uniquerowsinbooleanmatrix {


    public static ArrayList<ArrayList<Integer>> uniqueRow(int[][] a, int r, int c) {


        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < r; i++) {
            ArrayList<Integer> currentArrayList = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                currentArrayList.add(a[i][j]);
            }
            if (!result.contains(currentArrayList)) {
                result.add(currentArrayList);

            }
            System.out.println();
        }
        return result;
    }





    public static void main(String[] args) {
        int[][] M = {{1, 1, 0, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}};
        System.out.println(uniqueRow(M, M.length, M[0].length));
        Trie trie = new Trie();

    }
}
