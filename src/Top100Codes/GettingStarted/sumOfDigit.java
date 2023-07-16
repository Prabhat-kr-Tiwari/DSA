package Top100Codes.GettingStarted;

public class sumOfDigit {
    static int sum(int num){
        int ans=0;
        while (num!=0){
             ans+=num%10;
            num=num/10;

        }
        return ans;

    }
    static int getSumUsingRecursion(int num, int sum){


        if (num==0)
            return sum;
        sum+=num%10;
        return getSumUsingRecursion(num/10,sum);
    }


    public static void main(String[] args) {
        int n=123;
        System.out.println(sum(n));
        System.out.println(getSumUsingRecursion(n,0));

    }
}
