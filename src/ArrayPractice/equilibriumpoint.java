package ArrayPractice;

public class equilibriumpoint {
    static int equi(int a[]) {
        int n = a.length;
        int sum = 0;
        int leftsum = 0;
        for (int j : a) {
            sum += j;
        }
        for (int i = 0; i < n; i++) {
            sum -= a[i];
            if (sum == leftsum) {
                return i;
            }
            leftsum += a[i];

        }
        return -1;
    }

    static int equii(int a[]){
        int sum = 0,lefsum=0;
        for (int e:a
             ) {

            sum+=e;
        }
        for (int i = 0; i <a.length ; i++) {
            sum-=a[i];
            if (sum==lefsum){
                return i;
            }
            lefsum+=a[i];

        }
        return -1;
    }


    public static int equilibriumPoint(int[] a, int n) {

        // Your code here
        int leftsum = 0;
        int rightsum = 0;
        int ep = 0;
        while (ep < n) {

            for (int i = 0; i < ep; i++) {
                leftsum += a[i];

            }
            System.out.println("leftsum" + leftsum);
            for (int i = ep + 1; i < n; i++) {
                rightsum += a[i];

            }

            System.out.println("rightsum" + rightsum);
            if (leftsum==rightsum)
            {
                break;
            }
            if (leftsum != rightsum) {
                leftsum = 0;
                rightsum = 0;
            }

            ep++;

        }


        if (leftsum != rightsum) {
            return -1;
        }
        return ep+1;


    }


    public static void main(String[] args) {
        int a[] = {1, 3, 5, 2, 2};
        int []b={4, 42, 27 ,16 ,28 ,3 ,4, 5, 9, 3, 31, 5, 5, 29, 10, 18, 35, 35, 33, 19, 41, 23, 8 ,32, 9, 5, 8, 18, 35, 13, 6, 7, 6, 10, 11, 13, 37, 2, 25, 7, 28, 43};
        //System.out.println(equi(a));
        System.out.println(equii(a));

    }
}
