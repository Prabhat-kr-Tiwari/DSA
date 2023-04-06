package Array4Matrix;

public class tripletSumInArray {


    public static boolean find3Numbers(int a[], int n, int sum) {

        // Your code Here

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k < n; k++) {

                    if (a[i]+a[j]+a[j]==sum){
                        return true;

                    }
                    
                }
                
            }
            
        }
        return false;


    }

    public static void main(String[] args) {
        int arr[] = {1 ,4 ,45 ,6 ,10 ,8};
        int sum=13;
        System.out.println(find3Numbers(arr, arr.length-1, sum));
    }
}
