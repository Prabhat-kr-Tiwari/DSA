package QuestionSheet;
import java.util.ArrayList;
import java.util.List;
class subsetleetcode {
    private static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {

        if(index>=nums.length)
        {
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
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        solve(nums, output, 0, ans);
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(subsets(a));
    }
}
//[[], [3], [2], [2, 3], [1], [1, 3], [1, 2], [1, 2, 3]]
//[[], [3], [3, 2], [3, 2, 3], [3, 2, 3, 1], [3, 2, 3, 1, 3], [3, 2, 3, 1, 3, 2], [3, 2, 3, 1, 3, 2, 3]]