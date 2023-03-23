package tenDaysRecursionChalengeloveBabbar.RecursionDay7;

import java.util.ArrayList;
import java.util.List;

public class subsetleetcode {


    static void solve(int nums[],int index,List<Integer>output,List<List<Integer>>ans)
    {
        //base case

        if (index>=nums.length)
        {
            ans.add(new ArrayList<>(output));
            return;
        }
        //exclude
        solve(nums,index+1,output,ans);

        //include
        int element=nums[index];
        output.add(element);
        solve(nums,index+1,output,ans);
        output.remove(output.size()-1);

    }




    static List<List<Integer>> subset(int num[])
    {

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>output=new ArrayList<>();
        solve(num,0,output,ans);
        return ans;


    }

    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(subset(a));
    }
}
