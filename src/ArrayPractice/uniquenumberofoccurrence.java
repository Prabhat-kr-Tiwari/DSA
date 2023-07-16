package ArrayPractice;

import java.util.*;

public class uniquenumberofoccurrence {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }


        HashSet<Integer> hashSet = new HashSet<>();

        int count = 0;

        for (Map.Entry<Integer, Integer> x : hm.entrySet()) {

            hashSet.add(x.getValue());

            count++;


        }


        return (hashSet.size() == count);


    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 10, 1, 2, 10, 5, 10, 2};
        System.out.println(isFrequencyUnique(arr.length, arr));

    }
}
