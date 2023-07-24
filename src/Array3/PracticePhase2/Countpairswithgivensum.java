package Array3.PracticePhase2;

public class Countpairswithgivensum {
    static void count(int a[],int k){
        int n=a.length;
        int sum=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[j]<k){
                    sum=a[j]+a[i];
                    if (sum==k){
                        count++;
                    }
                }

            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
       // Input:
        int N = 4, K = 6;
        int arr[] = {1, 5, 7, 1};
        count(arr,K);

    }
}
