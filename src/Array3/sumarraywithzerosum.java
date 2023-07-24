package Array3;

import java.util.HashSet;
import java.util.Set;

public class sumarraywithzerosum {

    static boolean subarraywithzerosum(int a[])
    {
        int n=a.length;
        /*int prefixsum[]=new int[n];
        prefixsum[0]=a[0];*/

        Set<Integer> set=new HashSet<>();
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
            if (set.contains(sum)){
                return true;
            }else if(sum==0) {
                return true;

            }else{
                set.add(sum);

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[]={2,3,1,-4,4,-2};
        System.out.println(subarraywithzerosum(a));
    }
}
