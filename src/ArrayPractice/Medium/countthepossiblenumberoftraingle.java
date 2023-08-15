package ArrayPractice.Medium;

import java.util.Arrays;

public class countthepossiblenumberoftraingle {


    static int findNumberOfTriangles(int arr[], int n)
    {
        Arrays.sort(arr);
        int a,b=0;
        int count=0;
        for (int c = n-1; c >=2 ; c--) {
             a=0;
             b=c-1;
             while (a<b){
                 if (arr[a]+arr[b]>arr[c]){
                     count+=b-a;
                     b--;
                 }else {
                     a++;
                 }
             }


        }
        return count;

    }
    public static void main(String[] args) {
        int a[]={1,3,4,6,12,13,16,20};
        System.out.println(findNumberOfTriangles(a,a.length));

    }
}
