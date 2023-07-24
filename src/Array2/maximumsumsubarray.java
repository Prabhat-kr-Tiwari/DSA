package Array2;

public class maximumsumsubarray {
    static int maxsum(int a[])
    {
        int max=Integer.MIN_VALUE;
        int start=0;
        int end=0;

        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = i; j < a.length; j++) {
                sum+=a[j];
                if (sum>max)
                {
                    max=sum;
                    start=i;
                    end=j;
                    System.out.println(max);
                    System.out.println(start);
                    System.out.println(end);
                    System.out.println("----------------------");

                }
            }
        }
        return max;
    }
    static int largestmaximumsumsubarray(int a[])
    {
        //int end,start
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            currsum+=a[i];
            if (maxsum<currsum)
            {
                maxsum=currsum;
                //update end
            }
            if (currsum<0)
            {
                currsum=0;
                //update start
            }
        }
        return  maxsum;
    }


    public static int minSubArraySum(int[] nums) {
        int currentSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.min(nums[i], nums[i] + currentSum);
            minSum = Math.min(minSum, currentSum);
            System.out.println("Step - " + i +  "Curr " + currentSum + ", Min - " + minSum);
        }

        return minSum;
    }
    public static void main(String[] args) {
        int a[]= {3, -4, 2, -3, -1, 7, -5};
        System.out.println(minSubArraySum(a));
        // System.out.println(largestmaximumsumsubarray(a));
    }
}
