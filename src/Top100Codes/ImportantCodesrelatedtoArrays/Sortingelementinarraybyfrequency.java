package Top100Codes.ImportantCodesrelatedtoArrays;

import java.util.*;

public class Sortingelementinarraybyfrequency {
    static Integer[] a = {10, 20, 10, 10, 20, 30, 30, 30, 30, 0};
    static void sort(List<Integer> list){
        /*Input :arr[6]=[30, 20, 30, 10, 20, 20]
Output: 20 20 20 30 30 10*/

        HashMap<Integer,Integer>mapCount=new HashMap<>();
        HashMap<Integer,Integer>mapIndex=new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            if (mapCount.containsKey(a[i])){
                mapCount.put(a[i],mapCount.get(a[i])+1);
            }else{
                mapCount.put(a[i],1);
                mapIndex.put(a[i],i);
            }

        }
        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer n1, Integer n2) {
                int freq1 = mapCount.get(n1);
                int freq2 = mapCount.get(n2);
                if (freq1 != freq2) {
                    return freq2 - freq1;
                }
                else {
                    return mapIndex.get(n1) - mapIndex.get(n2);
                }
            }
        });
        System.out.println(list);
    }



    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(a);
        sort(list);

    }
}
