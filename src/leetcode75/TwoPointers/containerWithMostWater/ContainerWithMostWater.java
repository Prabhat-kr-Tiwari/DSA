package leetcode75.TwoPointers.containerWithMostWater;

public class ContainerWithMostWater {

    static int maxArea(int[] height) {

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            int left = height[i];
            for (int j = i+1; j < height.length ; j++) {
                int right = height[j];
                int distance = j-i;
                int area = Math.min(left,right)*distance;
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;

    }
    static int maxAreaTwoPointer(int[] height) {

        int maxArea = 0;
        int l=0;
        int r= height.length-1;
        while (l<r){
            int distance = r-l;
            int area= distance*Math.min(height[l],height[r] );
            maxArea = Math.max(area,maxArea);
            if (height[l]<height[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {

        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
        System.out.println(maxAreaTwoPointer(height));

    }
}
