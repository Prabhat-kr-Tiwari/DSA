package javaoops2;
public class LearInheritance {
    public static void main(String [] args)
    {
        samsung s1=new samsung();
        s1.os="Android";


        System.out.println("The operating system of samsung is  "+s1.os);
        s1.PlayGame();
        s1.hasHeadPhoneJack=true;
        System.out.println(s1.hasHeadPhoneJack);
        s1.price=5000;
        System.out.println("The price of samsung "+s1.price);

        /*Apple a1=new Apple();
        a1.PlayGame(4);*/
        MobilePhone m=new MobilePhone();
        //m.PlayGame();
        m.PlayGame(4);
        Apple ap=new Apple();
        ap.PlayGame();
    }
}
class samsung extends MobilePhone{
    void PlayGame(){
        System.out.println("samsung playing games");
    }
}
class Apple extends MobilePhone{
    void PlayGame(){
        System.out.println("Apple playing game");
    }
}
class MobilePhone{
    boolean hasHeadPhoneJack;
    int price;
    int dimension;
    String os;
    /*void PlayGame(){
        System.out.println("mobile phone playing games");
    }*/
    void PlayGame(int x){
        System.out.println("mobile phone playing games");
        for (int i=0;i<x;i++)
        {
            System.out.println("playing games"+i);
        }
    }
}
