package ArrayPractice;

public class MinimumSizeSubarraySum {

    static void minimum(int a[],int n,int target){


        int currsum=0;
        int maxsum=0;
        int start=0;
        int end=0;
        for (int i = 0; i < n; i++) {
            currsum+=a[i];
            if (currsum>target){
                currsum=0;
                start=i;

            }
            if (currsum==target){
                end=i;
                break;
            }

        }
        System.out.println(end-start);
        System.out.println(currsum);

    }

    public static int minSubArrayLen(int target, int[] a) {

        int currsum=0;
        int maxsum=0;
        int n=a.length;
        int start=0;
        int end=0;
        int count = 0;
        int ans = 10000;
        for (int i = 0; i < n; i++) {

            if ((currsum+=a[i])  <= target){
                System.out.println("first");
                System.out.println("currsum"+currsum);
                currsum+=a[i];
                count++;
            }
            if (currsum==target){
                System.out.println(count);
                if( count < ans){
                    ans = count;
                }
            }

        }

        System.out.println("second");
        for (int i = n - 1; i >= 0; i--) {

            if ((currsum+=a[i])  <= target){
                System.out.println("currsum"+currsum);

                currsum+=a[i];
                count++;
            }
            if (currsum==target){
                if( count < ans){
                    ans = count;
                }
            }

        }

        return ans;

    }

    static int min(int a[],int n,int target){
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        for (int ep = 0,sp=0; ep <a.length ; ep++) {
            sum+=a[ep];
            while (sum>=target){
                int len=ep-sp+1;
                if(len<minLength){
                    minLength=len;
                }
                sum=sum-a[sp];
                sp++;
            }

            
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
    public static void main(String[] args) {

       int  target = 11;
       int []nums = {1,2,3,4,5};

        System.out.println( min(  nums,nums.length,target));
    }
}
