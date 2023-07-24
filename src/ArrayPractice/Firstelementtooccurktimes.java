package ArrayPractice;

import java.util.HashMap;
import java.util.Map;

public class Firstelementtooccurktimes {


    public static int firstElementKTime(int[] a, int n, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            //hm.put(a[i],hm.getOrDefault(0)+1);
            if (hm.containsKey(a[i])) {
                //return a[i];
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }

        /*for(Map.Entry<Integer,Integer>x:hm.entrySet()){
            if()*/

        }
       // return -1;
        for(Map.Entry<Integer,Integer>x:hm.entrySet()){
            if (x.getValue()>=k){
                return x.getKey();
            }


        }
        return -1;



    }
    public int firstElementKTimen(int[] arr, int n, int k) {

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if (countMap.get(num) == k) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int N = 7, K = 2;
        int A[] = {1, 7, 4, 3, 4, 8, 7};
        System.out.println(firstElementKTime(A, N, K));

    }

}
