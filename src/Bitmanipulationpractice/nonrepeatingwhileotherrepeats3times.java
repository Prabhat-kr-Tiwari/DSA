package Bitmanipulationpractice;

import java.util.HashMap;
import java.util.Map;

public class nonrepeatingwhileotherrepeats3times {


    static int nonrepeatingelementusinghashset(int a[])
    {
        Map<Integer,Integer> hm= new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hm.containsKey(a[i]))
            {
                hm.put(a[i],hm.get(a[i])+1);
            }
            else {
                hm.put(a[i],1);
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (hm.get(a[i])==1)
                return a[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={1,1,1,2,2,2,3,4,4,4,5,6,5,6,5,6};
        System.out.println(nonrepeatingelementusinghashset(a));
    }
}
