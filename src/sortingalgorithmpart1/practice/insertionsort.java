package sortingalgorithmpart1.practice;

public class insertionsort {

    static void insertion(int a[]) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int temp = a[i];
            for (; j >= 0; j--) {
                if (temp < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }


            }
            a[j + 1] = temp;

        }

    }

    static void insert(int a[]) {
        int n = a.length;
        for (int i = 1; i <n; i++) {
            int j=i-1;
            int temp=a[i];
            for (; j >=0; j--) {
                if(a[j]>temp){
                    a[j+1]=temp;
                }


            }
            a[j+1]=temp;

        }
    }

    public static void main(String[] args) {
        int a[] = {9, 5, 2, 6, 3, 1, 3};
        insertion(a);
        for (int e : a
        ) {
            System.out.println(e);

        }

    }
}
