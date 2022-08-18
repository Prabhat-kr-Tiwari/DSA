package stackproblem2;

public class TwoStacks {
    int a[];
    int top1,top2;
    public TwoStacks(int capacity){
        a=new int[capacity];
        top1=-1;
        top2=capacity;
    }
    void push1(int data) throws Exception{
        if (top1+1<top2)
        {
            top1++;
            a[top1]=data;
        }
        else {
            throw new Exception("stack array is full");
        }
    }
    void push2(int data) throws Exception {
        if (top1+1<top2)
        {
            top2--;
            a[top2]=data;
        }
        else {
            throw new Exception("stack array is full");
        }
    }
    int pop1() throws Exception {
        if (top1>-1)
        {
            int res=a[top1];
            top1--;
            return res;
        }
        else {
            throw new Exception("stack 1  is empty");
        }
    }
    int pop2() throws Exception {
        if (top2<a.length)
        {
            int res=a[top2];
            top2++;
            return res;
        }
        else {


            throw new Exception("stack 2 is empty");
        }

    }
}
