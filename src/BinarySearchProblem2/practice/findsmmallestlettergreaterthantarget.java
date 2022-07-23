package BinarySearchProblem2.practice;
/*
Given a characters array letters that is sorted in non-decreasing order and a character target,
        return the smallest character in the array that is larger than target.

        Note that the letters wrap around.

        For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.


        Example 1:

        Input: letters = ["c","f","j"], target = "a"
        Output: "c"
        Example 2:

        Input: letters = ["c","f","j"], target = "c"
        Output: "f"
        Example 3:

        Input: letters = ["c","f","j"], target = "d"
        Output: "f"
*/

public class findsmmallestlettergreaterthantarget {

    static char nextGreatestLetter(char[] alphabets, char K) {
        int n = alphabets.length;
        if(K>=alphabets[n-1])
            return alphabets[0];

        int l = 0, r = alphabets.length - 1;

        int ans = -1;
        // Take the first element as l and
        // the rightmost element as r
        while (l <= r)
        {

            // if this while condition does not
            // satisfy simply return the first
            // element.
            int mid = (l + r) / 2;
            System.out.println("l= "+l+" "+"r= "+ r+" "+"mid= "+mid);
            if (alphabets[mid] > K)
            {
                r = mid - 1;
                ans = mid;
            }
            else
                l = mid + 1;
        }

        // Return the smallest element
        return alphabets[ans];

    }

    public static void main(String[] args) {
        char [] alphabets= {'c','f','j','k','m','o'};
        char target = 'm';
        System.out.println(nextGreatestLetter(alphabets,target));
    }



}
