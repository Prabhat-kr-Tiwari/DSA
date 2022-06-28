package Mathematics;

public class lcmoftwonumber {
    static int gcdusingeuclideanMoreModified(int a,int b)
    {


        if (a<b) return gcdusingeuclideanMoreModified(b,a);
        if (a%b==0) return b;

        return gcdusingeuclideanMoreModified(a%b,b);

    }

    public static void main(String[] args) {
        int a=24;
        int b=36;
        int hcf=gcdusingeuclideanMoreModified(a,b);
        int lcm=a*b/hcf;
        System.out.println(lcm);
    }
}
