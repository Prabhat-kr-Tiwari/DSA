package slidingWIndow.gfgPractice.slidingWIndowTag.easy.Smallestsubarraywithsumgreaterthanx;

public class Smallestsubarraywithsumgreaterthanx {


    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int i=0;
        int j=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while (j<arr.length){
            sum+=arr[j];
            
            if(sum<x){
                j++;
            } else if (sum==x) {
                j++;
            } else if (sum>x) {
                while (sum>x){
                    ans = Math.min(ans,j-i+1);
                    sum-=arr[i];
                    i++;
                }
                j++;
            }

        }
        return ans;
    }
    public static void main(String[] args) {

        int  x = 51, arr[] = {1, 4, 45, 6, 0, 19};

        System.out.println(smallestSubWithSum(x,arr));
    }
}
