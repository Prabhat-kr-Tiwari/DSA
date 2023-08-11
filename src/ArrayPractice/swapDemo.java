package ArrayPractice;

/*public class swapDemo {
}*/
public class swapDemo {

    static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        swap(num1, num2);
/*
        System.out.println("\nAfter swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);*/
    }
}

