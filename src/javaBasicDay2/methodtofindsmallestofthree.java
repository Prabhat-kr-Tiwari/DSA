package javaBasicDay2;

public class methodtofindsmallestofthree {

    static int max(int a,int b,int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                return a;
            }
            else {
                return c;
            }
        }
        else {
            if (b>c)
            {
                return b;
            }
            else {
                return c;
            }
        }
    }
    public static void main(String [] args)
    {
        System.out.println(max(3,4,5));
    }
}
