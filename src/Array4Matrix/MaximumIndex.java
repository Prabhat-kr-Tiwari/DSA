package Array4Matrix;

public class MaximumIndex {

    //Brute force
    static int maximumIndex(int a[]){
        int n=a.length;
        int ans=0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[j]>a[i]){
                    ans=Math.max(ans,j-i);
                }
            }

        }
        return ans;
    }
    //optimal
    static int maxValueOfJMinusI(int a[]){
        int ans=0;
        int n=a.length;
        int rightMax[]=new int[n];
        int leftMin[]=new int[n];
        rightMax[n-1]=a[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMax[i]=Math.max(rightMax[i+1],a[i]);
        }
        leftMin[0]=a[0];
        for (int i = 1; i < n; i++) {
            leftMin[i]=Math.min(leftMin[i-1],a[i]);
        }
        System.out.println("left min");
        for (int x:leftMin
             ) {
            System.out.println(x);

        }
        int i=0;int j=0;//j is for rightmax
        while (i<n&&j<n){
            if (leftMin[i]<rightMax[j]){
                ans=Math.max(ans,j-i);
                j++;
            }else {
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int b[]={5,4,1,7,2,8,6,3,4};
        System.out.println(maximumIndex(b));
        System.out.println(maxValueOfJMinusI(b));
    }


}
