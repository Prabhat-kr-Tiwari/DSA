package ArrayPractice.Easy;

public class Elementwithleftsidesmallerandrightsidegreater {


    static void s(int a[]) {
        int n = a.length;


        for (int i = 1; i < n; i++) {
            int next = (i + 1) % n;
            int prev = (i + n - 1) % n;
            if (a[i] > a[prev] && a[next] < a[i]) {
                System.out.println(a[i]);
            }


        }


    }

    public static int findElement(int a[], int n) {
        for (int i = 0; i < n-1; i++) {
            int next = (i + 1) % n;
            int prev = (i - 1 + n) % n;
            if (a[i] > a[prev] && a[i] > a[next]) {
               // System.out.println(a[i]);
                return a[i];
            }


        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = {4, 2, 5, 4, 7};
        System.out.println(findElement(a, a.length));

    }
}
