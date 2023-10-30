package GreedyAlgorithm.Practice.Easy;

public class Largestnumberpossible {


    static int bs()
    {
        int l=100;
        int r=999;
        int sum=20;
        int ans=-1;
        while (l<=r)
        {
            int mid=(l+r)/2;
            int sumofmiddigit=sumOfDigit(mid);
            if (sum==sumofmiddigit)
            {
                ans=mid;
                l=mid+1;

            }
            else if (sumofmiddigit<sum)
            {
                l=mid+1;
            }
            else {
                r=mid-1;
            }

        }
        return ans;
    }
    static int bss() {
        int sum = 20;

        for (int num = 999; num >= 100; num--) {
            int sumOfDigits = sumOfDigit(num);
            if (sumOfDigits == sum) {
                return num;
            }
        }

        return -1; // If no number with the desired sum is found
    }

    static int smallestNDigit(int n){
        return  (int) Math.pow(10, (n - 1));
    }

    static int larg(int n){
        return (int) (Math.pow(10,n)-1);
    }
    static int sumOfDigit(int n){
        int sum=0;
        while (n!=0){
            int digit=n%10;
            sum+=digit;
            n=n/10;

        }
        return sum;
    }


    static String findLargest(int N, int S){
        // code here

        int lar=larg(N);
        int sum=sumOfDigit(lar);
//        System.out.println(sum);
        while (S<=sum){
            lar=lar-1;
            sum=sumOfDigit(lar);
            if (S==sum){
                return String.valueOf(lar);
            }


        }
        return String.valueOf(-1);


    }
    static String findLargest2(int N, int S){
        // code here

        int largestNdigit=larg(N);
        int smallestNdigit=smallestNDigit(N);

        for (int num = largestNdigit; num >= smallestNdigit; num--) {
            int sumOfDigits = sumOfDigit(num);
            if (sumOfDigits == S) {
                return String.valueOf(num);
            }
        }
        return String.valueOf(-1);

    }
    static int fi(int n,int s){
        int lar=larg(n);
        System.out.println(lar);
        int ans=-1;
        int sumofdigit=sumOfDigit(lar);
        int minus=sumofdigit-s;
        sumofdigit=sumOfDigit(lar-minus);
        if(sumofdigit==s){
             ans= lar-minus;
        }
        return ans;
    }
    static String OptimizefindLargest(int N, int S){
        // code here
//        int ans=0;

        StringBuilder ans= new StringBuilder();

//        System.out.println(9*N<S);

        if(N==1&&S==0){
            return String.valueOf(0);
        }
        if (9 * N < S || S == 0 || S > 9 * N) {
            return "-1"; // It's not possible to create a number with N digits that sums up to S
        }

        for(int i=0;i<N;i++){
            if(S>=9){
                ans.append("9");
                S-=9;
            }else{
                ans.append(S);
                S=0;
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {

//        System.out.println(findLargest2(3,20));
        System.out.println(OptimizefindLargest(1,0));
       /* int n= (int) Math.pow(10, (3 - 1));
        System.out.println(n);
        System.out.println(bss());*/
    }
}
