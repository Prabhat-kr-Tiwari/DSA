package ArrayPractice;

public class Findtripletswithzerosum {
    static boolean findTriplets(int a[] , int n)
    {
        //add code here.
        int sum=0;

        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {

                for (int k = j+1; k < n; k++) {
                    sum+=a[i]+a[j]+a[k];
                    System.out.println(i+ "i: "+a[i]);
                    System.out.println(j+ "j: "+a[j]);
                    System.out.println(k+  "k: "+a[k]);
                    System.out.println("sum"+sum);
                    System.out.println("==================");


                    if (sum==0)
                    {
                        return true;
                    }
                    if (sum!=0){
                        sum=0;
                    }

                }


            }

        }
        return false;

    }

    static boolean findTripletsOptimized(int a[] , int n)
    {
        //add code here.
        int sum=0;
        int k=0;
        int j=0;

        for (int i = 0; i < 3; i++) {

            j=i+1;
//            for (int j = i+1; j < n; j++) {
                k=j+1;

//                for (int k = j+1; k < n; k++) {
                    sum+=a[i]+a[j]+a[k];
                    System.out.println(i+ "i: "+a[i]);
                    System.out.println(j+ "j: "+a[j]);
                    System.out.println(k+  "k: "+a[k]);
                    System.out.println("sum"+sum);
                    System.out.println("==================");


                    if (sum==0)
                    {
                        return true;
                    }
                    if (sum!=0){
                        sum=0;
                    }

//                }


//            }

        }
        return false;

    }

    static boolean f(int a[],int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = j * n + i;
                // Your code here using i, j, and k
                sum+=a[i]+a[j]+a[k];
                sum+=a[i]+a[j]+a[k];
                System.out.println(i+ "i: "+a[i]);
                System.out.println(j+ "j: "+a[j]);
                System.out.println(k+  "k: "+a[k]);
                System.out.println("sum"+sum);
                System.out.println("==================");


                if (sum==0)
                {
                    return true;
                }
                if (sum!=0){
                    sum=0;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        /*Input: n = 5, arr[] = {0, -1, 2, -3, 1}
Output: 1
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.*/

        int arr[] = {0, -1, 2, -3, 1};
        System.out.println(findTripletsOptimized(arr, arr.length));

    }
}
