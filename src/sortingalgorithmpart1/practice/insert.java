package sortingalgorithmpart1.practice;


import java.util.Arrays;

class insert {
    static void in(int a[]) {
      int  n=a.length;
        for (int i = 1; i < n; i++) {
            int j=i-1;
            int temp=a[i];
            for (; j >=0 ; j--) {
                if(temp<a[j]){
                    a[j+1]=a[j];
                }
                else {
                    break;
                }

            }
            a[j+1]=temp;

        }
    }

    public static void main(String[] args) {
        int a[] = {9, 5, 2, 6, 3};
        in(a);
        System.out.println(Arrays.toString(a));
        // System.out.println("Hello, World!");
    }
}
