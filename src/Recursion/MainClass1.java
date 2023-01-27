package Recursion;

public class MainClass1 {

    static int i=0;

    static void dummyFunction(){
        System.out.println(i++);
        dummyFunction();

    }
    static void printNNaturalNumber(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        printNNaturalNumber(n-1);
    }

    public static void main(String[] args) {
        //dummyFunction();
        printNNaturalNumber(5);
    }
}
