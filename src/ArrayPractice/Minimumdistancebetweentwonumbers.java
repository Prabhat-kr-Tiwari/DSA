package ArrayPractice;

public class Minimumdistancebetweentwonumbers {


    static int minDist(int a[], int n, int x, int y) {
        // code here
        int dis = 0;
        int xi = 0;
        int yi = 0;
        int ans = Integer.MAX_VALUE;
        boolean isUpdatedx = false;
        boolean isUpdatedy = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                isUpdatedx = true;
                xi = i;
            }

            if (a[i] == y) {
                isUpdatedy = true;
                yi = i;
            }
            if (isUpdatedy || isUpdatedx) {
                dis = yi - xi;
                //System.out.println(dis);

                if (dis > 0) {
                    ans = Math.min(dis, ans);
                }

            }


        }
        if (!isUpdatedy||!isUpdatedx){
            return -1;
        }

        return ans;
    }
    static int mindist(int[] a, int n, int x, int y){
        int i=0;
        int j=n-1;
        int xi=0;
        int yi=0;
        int dis=0;
        boolean isUpdatedx = false;
        boolean isUpdatedy = false;
        int ans=Integer.MAX_VALUE;
        while (i!=n&&j!=0){
            if (a[i]==x){
                xi=i;
                isUpdatedy = true;
                i++;
            }
            if (a[j]==y){
                isUpdatedy = true;
                yi=j;
                j--;
            }
            dis=Math.abs(yi-xi);
            if (dis>0){
                ans=Math.min(dis,ans);
            }

        }
        if (!isUpdatedy||!isUpdatedx){
            return -1;
        }
        return ans;
    }
    static int mindist2(int[] a, int n, int x, int y) {
        int i = 0;
        int j = n - 1;
        int xi = -1; // Initialize to -1 to indicate not found
        int yi = -1; // Initialize to -1 to indicate not found
        int ans = Integer.MAX_VALUE;

        while (i < n && j >= 0) {
            if (a[i] == x) {
                xi = i;
            }
            if (a[j] == y) {
                yi = j;
            }

            if (xi != -1 && yi != -1) {
                ans = Math.min(ans, Math.abs(yi - xi));
            }

            i++;
            j--;
        }

        if (xi == -1 || yi == -1) {
            return -1;
        }

        return ans;
    }
    static int mindist3(int[] a, int n, int x, int y) {
        int minDistance = Integer.MAX_VALUE;
        int prev = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == x || a[i] == y) {
                if (prev != -1 && a[i] != a[prev]) {
                    minDistance = Math.min(minDistance, i - prev);
                }
                prev = i;
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        }

        return minDistance;
    }


    public static void main(String[] args) {

//       int N = 4;
//       int A[] = {1,2,3,2};
//        int x = 1, y = 2;
//       int n= 7;
//       int a[]={ 86 ,39, 90 ,67 ,84 ,66 ,62};
//         int x=42,y= 12;

//        int n = 27;
//        int a[] = {13, 98, 5, 10, 23, 13, 4, 53, 60, 78, 66, 68, 44, 69, 79, 71, 90, 17, 91, 84, 34, 52, 12, 11, 57, 61, 2};
//        int x = 78, y = 68;
        int[] a = {98, 78, 10, 12, 59, 37, 45, 18, 1, 56, 37, 14, 3, 32, 85, 10, 69, 89, 29, 93, 44, 16, 26, 13, 50, 75, 79, 21, 20, 33, 55, 17, 63, 64, 80, 21, 52, 24, 90, 52, 80, 26, 18, 34, 57, 2, 95, 25, 42, 23, 17, 85, 39, 94, 50, 40, 21, 28, 12, 40, 61, 67, 9, 23, 30, 88, 95, 34, 64, 85, 85, 95, 62, 54, 28, 19, 55, 22, 95, 49, 97, 64, 33};
        int x = 34;
        int y = 56;
        System.out.println(mindist3(a, a.length, x, y));


    }
}
