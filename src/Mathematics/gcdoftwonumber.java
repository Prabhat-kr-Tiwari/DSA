package Mathematics;

public class gcdoftwonumber {
    static int gcdusingeuclideanMoreModified(int a,int b)
    {
        System.out.println(a+" "+b);

        if (a<b) return gcdusingeuclideanMoreModified(b,a);
        if (a%b==0) return b;
        //return gcdusingeuclidean(a-b,b);
        return gcdusingeuclideanMoreModified(a%b,b);

    }
    static int gcdusingeuclidean(int a,int b)
    {
        System.out.println(a+" "+b);
        if (a==b) return a;
        if (a<b) return gcdusingeuclidean(b,a);
        if (b==0) return a;
        //return gcdusingeuclidean(a-b,b);
        return gcdusingeuclidean(a%b,b);

    }
    static int gcd(int n,int m)
    {
        System.out.println(n+" "+m);
        for (int i = Math.min(n,m); i >1 ; i--) {
            if (n%i==0&&m%i==0)
            {
                return i;
            }

        }
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(gcd(60,24));
        System.out.println("using gcd euclidean");
        System.out.println(gcdusingeuclidean(60,24));
        System.out.println("more modified");
        System.out.println(gcdusingeuclideanMoreModified(12,24));

    }
}
