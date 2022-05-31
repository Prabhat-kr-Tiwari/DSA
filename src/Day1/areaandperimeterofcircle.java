package Day1;

import java.util.Scanner;

public class areaandperimeterofcircle {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        double radius= sc.nextDouble();
        double area=3.14*radius*radius;
        double perimeter=2*3.14*radius;

        System.out.println(area);
        System.out.println(perimeter);


    }
}
