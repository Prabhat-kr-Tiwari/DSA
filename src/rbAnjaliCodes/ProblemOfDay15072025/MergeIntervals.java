package rbAnjaliCodes.ProblemOfDay15072025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].*/
public class MergeIntervals {


    public static int[][] merge(int[][] intervals) {

        List<int[]> res = new ArrayList<>();
        if (intervals == null || intervals.length == 0){
          return res.toArray(new int[0][]);
        }
        //sort in pair
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int start = intervals[0][0];
        int end = intervals[1][0];

        for(int[] i:intervals){
            System.out.println("start"+start+"end"+end);
            if (i[0]<end){
                System.out.println("i[0]"+i[0]);
                System.out.println("i[1]"+i[1]);
                end = Math.max(i[1],end);
            }else{
                System.out.println(Arrays.deepToString(res.toArray(new int[0][])));

                res.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
       int[][] intervals =new int[][]{{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}

