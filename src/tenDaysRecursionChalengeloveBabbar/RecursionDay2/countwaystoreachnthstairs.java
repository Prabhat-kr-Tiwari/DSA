package tenDaysRecursionChalengeloveBabbar.RecursionDay2;


//https://www.codingninjas.com/codestudio/problems/count-ways-to-reach-nth-stairs_798650?utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_10
import java.util.* ;
import java.io.*;
public class countwaystoreachnthstairs {
    public static int countDistinctWayToClimbStair(long nStairs) {
        // Write your code here.
        if(nStairs<0)
            return 0;
        if(nStairs==0)
            return 1;
        return (countDistinctWayToClimbStair(nStairs-1)+countDistinctWayToClimbStair(nStairs-2));
    }

    public static void main(String[] args) {
        System.out.println(countDistinctWayToClimbStair(5));
    }
}
