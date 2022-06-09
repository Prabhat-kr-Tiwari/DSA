package javaOOOPs;
class parent{
    String name;
    int age;
    static int count;
    /*public parent(String newName,int newage){
        name=newName;
        age=newage;
    }*/
    public parent(){
        //calling that constructor which takes two parameter  ,first as string and second as integer
        this("hello",787);
        count++;
        System.out.println("parent is being created ");
    }
    public parent(String name, int age){

        //this();//for accessing current object or calling that constructor which takes nothing as parameter
        this.name=name;
        this.age=age;
        //running(this);
    }
    /*void running(parent obj)
    {
        System.out.println(name+"is running");
        age+=10;
    }*/

}

public class understandingthiskeyword {
    public static void main(String [] args)
    {
        // prabhat and 22 is passed to name and age of person class
        parent pp=new parent("prabhat",22);
      //These below three lines equal to the above line
        /*  parent pp=new parent();
        pp.name="prabhat";
        pp.age=22;*/
        System.out.println(pp.name+" "+pp.age);
        System.out.println(parent.count);
    }
}
/*
1.this keyword for ambiguity variable

package javaOOOPs;
class parent{
    String name;
    int age;
    static int count;
    /*public parent(String newName,int newage){
        name=newName;
        age=newage;
    }*/
/*public parent(){
    //calling that constructor which takes two parameter  ,first as string and second as integer
    //this("hello",787);
    count++;
    System.out.println("parent is being created ");
}
    public parent(String name, int age){


        this.name=name;
        this.age=age;

    }
    void running(parent obj)
    {
        System.out.println(name+"is running");
        age+=10;
    }

}

public class understandingthiskeyword {
    public static void main(String [] args)
    {
        // prabhat and 22 is passed to name and age of person class
        parent pp=new parent("prabhat",22);
        //These below three lines equal to the above line
        *//*  parent pp=new parent();
        pp.name="prabhat";
        pp.age=22;*//*
        System.out.println(pp.name+" "+pp.age);
        System.out.println(parent.count);
    }
}*/

