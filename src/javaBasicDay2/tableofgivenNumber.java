package javaBasicDay2;

import java.util.Scanner;

public class tableofgivenNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            int k=i*n;
            System.out.println(k);
        }
    }

}
