package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class Computesumofdigitsinallnumbersfrom1ton {

    static int sumOfOneDigits(int n){
        int newN=n;
        int sum=0;
        while (newN>0){
            int last=newN%10;
            newN=newN/10;
            sum+=last;
        }
        return sum;
    }

    //233
    static int sumOfDigits(int N){

        int totalSum=0;
        for (int i = 0; i <=N ; i++) {
            totalSum+=sumOfOneDigits(i);
        }
        return totalSum;

    }
    public static void main(String[] args) {

        System.out.println(sumOfOneDigits(233));
        System.out.println(sumOfDigits(12));
    }
}
