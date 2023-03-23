package tenDaysRecursionChalengeloveBabbar.RecursionDay4.Practice;

/*

Given and integer N.Calculate the sum of series 13 + 23 + 33 + 43 + … till N-th term.

Example 1:

Input:
N=5
Output:
225
Explanation:
13+23+33+43+53=225
Example 2:

Input:
N=7
Output:
784
Explanation:
13+23+33+43+53+63+73=784
*/
public class sumoffirstnterms {

    static int sum(int n)
    {
        if(n==0)
            return 0;
        int sum=0;
        while (n!=0)
        {
              sum+=(int)Math.pow(n--,3);
        }
        return sum;

    }

    public static void main(String[] args) {

        System.out.println(sum(5));
    }

}
