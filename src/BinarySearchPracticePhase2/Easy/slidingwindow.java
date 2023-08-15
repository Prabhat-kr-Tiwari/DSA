package BinarySearchPracticePhase2.Easy;

public class slidingwindow {


    static void slidingwindow(int a[],int k){
        int n=a.length;
        for (int i = 0; i <n - (k - 1) ; i++) {
            for (int j = i; j <k+i ; j++) {
                System.out.println(a[j]);

            }
            System.out.println("-------------------");

        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        slidingwindow(a,4);
    }
}
