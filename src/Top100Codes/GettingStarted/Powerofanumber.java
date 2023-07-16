package Top100Codes.GettingStarted;

public class Powerofanumber {

    //a*a*a
    static int pow(int a,int b){
        int res=1;
        for (int i = 1; i <=b ; i++) {
            res=res*a;

        }
        return res;
    }
    //recursion
    static int power(int a,int b){

        if (b!=0)
        {
            return a*pow(a,b-1);

        }else{
            return 1;
        }

    }


    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(power(2,3));

    }
}
