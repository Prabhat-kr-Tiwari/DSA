package Array3.PracticePhase2;

public class cyclicallyrotateanarraybyone {
    static void rotate(int a[]){
        int length=a.length;
        int b[]=new int[length];
        int temp=a[length-1];
        for (int i = 1; i <length; i++) {
            b[i]=a[i-1];
            /*A[] = {1, 2, 3, 4, 5}
                     0 1 2 3  4   5
            */

        }
         b[0]=temp;
        for (int e:b
        ) {
            System.out.println(e);

        }

    }
    static void r(int a[]){
         /*A[] = {1, 2, 3, 4, 5}
                     0 1 2 3  4   5

            */
        int length=a.length;
        int i=1;
        int temp=a[length-1];
        while (i<=length){
            a[i]=a[i-1];
            i++;length--;

        }
        a[0]=temp;

        for (int e:a
        ) {
            System.out.println(e);

        }


    }
    static void ro(int a[]){
        int length=a.length;
        int temp=a[length-1];
        for (int i = length-1; i >0 ; i--) {
            a[i]=a[i-1];

        }
        a[0]=temp;
        for (int e:a
        ) {
            System.out.println(e);

        }
    }





    public static void main(String[] args) {
        /*Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)*/
        int A[] = {1, 2, 3, 4, 5};
        ro(A);



    }
}
