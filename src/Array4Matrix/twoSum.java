package Array4Matrix;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class twoSum {

        public int[] twoSum(int[] a, int target) {
            int l=0;
            int ans[]=new int[2];
            int r=a.length-1;
            while(l<r){
                int currsum=a[l]+a[r];
                if(currsum>target){
                    r--;
                }else if(currsum<target){
                    l++;
                }else{
                    break;
                }
            }
            ans[0]=l+1;
            ans[1]=r+1;
            return ans;

        }
}
