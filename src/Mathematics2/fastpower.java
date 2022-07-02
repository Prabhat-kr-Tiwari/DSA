package Mathematics2;

public class fastpower {
    static int fastpowerof(int a,int b)
    {
        if (b==0) return 1;
        int halfres=fastpowerof(a,b/2);
        int fullRes=halfres*halfres;
        //if b is odd
        if (b%2!=0) fullRes=fullRes*a;
        return fullRes;
    }

    public static void main(String[] args) {

        System.out.println(fastpowerof(3,5));
    }



}
