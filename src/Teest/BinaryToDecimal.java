package Teest;

public class BinaryToDecimal {




   static void decimalToBinary(int num){
        int ans  = 0;
        int i =0;
        while (num!=0){
            int digit = num&1;
            ans = (int) ((digit*Math.pow(10,i))+ans);
            num= num>>1;
            i++;

        }
        System.out.println(ans);


    }

    public static void main(String[] args) {
        decimalToBinary(5);
    }
}
