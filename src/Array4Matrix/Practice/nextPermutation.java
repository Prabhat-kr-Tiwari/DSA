package Array4Matrix.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nextPermutation {


    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void reverse(int a[],int i,int j){
        while(i<j){
            swap(a,i++,j--);
        }
    }


    static ArrayList<Integer> nextPer(int a[]){
        ArrayList<Integer>ans=new ArrayList<>();
        int i=a.length-2;
        while (i>=0&&a[i]>=a[i+1]){
            i--;
        }
        if (i>=0){
            int j=a.length-1;
            while(a[j]<=a[i]){
                j--;
            }
            swap(a,i,j);
        }
        reverse(a,i+1,a.length-1);
        for (int e:a
             ) {
            ans.add(e);

        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={1,3,5,4,2};
        System.out.println(nextPer(a));
    }

}
