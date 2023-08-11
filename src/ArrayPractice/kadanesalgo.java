package ArrayPractice;

public class kadanesalgo {

    //brute force

    static void kadane(int a[],int n){

        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = 0; j <n ; j++) {

                sum+=a[j];
                if (sum<0){
                    sum=0;
                }
                if (sum>maxsum){
                    maxsum=sum;
                }



            }

        }
        System.out.println(maxsum);
    }

    //optimised

    //kadane algoo
    static void kad(int a[],int n){

        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for (int i = 0; i < n; i++) {
            currsum+=a[i];
            if (currsum>maxsum){
                maxsum=currsum;
            }
            if (currsum<0){
                currsum=0;
            }
        }
        System.out.println(maxsum);
    }


    public static void main(String[] args) {

       // int a[]={-5,4,6,-3,4,-1};
        int a[]={6,-7,4,-2,1,5,-4};
        kad(a,a.length);

    }
}
