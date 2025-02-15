package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class Youandyourbooks {

    static long max_Books(int arr[], int n, int k) {
        boolean flag=false;
        long maxsum=0;
        long currsum=0;
        // Your code here
        for (int i = 0; i < n; i++) {
            if (arr[i]<=k) {
                 currsum+=arr[i];
            }else {
                currsum=0;
            }
            if (maxsum<currsum){
                maxsum=currsum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {

        int n=8,k= 1;
        int a[]={3, 2, 2, 3, 1, 1, 1, 3};

       int nn= 8,kk= 2;
//        3 2 2 3 1 1 1 3
        System.out.println(max_Books(a,nn,kk));
    }
}
