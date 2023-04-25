package LeetCodeFaraz.Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class PairsofSongsWithTotalDurationsDivisibleby60 {


    public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                int sum = time[i] + time[j];
                if (sum % 60 == 0) {
                    count++;
                }
            }

        }
        return count;

    }
    public static int PairsDivisibleBy60(int[] time) {
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int t : time) {
            int r = t % 60;
            int complement = (60 - r) % 60;

            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }

            freq.put(r, freq.getOrDefault(r, 0) + 1);
        }

        return count;
    }


    public static void main(String[] args) {
        int[] time = {30,20,150,100,40};
        System.out.println(PairsDivisibleBy60(time));

    }
}
