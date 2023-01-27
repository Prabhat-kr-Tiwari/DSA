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
    public MinHeap(int a[])
    {
        this.a=a;
        this.capacity=a.length-1;
        this.n=a.length-1;
        buildHeap();
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
/*    void printHeap(){
        for (int e:a
             ) {
            System.out.print(e + " ");

        }
        System.out.println();
    }*/
    int extractmin() throws Exception {
        if(n==0) throw new Exception("Heap is empty");
        int result=a[1];
        a[1]=a[n];

        n--;
        int i=1;
        while(i<=n)
        {
            int l=2*i;
            int r=2*i+1;
            int Smallest=i;
            if(l<=n&&a[l]<a[Smallest] )
            {
                Smallest=l;
            }

            if (r<=n&&a[r]<a[Smallest])
            {
                Smallest=r;
            }
            if(Smallest!=i)
            {
                swap(Smallest,i);
                i=Smallest;
            }else break;

        }
        return result;
    }
    void heapify(int i)
    {
        while(i<=n)
        {
            int l=2*i;
            int r=2*i+1;
            int Smallest=i;
            if(l<=n&&a[l]<a[Smallest] )
            {
                Smallest=l;
            }

            if (r<=n&&a[r]<a[Smallest])
            {
                Smallest=r;
            }
            if(Smallest!=i)
            {
                swap(Smallest,i);
                i=Smallest;
            }else break;

        }
    }
    void buildHeap(){

        for(int i=n;i>0;i--)
        {
            heapify(i);
        }
    }
    void printHeap(){
        for (int i=1;i<=n;i++
        ) {
            System.out.print(a[i]+" ");

        }
        System.out.println();
    }
    void heapsort() throws Exception {
        int newN=n;
        for(int i=1;i<=newN;i++)
        {
            int x=extractmin();
            System.out.println(x+" ");
        }
    }


}
