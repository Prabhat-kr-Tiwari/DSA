package javaoops2;

public class Mainclass {
    public static void main(String[] args){

       /* Alien al=new Alien();
        al.legs=9;
        al.speak();*/
        Alien.speak();
        Alien al=new Alien();
        al.legs=8;
        al.sayHello();

        //Alien.speak();
        Alien.isMemberOfEarth=true;
        //from static function non static function is not called
        //add(3,4);
    }
    int add(int a,int b){
        return  a+b;
    }

}
class Alien{
    static  boolean isMemberOfEarth=false;
    int legs;
    static void speak(){
        System.out.println("alien speaks");
        //sayHello();
    }
    void sayHello(){
        System.out.println("alien say hello");
    }


}
