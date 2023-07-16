package ArrayPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstRepeatingElement {

    static int firstrepeating(int a[], int n) {
        int result = 0;
        int ans = 0;
        int answer = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0;
        for (; i < n; i++) {
            //hm.put(a[i],hm.getOrDefault(a[i],0)+1);
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
                int r= hm.get(a[i]);
                System.out.println(r);
                break;


            } else {
                hm.put(a[i], 1);
            }


        }
        for (Map.Entry<Integer, Integer> x : hm.entrySet()) {
            if (x.getValue() > 1) {
                result = x.getKey();
            }
        }
        for (int j = 0; j < n; j++) {
            if (a[j] == result) {
                answer = j;
                break;
            }

        }

        return answer+1;
    }

    static int firstnonrepeating(int a[],int n){
        HashSet<Integer>set=new HashSet<>();
        int index=0;
        for (int i = a.length-1; i >= 0 ;i--) {
            if (set.contains(a[i])){
                index=i;

            }else {
                set.add(a[i]);
            }

        }
        return index+1;
    }

    //{1=1, 3=2, 4=1, 5=2, 6=1}

    public static void main(String[] args) {
        int arr[] = {7 ,4 ,0 ,9, 4, 8, 8 ,2 ,4 ,5 ,5, 1};
        System.out.println(firstnonrepeating(arr, arr.length));
    }
}
