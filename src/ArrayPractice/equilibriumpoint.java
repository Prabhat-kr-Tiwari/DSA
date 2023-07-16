package ArrayPractice;

public class equilibriumpoint {
    static int equi(int a[]){
        int n=a.length;
        int sum=0;
        int leftsum=0;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
        }
        for (int i = 0; i <n ; i++) {
            sum-=a[i];
            if (sum==leftsum){
                return i;
            }
            leftsum+=a[i];

        }
        return -1;
    }


    public static void main(String[] args) {
        int a[]={1,3,5,2,2};
        System.out.println(equi(a));

    }
}
