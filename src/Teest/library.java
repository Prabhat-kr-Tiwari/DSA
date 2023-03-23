package Teest;

public class library {

    static void charge(int noOfDays){
        int charges=0;
        if(noOfDays<=0){
            System.out.println("There are no charges");
        }else if(noOfDays<=5){
            charges++;
            System.out.println("Your charges are :"+charges);
        }else if(noOfDays>=6&&noOfDays<=10){
            charges+=2;
            System.out.println("Your charges are :"+charges);
        }else if (noOfDays>10){
            charges+=5;
            System.out.println("Your charges are :"+charges);

        }else {
            System.out.println("Your membership is cancelled");
        }

    }

    public static void main(String[] args) {
        charge(10);

    }

}
