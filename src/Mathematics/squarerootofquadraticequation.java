package Mathematics;

public class squarerootofquadraticequation {

    static void calculatesquareroot(double a,double b,double c)
    {
        double d=b*b-4.0*a*c;
        if (d>0.0)
        {
            double r1=(-b+Math.pow(d,0.5))/(2.0*a);
            double r2=(-b-Math.pow(d,0.5))/(2.0*a);
            System.out.println(r1);
            System.out.println(r2);

        }
        else if (d==0.0)
        {
            double r1=-b/(2.0*a);
            System.out.println(r1);
        }
        else
        {
            System.out.println("roots are not real");
        }
    }


    public static void main(String[] args) {
        calculatesquareroot(1,5,2);
    }
}
