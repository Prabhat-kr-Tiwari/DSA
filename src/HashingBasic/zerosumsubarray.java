package HashingBasic;

import java.util.HashSet;
public class zerosumsubarray {
    static boolean zerosum(int a[])
    {
        HashSet<Integer>set=new HashSet<>();
        int cs=0;
        set.add(0);
        for (int e:a)
        {
            cs+=e;
            if(set.contains(cs)) return true;
            set.add(cs);


        }
        return false;
    }
    public static void main(String[] args) {

        int a[]={10,-10};
        System.out.println(zerosum(a));
    }
}
