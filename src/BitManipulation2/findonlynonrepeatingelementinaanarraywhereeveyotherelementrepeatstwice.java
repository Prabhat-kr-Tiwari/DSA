package BitManipulation2;

import java.util.HashMap;
import java.util.Map;

public class findonlynonrepeatingelementinaanarraywhereeveyotherelementrepeatstwice {
    //using loops
    static int nonrepeatingelement(int a[])
    {
        int n=a.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0;  j<n ; j++) {
                if (i!=j&& a[i]==a[j])
                {
                    break;
                }

            }
            //if all array are checked
            if (j==n)
            {
                return a[i];
            }

        }
        return -1;
    }
    //using hashset
    static int nonrepeatingelementusinghashset(int a[])
    {
        Map<Integer,Integer>hm= new HashMap<>();
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
        int a[]={1,2,3,4,4,2,1};

        System.out.println(nonrepeatingelement(a));

    }
}
