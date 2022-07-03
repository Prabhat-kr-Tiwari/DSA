package BitManipulation.practice;

public class swaptwonumber {
    static void swap(int a,int b)
    {
        System.out.println("Intial a"+a+" " +"Initial b"+b);
        //swap without using third variable
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a is"+a);
        System.out.println("b is"+b);
    }

    public static void main(String[] args) {
        swap(6,4);
    }
}
