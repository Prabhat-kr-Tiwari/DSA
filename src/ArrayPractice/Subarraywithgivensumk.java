package ArrayPractice;

import java.util.HashMap;

public class Subarraywithgivensumk {

    static void sum(int a[],int k){

        int start=0;
        int end=-1;
        int count=0;
        int n=a.length;
        int currsum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            currsum+=a[i];

            if(currsum-k==0){
                start=0;
                end=i;
                count++;
            }
            if (hm.containsKey(currsum-k)){
                start=hm.get(currsum-k)+1;
                end=i;
                count++;
                break;

            }
            hm.put(currsum,i);

        }
        System.out.println(hm);
        /*if (end==-1){
            return 0;
        }else {
            return count;
        }*/
    }

    public static void main(String[] args) {


        int[] nums = {1,1,1};
        int k = 2;
        //System.out.println(sum(nums,k));
        sum(nums,k);

    }
}
