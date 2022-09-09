package doubtofstack;

import java.util.Arrays;

public class ImplementKstackusingArray {
    public static void main(String[] args) throws Exception {
        KStacks kStacks=new KStacks(3);
        kStacks.push(10,0);
        kStacks.push(20,0);
        kStacks.push(30,1);
        System.out.println( kStacks.peek(0));

    }

}
class KStacks{
    int SIZE=10;
    int k;
    int a[],next[],top[],free;
    public KStacks(int k){
        this.k=k;
        a=new int[SIZE];
        next = new int[SIZE];
        top=new int[k];
        free=0;
        Arrays.fill(top,-1);
        for (int i = 0; i < SIZE-1; i++) {
            next[i]=i+1;


        }
        next[SIZE-1]=-1;
    }
    boolean isFull(){
        return free==-1;

    }
    boolean isEmpty(int sn){
        return top[sn]==-1;
    }
    void push(int data,int sn) throws Exception {
        if (isFull()) throw new Exception("Arrays is full");
        int i=free;
        free=next[i];
        next[i]=top[sn];
        top[sn]=i;
        a[i]=data;

    }
    int pop(int sn) throws Exception {
        if (isEmpty(sn)) throw new Exception("Arrays is empty");
        int i=top[sn];
        top[sn]=next[i];
        next[i]=free;
        free=i;
        return a[i];
    }
    int peek(int sn) throws Exception {
        if (isEmpty(sn)) throw new Exception("Arrays is full");
        int i=top[sn];
        return a[i];
    }


}
