package LeetCodeFaraz.Array.Easy;

public class RunningSumOf1dArray {

    static int sum(int a[],int n){
        int result=0;

        for (int i = 0; i < n; i++) {
            result+=a[i];

        }
        return result;
    }
    static void rainingSum(int a[]){

        int n=a.length;
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=a[i];
            a[i]=sum;

        }
        for (int e:a
             ) {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        rainingSum(a);

    }
}
