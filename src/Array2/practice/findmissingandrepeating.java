package Array2.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findmissingandrepeating {




   static int[] findTwoElement(int arr[], int n) {
        // code hereascsd,cc
        Arrays.sort(arr);
        int[] res = new int[5];
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) >= 2) {
                res[0] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) i++;
            if (hm.containsKey(Math.abs(arr[i] - 1))) {
                continue;

            } else {
                res[1] = Math.abs(arr[i] - 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a[]={2,2};
        /*Arrays.sort(a);
        for (int x:a
             ) {
            System.out.print(x+" ");

        }*/
        findTwoElement(a,a.length);
        for (int x:a
             ) {
            System.out.print(x+" ");

        }

    }
}
