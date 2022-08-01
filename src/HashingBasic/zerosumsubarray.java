package HashingBasic;

import java.util.HashMap;
import java.util.HashSet;
public class zerosumsubarray {
    static boolean zerosum(int a[])
    {
        HashSet<Integer>set=new HashSet<>();
        int cs=0;
        set.add(0);
        for (int e:a)
        {
            cs+=e;
            if(set.contains(cs)) return true;
            set.add(cs);


        }
        return false;
    }
    static long zeroSumSubArray(long[] arr, long n ){
        long sum = 0;
        long count = 0;

        HashMap<Long, Long> map = new HashMap<>();
        for (int i =0; i<n; i++){
            sum += arr[i];
            if (sum ==0){
                count++;
            }
            if (map.containsKey(sum)){
                count += map.get(sum);
            }
            if (map.containsKey(sum)){
                long k = map.get(sum);
                k++;
                map.put(sum,k);
            }
            else map.put(sum,1L);
        }
        return count;
    }
    public static void main(String[] args) {

       /* long a[]={10L,-110L};
        int b[]={10,-10};
        System.out.println(a.length);
        System.out.println(zerosum(b));
        System.out.println(zeroSumSubArray(a,2));*/

        long [] arr ={6,3,-1,-3,4,-2,2,4,6,-12,-7};
        long n=arr.length;
//        System.out.println(zeroSumSubArray());
        zeroSumSubArray(arr,n);
    }
}
