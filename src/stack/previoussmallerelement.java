package stack;

import java.util.ArrayDeque;

public class previoussmallerelement {

    static int[] previousSmaller(int a[])
    {
        int ans[]=new int[a.length];
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        int i=0;
        for (int e:a
             ) {
            while (!stack.isEmpty()&&stack.peek()>=e)
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
            stack.push(e);
            i++;

        }

        return ans;
    }

    public static void main(String[] args) {
        int a[]={1,6,2};
        int ans[]=previousSmaller(a);
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
            System.out.print(ans[i]+" ");
            System.out.println();
        }
    }
}
