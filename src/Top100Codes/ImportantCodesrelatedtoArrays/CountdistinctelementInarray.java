package Top100Codes.ImportantCodesrelatedtoArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountdistinctelementInarray {
    static void count(int a[]) {
        int n=0;
        ArrayList<Integer>al=new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hs.put(a[i], hs.getOrDefault(a[i], 0) + 1);

        }
        for(Map.Entry<Integer,Integer>x: hs.entrySet()){
           al.add(x.getValue());
           n++;
           //count repeating
            if (x.getValue()>2){
                al.add(x.getKey());

            }
        }
        //
        System.out.println(n);

    }

    public static void main(String[] args) {
        int arr[] = new int[]{10, 30, 40, 20, 10, 20, 50, 10,10,10,10,10};
        int n = arr.length;
        count(arr);
    }
}
