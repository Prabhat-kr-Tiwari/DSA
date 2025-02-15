package DynamicProgramming.gfgPractice;

public class HouseRobber {



    static int maximizeMoney(int N , int K) {
        // code here

        if(N==0){
            return K;
        }

        int result=(N+1)/2;
        return result*K;
    }
    public static void main(String[] args) {

        System.out.println(maximizeMoney(2,12));
    }
}
