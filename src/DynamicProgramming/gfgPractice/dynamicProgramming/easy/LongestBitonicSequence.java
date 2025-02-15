package DynamicProgramming.gfgPractice.dynamicProgramming.easy;

public class LongestBitonicSequence {
    static int LongestBitonicSequence1(int[] nums)
    {
        // Code here
        int n=nums.length;
        int[]inc=new int[n];
        for(int i=0;i<n;i++){
            inc[i]=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i] && inc[j]+1>inc[i]){
                    inc[i]=inc[j]+1;
                }
            }
        }
        int[]dec=new int[n];
        for(int i=n-1;i>=0;i--){
            dec[i]=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i] && dec[j]+1>dec[i]){
                    dec[i]=dec[j]+1;
                    System.out.println("numsj "+nums[j]);
                }
            }
        }

        System.out.println("dec");
        for (int e:dec){
            System.out.print(e+" ");
        }
        System.out.println();
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,inc[i]+dec[i]-1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 3, 2};
       int a[]= {1, 11, 2, 10, 4, 5, 2, 1};
        System.out.println(LongestBitonicSequence1(a));
    }
}
