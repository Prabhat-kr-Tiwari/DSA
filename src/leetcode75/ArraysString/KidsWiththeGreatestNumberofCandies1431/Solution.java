package leetcode75.ArraysString.KidsWiththeGreatestNumberofCandies1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max =0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        for (int i = 0; i <candies.length ; i++) {
            ans.add((candies[i]+extraCandies)>=max);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
//        Output: [true,true,true,false,true]
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
