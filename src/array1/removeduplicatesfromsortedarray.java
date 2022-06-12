package array1;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class removeduplicatesfromsortedarray {
    /*static int removdupl(int[] a)
    {
        int j=1;
        int n=a.length;
        for (int i=0;i<n;i++) {
            if (a[i] != a[j]) {
                a[j ] = a[i];
                j++;
            }
        }
        return j;
    }*/
    public static void main(String[] args)
    {
        int a[]={1,1,3,3,4,4,5,5};
        /*int j=removdupl(a);
        for (int i=0;i<j;i++)
        {
            System.out.println(a[i]);
        }*/

        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        System.out.println(set);
    }
}
