package ArrayPractice.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class sumofarray {
    static ArrayList<Integer> findSum(int a[], int b[]) {
        // code here
        int n1 = a.length;
        int n2 = b.length;

        int remaining = 0;
        int carry = 0;

        ArrayList<Integer> ans = new ArrayList<>();
        int i = a.length - 1;
        int j=b.length-1;
        while (i >= 0||j>=0||carry>0) {

            int sum=0;
            if(i>=0){
                sum+=a[i--];
            }
            if(j>=0){
                sum+=b[j--];
            }


            if (carry != 0) {
                sum = sum + carry;

            }


            int digit = sum % 10;
            ans.add(digit);

            remaining = sum / 10;
            carry = remaining;


        }
        System.out.println();

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 9};
        int[] b = {9, 2, 3};
        System.out.println(findSum(a, b));

    }
}
