package package2;

public class class2 {
    public static void main(String [] args){
    }

    public void check(){
        method2();
    }
   /* private void method2(){
        System.out.println("class 2 method 2");
    }*/
    //default method is available in same package and same class
    //default is known as package private
   protected void method2(){
        System.out.println("class 2 method 2");
    }
}
/*class classx extends class2{
    public static void main(String [] args)
    {
        class2 on=new class2();
        on.method2();
    }

}*/
