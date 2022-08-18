package stackproblem2;

public class MainClass {
    public static void main(String[] args) throws Exception {
        TwoStacks twoStacks=new TwoStacks(6);
        twoStacks.push1(10);
        twoStacks.push1(20);
        twoStacks.push1(30);

        twoStacks.push2(40);
        twoStacks.push2(60);
        twoStacks.push2(70);


        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop2());
        System.out.println(twoStacks.pop2());
    }



}
