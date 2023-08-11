package ArrayPractice;


public class MaxConfiguartion {

    static int max_sum(int arr[], int n) {
        int ans = 0, sum = 0, currSum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            currSum += arr[i] * i;
        }

        ans = currSum;

        for (int i = 1; i < n; i++) {
            int newSum = currSum - (sum - arr[i - 1]) + arr[i - 1] * (n - 1);
            currSum = newSum;
            ans = Math.max(ans, currSum);
        }

        return ans;
    }

    public static void main(String[] args) {
        int A[] = {82, 517, 517, 3, 232, 140, 797, 405, 339, 581, 219, 22, 971, 863, 813, 380, 978, 686, 537, 905, 177, 484, 208, 760, 858, 745};

        int a[]={8,3,1,2};
        System.out.println("Result: " + max_sum(a, a.length));
    }
}

