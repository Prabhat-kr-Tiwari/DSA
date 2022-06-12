package Array2;


import java.util.ArrayList;

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
                System.out.println(a[i]+" ");
            }

        }
    }
    //optimize
    static void isleader(int a[])
    {
        int largest=Integer.MIN_VALUE;
        for (int i = a.length-1; i >=0 ; i--) {
            if (a[i]>largest)
            {
                largest=a[i];
                System.out.println(a[i]+" ");
            }

        }
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> all=new ArrayList<>();
        //int largest=Integer.MIN_VALUE;
        int largest=arr[n-1];
        al.add(largest);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>=largest)
            {
                largest=arr[i];
                al.add(largest);
            }
        }
        for(int k=al.size()-1;k>=0;k--)
        {
            all.add(al.get(k));
        }
        return all;
    }
    public static void main(String[] args) {
        int a[]={2,7,6,1,4,3};
        int n=a.length;
        System.out.println("Using loop");
        leaderInArrayUsingLoops(a);
        System.out.println("using optimize o(N)");
        isleader(a);
        System.out.println("using arraylist");
        System.out.println(leaders(a,n));


    }
}
