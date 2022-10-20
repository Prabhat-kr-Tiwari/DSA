package Heaps1;

public class MinHeap {
    int a[];
    int capacity;
    int n;
    public MinHeap(int capacity)
    {
        this.capacity=capacity;
        n=0;
        a=new int[capacity+1];
    }
    void swap(int i,int j)
    {
        int temp=a[ i];
        a[i]=a[j];
        a[j]=temp;


    }
    int size(){
        return n;
    }

    public void insert(int key) throws Exception {
        if(n==capacity) throw new Exception("Heap is full");
        n=n+1;
        a[n]=key;
        int i=n;
        while (i>1)
        {
            int parent=i/2;
            if(a[parent] > a[i])
            {
                swap(parent,i);
                i=parent;

            }else{
                return;
            }
        }

    }
    void printHeap(){
        for (int e:a
             ) {
            System.out.print(e + " ");

        }
        System.out.println();
    }

}
