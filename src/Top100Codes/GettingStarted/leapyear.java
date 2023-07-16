package Top100Codes.GettingStarted;

public class leapyear {
    static void isleap(int year){

        if(year%400==0){
            System.out.println("leap year");
        } else if (year%4==0&&year%100!=0) {
            System.out.println("leap year");

        }else {
            System.out.println("not a leap year");
        }
    }
    static void isleap2(int year){

        if(year%400==0||(year%4==0&&year%100!=0)){
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }

    public static void main(String[] args) {
        isleap2(2020);

    }
}
