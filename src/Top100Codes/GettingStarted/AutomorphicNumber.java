package Top100Codes.GettingStarted;


/*


Automorphic Number
A Number that when squared ends with the number itself is known as the Automorphic Number.
 Let's try and understand the concept of Automorphic Number,
Example
Input : 5
Output : 25
Explanation : Number = 5
when squared you get 25
as 25 ends with 5
*/
public class AutomorphicNumber {

    static void automorph(int n)
    {
        int square=n*n;
        System.out.println(square);
        int lastdigit=square%10;
        System.out.println(lastdigit);
        if (n==lastdigit){
            System.out.println("automorphic");
        }else{
            System.out.println("not");
        }
    }

    public static void main(String[] args) {

        automorph(5);

    }
}
