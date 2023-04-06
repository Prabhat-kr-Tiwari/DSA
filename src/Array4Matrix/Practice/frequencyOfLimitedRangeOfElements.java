package Array4Matrix.Practice;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfLimitedRangeOfElements {


    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        int k=1;
        int count=0;
        int j=0;

        for(int i=0;i<P;i++)
        {
            while(i<P)
            {
                if(arr[i]==k)
                {
                    count++;

                }

            }
            arr[j]=count;
            j++;
            count=0;

        }
        for (int e:arr
             ) {
            System.out.println(e);

        }

    }
    public static void FrequencyCount(int arr[], int N, int P){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < P; i++)
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);


        for (int i = 0; i < P; i++) {

            if (i==map.get(i))
            {
                //arr[i]=map.values()
            }

        }


    }



    public static void main(String[] args) {
        int a[]={2, 3, 2, 3, 5};
        int P = 5;
        FrequencyCount(a,a.length-1,P);


    }
}
