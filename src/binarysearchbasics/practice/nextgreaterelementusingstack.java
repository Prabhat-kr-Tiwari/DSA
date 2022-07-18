package binarysearchbasics.practice;

import java.util.Stack;

public class nextgreaterelementusingstack {

    static int [] nextGreater(int a[])
    {
        int n=a.length;
        int []nge=new int[a.length];

        Stack<Integer>st=new Stack<>();


        for (int i = 0; i <=2*n-1; i++) {
            while (!st.empty()&&st.peek()<=a[i])
            {
                st.pop();


            }
            if(i<n)
            {
                if(!st.empty())
                {
                    nge[i]=st.peek();
                }
                else {
                    nge[i]=-1;
                }
            }
            st.push(a[i]);



        }
        return nge;
    }


    public static void main(String[] args) {
        int a[]={1,2,3,1,12,3,6,2,8,9};
        nextGreater(a);
        for (int x:a
             ) {
            System.out.println(x);

        }

    }
}
