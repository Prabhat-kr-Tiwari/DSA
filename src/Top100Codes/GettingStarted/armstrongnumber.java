package Top100Codes.GettingStarted;

public class armstrongnumber {
    static void armstrong(int n){
        int t1=n;
        int len=0;
        while (t1!=0){
            len=len+1;
            t1=t1/10;

        }
        int t2=n;
        int arm=0;
        int rem=0;
        while (t2!=0){
            int mul=1;
            rem=t2%10;
            for (int i = 1; i <=len ; i++) {
                mul=mul*rem;


            }
            arm=mul+arm;
            t2=t2/10;
        }
        if (arm==n){
            System.out.println("armstrong");
        }else{
            System.out.println("not");
        }
    }
    //using recursion
    //find the length of digit
    static int length(int n){
        int len=0;
        while (n!=0){
            len=len+1;
            n=n/10;

        }
        return len;
    }
    static int isarmstrong(int n,int len){

        if (n==0)
            return 0;
        int digit=n%10;
        return (int) (Math.pow(digit,len)+isarmstrong(n/10,len));
    }
    static void armstrongingivenrange(int a,int b){
        for (int i = a; i <=b ; i++) {
            int res=isarmstrong(i,length(i));
            if (res==i){
                System.out.println(res);
            }

        }
    }



    public static void main(String[] args) {

        int n=371;
       // armstrong(n);
        int length=length(n);
        int res=isarmstrong(n,length);
        /*if (res==n){
            System.out.println("armstrong");
        }else{
            System.out.println("not");
        }*/
        armstrongingivenrange(10 ,1000);

    }
}
