package Heaps1;

public class MaxheapMainClass {

    public static void main(String[] args) throws Exception {
        MaxHeap maxHeap=new MaxHeap(6);
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.printHeap();
        // System.out.println(minHeap.size());
       // System.out.println(maxHeap.extractmax());

        maxHeap.printHeap();
        maxHeap.insert(3);
        maxHeap.insert(2);
        maxHeap.insert(4);
        maxHeap.printHeap();
        maxHeap.insert(15);
        maxHeap.printHeap();
    }
}
