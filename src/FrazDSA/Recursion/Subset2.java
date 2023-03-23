package FrazDSA.Recursion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Subset2 {
    static private void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {

        if(index>=nums.length)
        {

            if (!ans.contains(output))
            {
                ans.add(new ArrayList<>(output));
            }
            return;
        }
        //exclude
        solve(nums, output, index + 1, ans);
        //include
        int element = nums[index];
        output.add(element);

        solve(nums, output, index + 1, ans);
        output.remove(output.size() - 1);
        while(index+1<nums.length-1  && nums[index]==nums[index+1])
        {
            index++;

        }

    }
    static public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        solve(nums, output, 0, ans);
        return ans;

    }

    public static void main(String[] args) {
        int a[]={1,1,2,2};
        Arrays.sort(a);
        System.out.println(subsetsWithDup(a));

    }
}
//ans.add(new ArrayList<>(output));
