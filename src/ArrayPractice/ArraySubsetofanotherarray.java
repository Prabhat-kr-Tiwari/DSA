package ArrayPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArraySubsetofanotherarray {
    public static boolean isSubset(long[] a1, long[] a2, long n, long m) {
        HashMap<Long, Long> hm = new HashMap<>();
        HashMap<Long, Long> hm2 = new HashMap<>();

        for (int i = 0; i < n; i++) {

            hm.put(a1[i], hm.getOrDefault(a1[i], 0L) + 1);
        }

        for (int i = 0; i < m; i++) {
            hm2.put(a1[i], hm.getOrDefault(a2[i], 0L) + 1);
        }
        System.out.println(hm);
        System.out.println(hm2);


        for (Long key : hm2.keySet()) {
            if (hm.containsKey(key)) {
                Long value1 = hm.get(key);
                Long value2 = hm2.get(key);


                if (value1 >=value2 ) {
                    return true;
                } else {
                    return false;
                }
            }
        }


        return false;
    }
    public static boolean isSubset2(long[] a1, long[] a2, long n, long m) {
        HashMap<Long, Long> hm = new HashMap<>();

        // Count the frequency of elements in the first array
        for (int i = 0; i < n; i++) {
            hm.put(a1[i], hm.getOrDefault(a1[i], 0L) + 1);
        }

        // Check if all elements in the second array are present in the first array
        for (int i = 0; i < m; i++) {
            if (!hm.containsKey(a2[i]) || hm.get(a2[i]) == 0) {
                return false;
            }
            hm.put(a2[i], hm.get(a2[i]) - 1);
        }

        return true;
    }


    public static void main(String[] args) {
        long a1[] = {589 ,5847, 595, 959, 258};
        long a2[] = {258, 25};

        System.out.println(isSubset2(a1, a2, a1.length, a2.length));
    }
}
