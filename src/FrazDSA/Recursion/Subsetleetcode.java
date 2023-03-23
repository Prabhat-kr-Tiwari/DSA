package FrazDSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsetleetcode {
    static public void solve(List<Integer> output, List<List<Integer>> ans, int nums[], int index) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        //exclude
        solve(output, ans, nums, index+1);
        int element = nums[index];
        output.add(element);

        //include
        solve(output, ans, nums, index + 1);
        //back track
        output.remove(output.size() - 1);


    }


    static public List<List<Integer>> subsets(int[] nums) {
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        solve(output, ans, nums, 0);


        return ans;
    }


    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(subsets(nums));

    }
}
