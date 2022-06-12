package array1;

import java.util.Arrays;

public class checkarrayissortedornot {
    static boolean sort(int a[])
    {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]>a[i+1])
            return false;
        //return true;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int a[]={1,3,4,56};
        System.out.println(sort(a));

    }
}
