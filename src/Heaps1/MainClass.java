package Heaps1;

public class MainClass {
    public static void main(String[] args) throws Exception {
        MinHeap minHeap=new MinHeap(4);
        minHeap.insert(2);
        minHeap.insert(10);
        minHeap.printHeap();
        System.out.println(minHeap.size());
        minHeap.insert(15);
        minHeap.insert(1);
        minHeap.printHeap();
    }



}
