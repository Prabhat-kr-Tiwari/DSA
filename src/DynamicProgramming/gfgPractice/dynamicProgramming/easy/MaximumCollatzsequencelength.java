package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class MaximumCollatzsequencelength {


    static int collatzLength(int N){
        // code here
        int max=0;
        for (int i = 1; i <=N ; i++) {
            int cur=helper(i);
            if (cur>max){
                max=cur;
            }


        }
        return max;

    }
   static int helper(int N){
        int count =1;
        if (N==1) return 1;
        while (N>1){
            if (N%2==0){
                N=N/2;
                count++;
            }else{
                N=3*N+1;
                count++;
            }
            System.out.println("N-->   "+N);
        }
        return count;

    }
    public static void main(String[] args) {

        System.out.println(collatzLength(20));
    }
}
