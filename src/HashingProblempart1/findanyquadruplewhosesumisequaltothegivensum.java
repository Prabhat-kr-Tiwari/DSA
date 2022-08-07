package HashingProblempart1;

import kotlin.Pair;

import java.util.HashMap;
import java.util.Map;

public class findanyquadruplewhosesumisequaltothegivensum {



    static void fooursum(int a[],int x)
    {
        HashMap<Integer,Pair>hm=new HashMap<>();
        int n=a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                hm.put(a[i]+a[j],new Pair(i,j));

            }

        }
        for (Map.Entry<Integer,Pair> entry: hm.entrySet())
        {
            int firstsum= entry.getKey();
            Pair firstpair=entry.getValue();
            int secondsum=x-firstsum;

            if (hm.containsKey(secondsum))
            {
                Pair secondpair=hm.get(secondsum);
               /* if(firstpair.i!=secondpair.i&&firstpair.i!=secondpair.j&& firstpair.j!= secondpair.j&&
                firstpair.j!=secondpair.i)
                {
                    System.out.println(firstpair.i +" "+firstpair.j+" "+secondpair.i+" "+secondpair.j);
                    return;
                }*/
            }
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 4, 6, 8};
        int x = 19;
        fooursum(a,x);
    }

}
