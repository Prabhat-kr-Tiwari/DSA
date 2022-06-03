package javaBasicDay2;

import java.util.Arrays;

public class maxandminofarray {
    static int getmin(int arr[],int n)
    {
        int res=arr[0];
        for (int i=1;i<n;i++)
        {
            res=Math.min(res,arr[i]);
        }
        return res;

    }
    static int getmax(int arr[],int n)
    {
        int res=arr[0];
        for (int i=1;i<n;i++)
        {
            res=Math.max(res,arr[i]);
        }
        return res;
    }

    public static void main(String []args)
    {
        int array[]={122,4,155,12};
        int n=array.length;
        System.out.println(getmax(array,n));
        System.out.println(getmin(array,n));



        //System.out.println(max);
        System.out.println("Second logic");
       Arrays.sort(array);
        int min=array[0];
        int max=array[array.length-1];
        System.out.println("minimum element is"+min);
        System.out.println("max element is "+max);
        System.out.println("Third logic");
        int max1=array[0];
        int min1=array[0];
        for (int k=1;k<n;k++)
        {
            if (max1>array[k])
            {
                return;


            }
            else {
                max1=array[k];
            }
        }
        System.out.println("max"+max1);

       // {122,4,155,12};
        for (int m=1;m<n;m++)
        {
            if (array[m]<min1)
            {
                min1=array[m];
            }
        }
        System.out.println("min"+min1);
    }
}
