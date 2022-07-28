package HashingBasic;

import java.util.HashMap;
import java.util.HashSet;

public class countpairswithgivensum {
    static boolean countPairs(int a[],int k)
    {
        HashSet<Integer>set=new HashSet<>();
        for (int e:a
             ) {
            int comp=k-e;
            if (set.contains(comp))
            {
                return true;
            }
            else {
                set.add(e);
            }

        }
        return false;
    }

    static int countpairs(int arr[],int k)
    {
        int counter = 0;
        int n=arr.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            if(arr[i]<k){
                int element = k - arr[i];
                if(m.containsKey(element)){
                    counter += m.get(element);
                }
                if(m.get(arr[i]) == null){
                    m.put(arr[i],0);
                }
                m.put(arr[i],m.get(arr[i])+1);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int a[]={1, 1, 1, 1};
        System.out.println(countpairs(a,2));
        System.out.println(countPairs(a,2));
    }
}
