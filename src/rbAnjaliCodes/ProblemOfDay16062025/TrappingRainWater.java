package rbAnjaliCodes.ProblemOfDay16062025;

public class TrappingRainWater {



    public static int maxWater(int height[]) {
        int n = height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0] = height[0];
        right[n-1] = height[n-1];
        int ans = 0;


        for (int i = 1; i < n; i++) {
            left[i] =  Math.max(left[i-1],height[i]);
        }

        for (int i = n-2; i >=0 ; i--) {
            right[i] =  Math.max(right[i+1],height[i]);


        }
        for (int i = 0; i < n; i++) {
            ans+=(Math.min(left[i],right[i])-height[i]);
        }
        return ans;



    }
    public static void main(String[] args) {

        int arr[] = {3, 0, 1, 0, 4, 0 ,2};

        System.out.println(maxWater(arr));
    }
}
