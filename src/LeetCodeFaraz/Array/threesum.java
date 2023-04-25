package LeetCodeFaraz.Array;

import java.lang.reflect.Array;
import java.util.*;

public class threesum {
    public static List<List<Integer>> threeSum(int[] nums) {


        int i = 0;
        int j = 1;
        int k = 2;
        int sum = 0;
        int n = nums.length;
        final int sumzero = 0;
        ArrayList<Integer> al = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        while (i != j && i != k && j != k && i < n && j < n && k < n) {
            sum = 0;

            sum += nums[i] + nums[j] + nums[k];

            if (sum == sumzero) {
                al.add(nums[i]);
                al.add(nums[j]);
                al.add(nums[k]);
            }
            i += 3;
        }
        ans.add(al);
        while (i != j && i != k && j != k && i < n && j < n && k < n) {
            sum = 0;

            sum += nums[i] + nums[j] + nums[k];

            if (sum == sumzero) {
                al.add(nums[i]);
                al.add(nums[j]);
                al.add(nums[k]);
            }
            j++;
        }
        ans.add(al);
        while (i != j && i != k && j != k && i < n && j < n && k < n) {
            sum = 0;

            sum += nums[i] + nums[j] + nums[k];

            if (sum == sumzero) {
                al.add(nums[i]);
                al.add(nums[j]);
                al.add(nums[k]);
            }
            k++;
        }
        ans.add(al);


        return ans;


    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        //ArrayList<Integer>al=new ArrayList<>();
        int n = nums.length;
        //Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    sum = 0;
                    List<Integer> al = new ArrayList<>();

                    sum += nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        Collections.sort(al);
                        if (!ans.contains(al)) {
                            ans.add(al);

                        }
                        //ans.add(al);


                    }


                }

            }

        }


        return ans;

    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum1(nums));

    }


}
