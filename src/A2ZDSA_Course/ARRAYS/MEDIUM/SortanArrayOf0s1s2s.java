package A2ZDSA_Course.ARRAYS.MEDIUM;

public class SortanArrayOf0s1s2s {

    static void sort(int a[], int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;


        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count0++;
            }
            if (a[i] == 1) {
                count1++;
            }
            if (a[i] == 2) {
                count2++;
            }


        }
        for (int i = 0; i < count0; i++) {
            a[i] = 0;

        }
        for (int i = count0; i < count0 + count1; i++) {
            a[i] = 1;

        }
        for (int i = count0 + count1; i < n; i++) {
            a[i] = 2;

        }
    }

    public static void main(String[] args) {
        int a[] = {0, 2, 1, 2, 0};
        sort(a, a.length);
        for (int e : a
        ) {
            System.out.println(e);

        }
    }

}
