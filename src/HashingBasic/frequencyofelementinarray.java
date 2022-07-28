package HashingBasic;

import java.util.HashMap;

public class frequencyofelementinarray {
    static void frequency(int a[])
    {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for (int e:a
             ) {
            if (hashMap.containsKey(e))
            {
                hashMap.put(e, hashMap.get(e)+1);
            }
            else {
                hashMap.put(e,1);
            }


        }
        System.out.println(hashMap);
    }

    public static void main(String[] args) {
        int a[]={1,1,2,3,3,3,4,4,4};
        frequency(a);

    }
}
