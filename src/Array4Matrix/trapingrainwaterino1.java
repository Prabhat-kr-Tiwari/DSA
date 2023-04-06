package Array4Matrix;

public class trapingrainwaterino1 {

    static int trappingRainWater(int a[]){

        int ans=0;
        int leftMax=0;
        int rightMax=0;
        int left=0;
        int right=a.length-1;
        while(left<right){

            if (a[left]<=a[right]){//a[right]>leftmax
                if(a[left]>leftMax){
                    leftMax=a[left];

                }else{
                    ans+=(leftMax-a[left]);
                }
                left++;
            }else {

                if (a[right]>rightMax){
                    rightMax=a[right];

                }else {
                    ans+=(rightMax-a[right]);
                }
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={3,5,1,4,2,6};
        System.out.println(trappingRainWater(a));
    }






}
