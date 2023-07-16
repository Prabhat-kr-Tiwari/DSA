package Array3.PracticeProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class subarraywithgivensum {
    static ArrayList<Integer> sum(int a[], int sum, int n)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        int res=0;
        int i=0;
        int j=i+1;
        for (; i <n ; i++) {

            for (; j <n ; j++) {
                res+=a[i]+a[j];


                if(res==sum){
                    ans.add(i);
                    ans.add(j);

                }else{
                    continue;
                }


            }


        }
        return ans;

    }
    static ArrayList<Integer>  subarraywithgivensum(int a[],int sum){
        int n=a.length;

        int start=0;
        int end=-1;
        int currsum=0;
        ArrayList<Integer>ans=new ArrayList<>();

        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            currsum+=a[i];
            if (currsum-sum==0){
                start=0;
                end=i;
                break;
            }
            if (hm.containsKey(currsum-sum)){
                start= hm.get(currsum-sum)+1;
                end=i;
                break;
            }
            hm.put(currsum,i);


        }
        if (end==-1){
            ans.add(-1);
           // System.out.println("Not found");
        }else{
            ans.add(start+1);
            ans.add(end+1);
            //System.out.println("found");
        }
        return ans;
    }


    public static void main(String[] args) {

       int a[]={ 1,2,3,7,5};
        System.out.println(sum(a,12,a.length));
        System.out.println(subarraywithgivensum(a,12));
    }
}
