package Day1;

import java.util.Scanner;

public class checkforleapyear {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();


        if (year%400==0)
        {
            if (year%4==0)
            {
                System.out.println("year is leap year");
            }
            else {
                System.out.println("year is not leap year");
            }
        }
        else {
            System.out.println("year is not leap year");
        }
    }
}
