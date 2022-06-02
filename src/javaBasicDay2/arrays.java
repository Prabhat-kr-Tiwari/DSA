package javaBasicDay2;

import java.util.Scanner;

public class arrays {
    public static void main(String [] args)
    {
        int []ageList =new int[5];
       /* ageList[0]=2;
        ageList[1]=12;
        ageList[2]=22;
        ageList[3]=24;
        ageList[4]=25;*/
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            ageList[i]= sc.nextInt();
        }
        for (int i=0;i<5;i++)
        {
            System.out.println("age of roll no" +(i+1)+"is"+ageList[i]);
        }
        //for each loop
        for (int element:ageList)
        {
            System.out.println(element);
        }
        int [][]a={
                {1,2,3},
                {4,56,6}
        };

    }

}
