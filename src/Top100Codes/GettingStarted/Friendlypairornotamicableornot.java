package Top100Codes.GettingStarted;


/*
Friendly Pair
The numbers whose ( sum of divisors ) / number ratio is same are known as Friendly Pair Numbers.
Let's try and understand it better using an example

Example
Input : 6 28
Output : Yes, they are a friendly pair
Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14
 respectively.
Now the sum of factors of both the numbers are 6 and 28 respectively.
When we divide the sums with the numbers we get 1 and 1 respectively.
As the ratio of both the number match, they are considered as a friendly pair.
*/


public class Friendlypairornotamicableornot {

    static int sumofFactor(int n){
        int sum=0;
        for (int i = 1; i <n ; i++) {
            if (n%i==0){
                sum+=i;
            }

        }
        return sum;
    }
    static void friendlyPair(int n1,int n2){
        int sum1=sumofFactor(n1);
        int sum2=sumofFactor(n2);
        if (sum1/n1==sum2/n2){
            System.out.println("friendly pair");
        }else {
            System.out.println("Not");
        }

    }

    public static void main(String[] args) {
        friendlyPair(6,12);

    }
}
