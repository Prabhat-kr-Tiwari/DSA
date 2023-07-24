package Top100Codes.ImportantCodesrelatedtoArrays;

import java.util.Arrays;
import java.util.HashMap;

public class frequencyofelements {

    //using for loop
    static void countfrequency(int a[],int n){
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        int count=0;
        for (int i = 0; i < n; i++) {
            if (visited[i]){
                continue;
            }
             count=1;
            for (int j = i+1; j <n ; j++) {
                if (a[i]==a[j])
                {
                    count++;
                    visited[j]=true;
                }

            }
            System.out.println(a[i]+"  "+count);


        }

    }
    static void frequency(int a[],int n){
        HashMap<Integer,Integer>hs=new HashMap<>();
        for (int i = 0; i < n; i++) {
            hs.put(a[i],hs.getOrDefault(a[i],0)+1);

        }
        System.out.println(hs);
    }

    public static void main(String[] args) {
        int a[]={1,2,3,1,1,3,1,3,5,3,2,4,3};
        countfrequency(a,a.length);
    }
}
