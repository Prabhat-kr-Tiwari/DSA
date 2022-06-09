package javaoops2;

public class LearnEncapsulation {
    public static void main(String [] args)
    {
        Secret s=new Secret();
        //s.data=4;

        s.setData(13);
        s.setData(103);
        System.out.println(s.getData());
    }
}
class Secret{
    private int data;
    public void setData(int data)
    {
        //validation
        if (data>100){
            this.data=data;
        }
        else {
            System.out.println("you are not allowed");
        }
    }
    public int getData()
    {
        return data;
    }
}
