/*
package PrepInsta.Top100Codes.ImportantCodesrelatedtoArrays;

import java.util.*;

public class Sortingelementsofanarraybyfrequency {

    //in descending order
    //20 20 20 30 30 10
    static void sort(int a[]){

        ArrayList<Integer>al=new ArrayList<>();
        HashMap<Integer,Integer>hmcount=new HashMap<>();
        HashMap<Integer,Integer>hmIndex=new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            if (hmcount.containsKey(a[i])){
                hmcount.put(a[i], hmcount.get(a[i])+1);
            }else{
                hmcount.put(a[i],1);
                hmIndex.put(a[i],1);

            }

        }
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer n1, Integer n2)
            {
                int freq1 = hmcount.get(n1);
                int freq2 = hmcount.get(n2);
                if (freq1 != freq2) {
                    return freq2 - freq1;
                }
                else {
                    return hmIndex.get(n1) - hmIndex.get(n2);
                }
            }
        });
        System.out.println(list);


    }

    public static void main(String[] args) {

        int a[]={30, 20, 30, 10, 20, 20};
        sort(a);

    }
}
*/
