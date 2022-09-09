package QueueProblems;

public class circulartourroblem {

    static int tour(int petrol[], int distance[])
    {
        // Your code here

        int n=petrol.length;
        int start=0;
        int curr=0;
        int prev=0;
        for(int i=0;i<n;i++)
        {
            curr+=(petrol[i]-distance[i]);
            if(curr<0)
            {
                prev+=curr;
                curr=0;
                start=i+1;
            }
        }
        if(curr+prev>=0) return start;
        return -1;

    }

    public static void main(String[] args) {
        int []Petrol = {4, 6, 7, 4};
        int []Distance = {6, 5, 3, 5};
        System.out.println(tour(Petrol,Distance));
    }
}
