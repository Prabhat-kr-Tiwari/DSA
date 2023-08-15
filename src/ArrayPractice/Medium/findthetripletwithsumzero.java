package ArrayPractice.Medium;

import java.util.Arrays;

public class findthetripletwithsumzero {


    static boolean  isfound(int a[]){
        Arrays.sort(a);
        int sum=0;
        int x=0,l=0,r=0;
        for (int i = 0; i <a.length -1; i++) {
            x=a[i];
            l=i+1;
            r=a.length-1;
            while (l<r){
                sum=a[x]+a[l]+a[r];
                if (sum==0){
                    return true;
                } else if (sum>0) {
                    r--;

                }else {
                    l++;
                }

            }


        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={0,-1,2,-3,1};
        System.out.println(isfound(a));

    }
}
