package ArrayPractice;


/*Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected
        to the constraint of A[i] < A[j] and i < j.*/
public class MaximumIndex {

    static int maxIndexDiff(int a[], int N) {

        // Your code here
        int curr=0;
        int ans=0;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if(a[j]>a[i])
                {
                    curr=j-i;
                }
                if(curr>ans)
                {
                    ans=curr;
                }

            }

        }
        return ans;

    }
//    static int maxIndexDiff(int a[], int N) {
//
//    }

    static void rev(String  s){
        int i=0;
        char [] c=s.toCharArray();
        int j=s.length()-1;
        String temp="";
        while (i<j){
            temp= String.valueOf(c[i++]);




        }
        System.out.println(c);
    }




    public static void main(String[] args) {

       int  N = 2;
        int A[] = {1, 10};
        System.out.println(maxIndexDiff(A,N));
        rev("welcome to home");

    }
}
