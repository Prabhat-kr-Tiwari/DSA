package ArrayPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class largestsubarraywithzerosum {
    static int Largestsubarraywithzerosum(int a[]){
        int sum=0;
        int n=a.length;
        int start=0;
        int end=-1;
        int maxlength=0;

        HashMap<Integer,Integer>hm=new HashMap<>();
        int length=0;

        for (int i = 0; i < n; i++) {
            sum+=a[i];
            if (sum==0)
            {
               /*start=0;
               end=i;
               length=end-start+1;
                maxlength=Math.max(length,maxlength);*/
                maxlength=i+1;

            } else if (hm.containsKey(sum)) {

                /*start=hm.get(sum)+1;
                end=i;
                length=end-start+1;
                maxlength=Math.max(length,maxlength);*/
                int k=hm.get(sum);
                 length = i -k;
                maxlength = Math.max(length, maxlength);


            }else {
                hm.put(sum,i);
            }


        }
        return maxlength;
    }

    public static void main(String[] args) {
        int a[]={15,-2,2,-8,1,7,10,23};
        System.out.println(Largestsubarraywithzerosum(a));

    }
}
