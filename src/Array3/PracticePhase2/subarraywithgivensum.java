package Array3.PracticePhase2;

import java.util.ArrayList;

public class subarraywithgivensum {
    static ArrayList<Integer> sum(int[] a, int givensum) {
        int n = a.length;

        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                al.add(a[j]);
                sum += a[j];
                if (sum > givensum) {
                    sum = 0;
                }
                if (sum == givensum) {

                    if(al.size() != 1){
                        System.out.println("found");
                        return al;
                    }

                }
                sum = 0;
                al.clear();
            }

        }
        return al;

    }

    public static void main(String[] args) {

        int N = 5, S = 5;
        int A[] = {1, 2, 3, 7, 5};
        System.out.println(sum(A, S));
    }
}
