package array1;

import java.util.Arrays;

public class secondlargest {
    static int seconlar(int a[])
    {
        if (a.length<2) return -1;
        int largest=0;
        int secondlargest=-1;
        for (int i=1;i<a.length;i++)
        {
            if (a[i]>a[largest])
            {
                secondlargest=largest;
                largest=i;
            }
            else if(a[i]<a[largest])
            {
                if (secondlargest==-1||a[secondlargest]<a[i])
                {
                    secondlargest=i;
                }
            }
        }
        return secondlargest;
    }
    static int secondlargest(int a[])
    {

        Arrays.sort(a);
        int n=a.length;
        for (int i = 0; i <a.length-1 ; i++) {
            if(a[i]==a[i+1])
            {
                continue;
            }
            else {
                return a[n-2];
            }
        }
        return -1;

      /*  for (int e:a
             ) {
            if (e==)

        }*/


    }
    static int print2largest(int arr[], int n)
    {
        int largest=-1;
        int secondLargest=-1;
        for (int i = 0; i < n; i++) {
            if (arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];

            }else if(arr[i]>secondLargest&&arr[i]!=largest)
            {
                secondLargest=arr[i];

            }

        }
        //int secondlargest;
        if(secondLargest==-1)
        {
            return -1;
        }
        else {
            return secondLargest;
        }

    }


    public static void main(String[] args)
    {
        int a[]={212,32,3,22};
        //int a[]={5,5,5,5,5};

        //System.out.println(a[seconlar(a)]);

        //System.out.println(  secondlargest(a));
        /*int x=print2largest(a,a.length-1);
        System.out.println(a[x]);*/
        System.out.println(print2largest(a,a.length-1));

    }
}
