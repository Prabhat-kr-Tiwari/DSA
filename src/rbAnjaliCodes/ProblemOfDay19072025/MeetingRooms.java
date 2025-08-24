package rbAnjaliCodes.ProblemOfDay19072025;

import java.util.Arrays;

public class MeetingRooms {

    static boolean isOverlap(int[] meet1, int[] meet2) {
        return (meet1[0] >= meet2[0] && meet1[0] < meet2[1]) ||
                (meet2[0] >= meet1[0] && meet2[0] < meet1[1]);
    }
    static class Pair implements Comparable<Pair>{
        int s, e, i;

        public Pair(int s, int e, int i) {
            this.e = e;
            this.s = s;
            this.i = i;
        }
        @Override
        public int compareTo(Pair that) {
            return this.e- that.e;
        }
    }
    static boolean canAttend(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                // If any two meetings overlap, then a person
                // cannot attend all the meetings
                if (isOverlap(arr[i], arr[j])) {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean canAttend1(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.println(arr[i][1]);
            System.out.println(arr[i+1][0]);
            if (arr[i][1]>arr[i+1][0]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {10, 15}, {7, 10}};
        int arr1[][] = {{2, 4}, {9, 12}, {6, 10}};

        System.out.println(canAttend1(arr));

    }
}
