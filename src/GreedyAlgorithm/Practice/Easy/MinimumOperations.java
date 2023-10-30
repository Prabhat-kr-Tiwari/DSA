package GreedyAlgorithm.Practice.Easy;

public class MinimumOperations {


//    Double the number
    static int count=0;
    static int cursum=0;

    static int doubleNumber(int n) {
        count++;
        return n * 2;

    }
//    Add one to the number

    static int addOne(int n) {
        count++;

        return n + 1;
    }


    public static int minOperation(int n) {
        //code here.

        cursum=addOne(cursum);
        System.out.println(cursum);
        while (cursum<=n){
            System.out.println("cursum;  "+cursum);
            cursum=addOne(cursum);
            if (cursum==n){
                return count;
            }
            cursum=doubleNumber(cursum);
            if (cursum==n){
                return count;
            }

        }
        return 0;

    }

    public static void main(String[] args) {

        /*Input:
N = 8
Output: 4
Explanation:
0 + 1 = 1 --> 1 + 1 = 2 --> 2 * 2 = 4 --> 4 * 2 = 8.*/
        int n=8;
        System.out.println(minOperation(n));



    }
}
