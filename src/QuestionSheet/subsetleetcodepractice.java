package QuestionSheet;

import java.util.ArrayList;
import java.util.List;

public class subsetleetcodepractice {
    static void solve(int nums[], List<Integer> output, int index, List<List<Integer>> ans) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }
        //exclude
        solve(nums, output, index + 1, ans);
        //include
        int element = nums[index];
        output.add(element);
        solve(nums, output, index + 1, ans);
        output.remove(output.size() - 1);
    }
    static List<List<Integer>> subset(int nums[]) {

        List<List<Integer>> ans = new ArrayList<>();
        ;
        List<Integer> output = new ArrayList<>();
        solve(nums, output, 0, ans);
        return ans;

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        System.out.println(subset(a));
    }
}
