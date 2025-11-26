package slidingWIndow.gfgPractice.slidingWIndowTag.easy.Maximumsumofsubarraylessthanorequaltox;

public class Maximumsumofsubarraylessthanorequaltox {


    static long findMaxSubarraySum(int[] arr, long x) {
        // Your code goes here
        int i=0;
        int j=0;
        int sum=0;
        int maxsum=0;
        int size=arr.length;
        while (j<size){
            sum+=arr[j];
            
            if(sum<x){
                j++;
                maxsum = Math.max(maxsum,sum);
            } else if (sum==x) {
                maxsum = Math.max(maxsum,sum);
                j++;
            } else if (sum>x) {
                while (sum>x){

                    sum-=arr[i];
                    i++;
                }
                if (sum <= x) {
                    maxsum = Math.max(maxsum, sum);
                }
                j++;

            }


        }
        return maxsum;
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int x = 11;
        int  arr1[] = {2, 4, 6, 8, 10};
                int x1 = 7;

        System.out.println(findMaxSubarraySum(arr1,x1));

    }
}
