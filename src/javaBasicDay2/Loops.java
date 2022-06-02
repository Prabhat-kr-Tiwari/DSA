package javaBasicDay2;

import java.sql.SQLOutput;

public class Loops {
    public static void main(String[] args)
    {
        for(int i=0;i<7;i++)
        {
            System.out.println("Tiwariji"+i);

        }
        //for infinit loop
       /* for (int i=0; ;i++)
        {
            System.out.println("Tiwariji");
        }*/
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int index=1;
        while (index<=5){
            System.out.println("prabhat");
            //index++;
            index+=2;
        }
        int i = 0;
        do {
            System.out.println("hello");
            i++;
        }while (i<=2);

    }


}
