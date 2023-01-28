package Recursion.Recursionandbacktrackingbasic.Practice;

public class print1tonusingrecursion {


    static void printNos(int N)
    {
        //Your code here
        if(N==0) return;
        printNos(N-1);
        System.out.print(N+" ");

    }

    public static void main(String[] args) {
        printNos(5);
    }


}
