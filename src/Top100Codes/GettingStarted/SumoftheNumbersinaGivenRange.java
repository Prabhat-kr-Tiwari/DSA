package Top100Codes.GettingStarted;

public class SumoftheNumbersinaGivenRange {

    //brute force
    static void sum2(int num1,int num2){
        int sum=0;
        for(int i=num1;i<=num2;num1++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }


    //n*(n+1)/2
    static int sum(int num1,int num2){

     /*   int sum1=a*(a+1)/2;
        int sum2=b*(b+1)/2;*/
        return num2*(num2+1)/2 - num1*(num1+1)/2 + num1;


    }
    //recursion
   // i==a
    static int getsum2(int sum,int num1,int num2){
        if (num1>num2)
            return sum;
        return num1+getsum2(sum,num1+1,num2);

    }


    public static void main(String[] args) {
        System.out.println(sum(2,5));
        System.out.println(getsum2(0,2,5));
    }

}
