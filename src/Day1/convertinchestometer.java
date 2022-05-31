package Day1;

import java.util.Scanner;

public class convertinchestometer {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        double inches= sc.nextDouble();
        double meter=inches*0.0254;


        System.out.println(meter);
    }
}
