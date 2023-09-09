package Accenture;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/*91% of storage used … If you run out, you won't have enough storage to create, edit and upload files.
 Get 100 GB of storage for ₹130.00 ₹35.00 for 1 month.
You are tasked with a complex matrix operation.
You will need to input the size of the matrix and then provide the elements of the matrix.
The main matrix must then be divided into two submatrices: one for even-indexed elements and the other
for odd-indexed elements.
Following this, you are required to sort both the even and odd matrices in ascending order.
Finally, you must calculate and print the sum of the second largest numbers from both matrices.

For example:

Enter the size of the array: 5
Enter the element at the 0th index: 3
Enter the element at the 1st index: 4
Enter the element at the 2nd index: 1
Enter the element at the 3rd index: 7
Enter the element at the 4th index: 9

After sorting:
Sorted even array: 1 3 9
Sorted odd array: 4 7

The sum of the second largest numbers from both matrices is 7.*/
public class sortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int arrsize = sc.nextInt();
        int[] main = new int[arrsize];
        ArrayList<Integer> even = new <Integer>ArrayList();
        ArrayList<Integer> odd = new <Integer>ArrayList();
        System.out.println("Enter " + arrsize + " Elements");
        for (int i = 0; i < arrsize; i++)
            main[i] = sc.nextInt();
        for (int i = 0; i < arrsize; i++) {
            if (i % 2 == 0)
                even.add(main[i]);
            else
                odd.add(main[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println("Sorted even array ");
        for (int e : even)
            System.out.print(e + " ");
        System.out.println();
        System.out.println("sorted odd array ");
        for (int e : odd)
            System.out.print(e + " ");
        System.out.println();
        int evensec = even.get(even.size() - 2);
        int oddsec = odd.get(odd.size() - 2);
        System.out.println("Second Largest Element in Even List is:" + evensec);
        System.out.println("Second Largest Element in Odd List is:" + oddsec);
        System.
                out.println("Sum Of Second Largest Element Of Odd and Even List:" +
                        (evensec + oddsec));
    }
}
