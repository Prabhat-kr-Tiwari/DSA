package Day1;

import java.util.Scanner;

public class graetestofthreenumber {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a");
            }
            else {
                System.out.println("c");
            }
        }
        else {
            if (b>c)
            {
                System.out.println("b");
            }
            else {
                System.out.println("c");
            }
        }

    }
}
