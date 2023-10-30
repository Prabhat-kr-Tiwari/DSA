package GreedyAlgorithm.LoveBabbarYoutubeGreedy;


import java.util.Arrays;
import java.util.Comparator;

public  class JobSequencingProblem {



    static class Job {
        int id, profit, deadline;

        Job(int x, int y, int z) {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }
    static int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        int ans[]=new int[2];


        Arrays.sort(arr, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o2.profit-o1.profit;
            }
        });
        int maxdeadline=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxdeadline=Math.max(maxdeadline,arr[i].deadline);
        }
        System.out.println(maxdeadline);

        int schedule[]=new int[n+1];
        Arrays.fill(schedule,-1);
        int count=0;
        int maxProfit=0;
        for (int i = 0; i < n ; i++) {


            int currProfit=arr[i].profit;
            int currJobID=arr[i].id;
            int currdeadline=arr[i].deadline;

            for (int j = currdeadline; j >0; j--) {


                if (schedule[j]==-1){
                    count++;
                    maxProfit+=currProfit;
                    schedule[j]=currJobID;
                    break;
                }


            }
        }
        ans[0]=count;
        ans[1] =maxProfit;


        return  ans;

    }

    public static void  main(String[] args) {


       int  N = 4;
        Job[] Jobs = {
                new Job(1, 4, 20),
                new Job(2, 1, 10),
                new Job(3, 1, 40),
                new Job(4, 1, 30)
        };

        System.out.println(Arrays.toString(JobScheduling(Jobs, N)));

    }
}
