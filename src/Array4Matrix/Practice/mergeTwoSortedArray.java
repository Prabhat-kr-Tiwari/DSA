package Array4Matrix.Practice;

import java.util.Arrays;

public class mergeTwoSortedArray {

    static void merge(int a1[],int n,int a2[],int m,int a3[])
    {
        int len=m+n;
        int i=0;
        int j=0;
        int k=0;
        while (i<n&&j<m){
            if (a1[i]<a2[j])
            {
                a3[k]=a1[i];
                i++;
                k++;
            }else{
                a3[k]=a2[j];
                j++;
                k++;
            }
        }
        while(i<n)
        {
            a3[k]=a1[i];
            i++;
            k++;
        }
        while (j<m)
        {
            a3[k]=a2[j];
            j++;
            k++;
        }
        //System.arraycopy(a3, 0, a1, 0, a3.length);
        for (int e:a3
             ) {
            System.out.println(e);

        }

    }

    public static void main(String[] args) {
        //int[] a1 =new int[8];
         int a1[]= {1, 2, 5, 7, 9};
        int a2[]={2,4,6};
        int len1=a1.length;
        int len2= a2.length;
        int len=Math.max(len1,len2);
        int a3[]=new int[len1+len2];
        merge(a1,a1.length,a2,a2.length,a3);
    }

}
