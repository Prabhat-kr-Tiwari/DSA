package stackproblem2;

import java.util.ArrayDeque;

public class findmaximumareainhistogram {

    //method 1
    static int maximumareainhistogram(int a[])
    {
        int n=a.length;
        int max=0;
        for (int i = 0; i <n ; i++) {
            int l=i;
            int r=i;
            while (l>=0&& a[l]>=a[i]) l--;
            while (r<n&& a[r]>=a[i]) r++;
            int width=r-l-1;
            int currArea=a[i]*width;
            max=Math.max(max,currArea);

        }
        return max;
    }
    //method 2

    static int[] previousSmaller(int a[])
    {
        int ans[]=new int[a.length];
        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for (int i=0;i<a.length;i++) {
            int e=a[i];
            while (!stack.isEmpty()&&a[stack.peek()]>=e)
            {
                stack.pop();

            }
            if (stack.isEmpty())
            {
                ans[i]=-1;
            }
            else {
                ans[i]= stack.peek();
            }
            stack.push(i);


        }

        return ans;
    }
    static int[] nextSmaller(int a[])
    {
        int ans[]=new int[a.length];
        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for (int i=a.length-1;i>=0;i--) {
            int e=a[i];
            while (!stack.isEmpty()&&a[stack.peek()]>=e)
            {
                //dshj
                stack.pop();

            }
            if (stack.isEmpty())
            {
                ans[i]=a.length;
            }
            else {
                ans[i]= stack.peek();
            }
            stack.push(i);


        }

        return ans;
    }
    static int maximumareainhistogramoptimiseed(int a[])
    {
        int ps[]=previousSmaller(a);
        int ns[]=nextSmaller(a);
        int max=0;
        for (int i = 0; i <a.length ; i++) {
            int width=ns[i]-ps[i]-1;
            int currArea=width*a[i];
            max=Math.max(currArea,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int a[]={4,3,9,2,5,1,8,3};
        int ps[]=previousSmaller(a);
        int ns[]=nextSmaller(a);
        //System.out.println(maximumareainhistogram(a));
      /*  for (int e:ns
             ) {
            System.out.print(e+"  ");

        }*/
        System.out.println(maximumareainhistogramoptimiseed(a));

    }

}
