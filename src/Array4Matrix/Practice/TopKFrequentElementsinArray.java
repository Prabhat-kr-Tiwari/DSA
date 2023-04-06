package Array4Matrix.Practice;

import java.util.ArrayList;
import java.util.HashMap;

public class TopKFrequentElementsinArray {

    public int[] topK(int[] arr, int k) {
        // Code here
        //ArrayList<Integer> al=new ArrayList<>();
        int []al=new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (mp.containsKey(num)) {
                mp.put(num, mp.get(num) + 1);
            } else {
                mp.put(num, 1);
            }
        }



        return al;


    }
}
