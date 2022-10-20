package sortingalgorithmpart1.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class unionoftwosortedarray {

    static ArrayList Union(int a[],int b[])
    {
        ArrayList<Integer> al=new ArrayList<>();

        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);

        }
        for (int i = 0; i < b.length; i++) {
            hs.add(b[i]);

        }
        for (int x:hs
             ) {
            al.add(x);

        }
        Collections.sort(al);
        return al;
    }


    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={4,5,6};
        System.out.println(Union(a,b));
    }
}
