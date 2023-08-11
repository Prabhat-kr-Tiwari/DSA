package ArrayPractice;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberformedfromanArray {

    static int countEachDigit(int a[]){
        int temp=0;
        int count=0;

        for (int i = 0; i <a.length ; i++) {
            temp=a[i];

            while (temp!=0){
                temp=temp/10;
                count++;

            }

        }
        return count;
    }


    static int getFirstDigit(int n){
        int first=0;
        while (n!=0){
            first=n%10;
            n=n/10;
        }
        return first;
    }
    public static boolean isOneDigit(int number) {
        return number >= 0 && number <= 9;
    }

    //9534330
    static void lar(int a[]){
        int maxOnedigit=0;
        int currOnedigit=0;
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            if(isOneDigit(a[i])){
                if(a[i]>maxOnedigit){
                    maxOnedigit=a[i];
                }

            }


        }
        sb.append(maxOnedigit);
        for (int i = 0; i < a.length; i++) {
            if(isOneDigit(a[i])&&a[i]!=maxOnedigit&&a[i]!=currOnedigit){
                currOnedigit=a[i];
                sb.append(currOnedigit);
            }


        }




        // Step 2: Convert the final string back to an integer
        int resultNumber = Integer.parseInt(sb.toString());

        System.out.println(resultNumber);


    }
    public static int createNumberFromArray(int[] arr) {
        int number = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            number += arr[i] * Math.pow(10, arr.length - 1 - i);
        }
        return number;
    }
    public static int createNumberFromArray2(int[] arr) {
        // Step 1: Convert integers to strings
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }

        // Step 2: Convert the final string back to an integer
        int resultNumber = Integer.parseInt(sb.toString());

        return resultNumber;
    }

        public static String createLargestNumber(String[] arr) {
            // Step 1: Convert integers to strings
            String[] strArr = new String[arr.length];
            for (int i = 0; i < arr.length; i++) {
                strArr[i] = arr[i];
            }

            // Step 2: Sort the strings using a custom comparator
            Arrays.sort(strArr, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    String order1 = a + b;
                    String order2 = b + a;
                    // Reversing the order to sort in descending order
                    return order2.compareTo(order1);
                }
            });

            // Step 3: Concatenate the strings to form the largest number
            StringBuilder largestNumber = new StringBuilder();
            for (String numStr : strArr) {
                largestNumber.append(numStr);
            }

            return largestNumber.toString();
        }


    public static void main(String[] args) {
        String a[]={"3", "30", "34", "5", "9"};
      // int res=createNumberFromArray2(a);
       // System.out.println(res);
        //lar(a);
        //9534330
        //System.out.println(getFirstDigit(30));
       // countEachDigit(a);
        System.out.println( createLargestNumber(a));

    }
}
