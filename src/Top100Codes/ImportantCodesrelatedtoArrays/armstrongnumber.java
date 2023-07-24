package Top100Codes.ImportantCodesrelatedtoArrays;

public class armstrongnumber {


    /*Input : 153
Output : Yes
153 is an Armstrong number.
1*1*1 + 5*5*5 + 3*3*3 = 153*/

    static boolean isArmstrong(int n){
        int temp=n;
        int sum=0;
        while (temp!=0){
            int digit=temp%10;
            sum=sum+digit*digit*digit;
            temp=temp/10;
        }
        if (sum==n){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));

    }
}
