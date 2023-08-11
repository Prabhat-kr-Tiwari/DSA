package ArrayPractice;

public class MaximizeNumberof1s {


         static int findZeroes2(int a[], int n, int m) {
            int count_one = 0;
            int max_ones = 0;
            int start = 0;

            for (int end = 0; end < n; end++) {
                if (a[end] == 1) {
                    count_one++;
                } else if (m > 0) {
                    count_one++;
                    m--;
                } else {
                    // Reset the start position when m becomes 0
                    while (a[start] != 0) {
                        start++;
                        count_one--;
                    }
                    start++;
                }

                max_ones = Math.max(max_ones, count_one);
            }

            return max_ones;
        }

    // m is maximum of number zeroes allowed to flip
    static int findZeroes(int a[], int n, int m) {
        // code here
        int count_one = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            innerLoop:
            for (int j = 0; j < n; j++) {
                if (a[j] == 1) {
                    count_one++;


                }
                if (a[j] == 0 && m != 0) {
                    count_one++;
                    m--;
                }
                ans = Math.max(ans, count_one);
                if (m == 0 && a[j + 1] == 0) {
                    m = 2;
                    count_one = 0;
                    break innerLoop;

                }


            }


        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 11;
        int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int M = 2;
        System.out.println(findZeroes2(arr, N, M));


        /*Input:
N = 11
arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
M = 2
Output:
8
Explanation:
Maximum subarray is of size 8
which can be made subarray of all 1 after
flipping two zeros to 1.*/
    }
}
