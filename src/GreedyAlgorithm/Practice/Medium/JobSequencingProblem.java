package GreedyAlgorithm.Practice.Medium;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {


    static class Job
    {
        int id;	 // Job Id
        int dead; // Deadline of job
        int profit; // Profit if job is over before or on deadline
        Job(int x, int y, int z) {
            this.id = x;
            this.dead = y;
            this.profit = z;
        }
    };


        //Function to find the maximum profit and the number of jobs done.
        static int[] JobScheduling(Job arr[], int n)
        {
            // Your code here

            //sort based on the profit because we have to maximize the profit
            Arrays.sort(arr, new Comparator<Job>() {
                @Override
                public int compare(Job o1, Job o2) {
                    return o2.profit-o1.profit;
                }
            });

            //find the maximum deadline
            int maxdeadline=Integer.MIN_VALUE;
            for (int i = 0; i <n ; i++) {

                maxdeadline=Math.max(maxdeadline,arr[i].dead);
            }
            int count=0;
            int maxprofit=0;
            int schedule[]=new int[n+1];
            Arrays.fill(schedule,-1);
            int[] ans =new int[2];
            //take each
            for (int i = 0; i < n; i++) {

                int currProfit=arr[i].profit;
                int currJobId=arr[i].id;
                int currDeadline=arr[i].dead;
                for (int j = currDeadline; j >0 ; j--) {
                    if (schedule[j]==-1){
                        count++;
                        maxprofit+=currProfit;
                        schedule[j]=currJobId;
                        break;
                    }



                }

            }
            ans[0]=count;
            ans[1]=maxprofit;
            return ans;




        }


    public static void main(String[] args) {

        Job[] Jobs = {
                new Job(1, 4, 20),
                new Job(2, 1, 10),
                new Job(3, 1, 40),
                new Job(4, 1, 30)
        };
        System.out.println(Arrays.toString(JobScheduling(Jobs, 4)));




    }
}
