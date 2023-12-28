package AskedByAsif;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {


    public static int[] Twosum(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);

        }
        return result;

    }


    public static void main(String[] args) {
        int a[] = {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(Twosum(a, target)));

    }
}
