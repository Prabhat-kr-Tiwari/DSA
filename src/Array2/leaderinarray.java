package Array2;




public class leaderinarray {
    static void leaderInArrayUsingLoops(int a[])
    {

        for (int i = 0; i < a.length; i++) {
            int curr=a[i];
            boolean isLeader=true;
            for (int j = i+1; j < a.length; j++) {

                if (a[j]>curr)
                    isLeader=false;
            }
            if (isLeader)
            {
                System.out.println(a[i]);
            }

        }
    }

    public static void main(String[] args) {
        int a[]={2,7,6,1,4,3};
        leaderInArrayUsingLoops(a);
    }
}
