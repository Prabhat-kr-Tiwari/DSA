package Top100Codes.GettingStarted;

public class greatestofthree {
    static void greatestUsingTernary(int n1,int n2,int n3){
        int temp=n1>n2?n1:n2;
        int result=temp>n3?temp:n3;
        System.out.println(result);
    }
    static void greatest(int n1,int n2,int n3){
        if (n1>n2&&n1>n3){
            System.out.println(n1);
        } else if (n2>n3&&n2>n3) {
            System.out.println(n2);

        }else{
            System.out.println(n3);
        }
    }

    public static void main(String[] args) {
        greatest(8,2,3);
        greatestUsingTernary(3,23,2);
    }


}
