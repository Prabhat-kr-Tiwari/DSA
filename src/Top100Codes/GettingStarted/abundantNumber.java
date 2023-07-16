package Top100Codes.GettingStarted;


/*bundant Number, the sum of it’s factors except itself must be greater than the number*/

import java.util.ArrayList;

/*Abundant Numbers
A Number that is smaller than the sum of all it's factors except the number itself is known as an Abundant
 number.
Let's try and understand the concept better using an example

Example
Input : Number = 18
Output : Yes, It's an Abundant Number
Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number
 itself.
Now the sum of the factors except the number itself is :
1 + 2 + 3 + 6 + 9 = 21
as the number 21>18 , the number itself.
It's an abundant number.
*/
public class abundantNumber {

    static void factor(int n){
        int sum=0;
        ArrayList<Integer>al=new ArrayList<>();
        for (int i = 1; i <n ; i++) {
            if (n%i==0){
                System.out.println(i);
                sum+=i;

            }

        }
        if (sum>n){
            System.out.println("sum"+sum);
            System.out.println("Abundant");
        }else{
            System.out.println("Not");
        }

    }


    public static void main(String[] args) {
        int n=18;
        factor(n);


    }
}
