package array1;

import java.util.Scanner;

public class smallestinthegivenarray {


    public static void main(String[] args)
    {
        int a[]={1,2,3,8,0};

        Scanner sc=new
                Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int b[]=new int[n];
        System.out.println("Enter the array element");
        for (int j = 0; j < n; j++) {
            b[j]= sc.nextInt();
        }

        int min=a[0];
        for (int i=1;i<b.length;i++)
        {
            if (b[i]<min)
            {
                min=b[i];
            }
        }
        System.out.println(min);
    }
}
