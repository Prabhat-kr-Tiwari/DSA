package PrepInsta.Top100Codes.ImportantCodesrelatedtoArrays;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfArray {

    static void frequency(int a[]){

        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i = 0; i < a.length-1; i++) {
            if (hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }else{
                hm.put(a[i],1);
            }

        }

        for (Map.Entry<Integer,Integer>entry: hm.entrySet()){
            System.out.println("Key"+entry.getKey() +"Value"+entry.getValue());
        }
    }


    public static void main(String[] args) {
        int a[]={1,2,3,1,1,23,3,4,4};
        frequency(a);

    }
}
