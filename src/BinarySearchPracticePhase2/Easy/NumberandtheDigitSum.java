package BinarySearchPracticePhase2.Easy;

public class NumberandtheDigitSum {

    /*Input:N = 13, K = 2
Output: 4
Explanation:
10, 11, 12 and 13 satisfy the given condition shown below,
10 - sumofdigit(10) = 9 >= 2
11 - sumofdigit(11) = 9 >= 2
12 - sumofdigit(12) = 9 >= 2
13 - sumofdigit(13) = 9 >= 2 */

    static long sumofdigit(long n){
        long sum=0;
        while (n!=0){
            long digit=n%10;
            sum+=digit;
            n=n/10;
        }
        return sum;
    }
    /*0.27*/
    public static long numberCount4 (long N, long K)
    {
        // your code here
        long count=0;
        for (int i = 0; i <=N ; i++) {
            System.out.println("i  :"+i+"sum of digit: "+sumofdigit(i));
            if ((i-sumofdigit(i)>=K)){
                System.out.println("True");
                count++;
            }

        }
        return count;

    }
   public static long numberCount (long N, long K)
   {
       // your code here
       long l=1;
       long ans=0;
       long r=N;
       long mid=0;
       while (l<=r){
            mid=(l+r)/2;
           System.out.println("Mid"+mid);
           System.out.println("l  "+l+"   r  "+r+"  mid  "+mid);
           if ((mid-sumofdigit(mid))>=K){
               ans=mid;
               if(mid - 1 < l){
                   break;
               }
               r=mid-1;
           } else{
               if(mid + 1 > r ){
                   break;
               }
               l=mid+1;
           }
       }
       return ans == 0 ? 0 : N - ans + 1;

   }


    public static long numberCount2(long N, long K) {
        long left = 1;
        long right = N;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sumOfDigits = sumofdigit(mid);

            if (mid - sumOfDigits >= K) {
                // If the condition is met, reduce the search range to the left half
                right = mid - 1;
            } else {
                // If the condition is not met, search in the right half
                left = mid + 1;
            }
        }
        System.out.println("left"+left+"right"+right+"mid"+N);

        // After the binary search, 'left' will be the first number that doesn't satisfy the condition.
        // Subtract 1 to get the count of numbers that do satisfy the condition.
        return N - left + 1;
    }




    public static void main(String[] args) {
        System.out.println(numberCount2(2,8));
        System.out.println(2 - 3 + 1);
    }

}
