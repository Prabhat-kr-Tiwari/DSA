package priorityQueue2;
import java.util.Arrays;
import java.util.PriorityQueue;
public class splitarrayinsubsets {
    static int splitArrayInSubsets(int a[], int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.offer(0);
        }
        Arrays.sort(a);
        for (int i = a.length-1; i >=0 ; i--) {
            int curr=a[i];
            int top=pq.poll();
            int toAdd=curr+top;
            pq.offer(toAdd);
        }
        int max=-1;
        for (int e:pq
             ) {
            max=Math.max(max,e);
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={1,4,2,3,7,2,4,5,6,3};
        int k=3;
        System.out.println(splitArrayInSubsets(a,k));
    }
}
