package Array4Matrix.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        int[] ar = {1, 2, 3, 4, 5};
        for(int i : ar){
            arr.add(i);
        }
        reverseInGroups(arr, arr.size(), 3);
        System.out.println(arr);


    }

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k){
        for(int i=0; i<n; i+=k){

            int leftSide=i;
            int side = Math.min(i+k-1, n-1);

            while(leftSide<side){
                Collections.swap(arr, leftSide, side);
                leftSide++;
                side--;
            }
        }
    }
}
