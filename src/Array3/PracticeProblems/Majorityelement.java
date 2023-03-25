package Array3.PracticeProblems;

import java.util.HashMap;
import java.util.Map;

public class Majorityelement {
    public int majorityElementUsingHashMap(int[] arr) {
        int n=arr.length;
        int x=0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
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
        // value whose key is to be searched
        Integer value = n/2;

        // iterate each entry of hashmap
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > value) {

                x=entry.getKey();
                break;
            }
        }
        return x;

    }
    static int majorityElementUsingMooreVotingAlgorithm(int a[], int size)
    {
        // your code here
        int ansCount=0;

        int ansIndex=0;
        int count=1;
        for(int i=1;i<size;i++){

            if(a[i]==a[ansIndex]){
                count++;
            }else{
                count--;
            }if(count==0){
                ansIndex=i;
                count=1;
            }
        }
        for(int i=0;i<size;i++){
            if(a[i]==a[ansIndex]){
                ansCount++;

            }

        }
        if(ansCount>size/2){
            return a[ansIndex];
        }else{
            return -1;
        }
    }

    static void majorityElement(int a[]){

        int count=0;
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for (int i = 0; i < a.length; i++) {

            if (hashMap.containsKey(a[i])){
                hashMap.put(a[i],hashMap.get(a[i])+1);
            }else{
                hashMap.put(a[i],1);


            }

        }
        for (int i = 0; i < a.length; i++) {
            if (hashMap.get(a[i])>a.length/2){
                System.out.println(a[i]);
            }

        }
    }

    public static void main(String[] args) {
        int a[]={5,1,4,1,1,4,4,4};
        majorityElement(a);
    }
}
