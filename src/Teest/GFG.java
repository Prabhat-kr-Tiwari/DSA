package Teest;
import java.util.*;
/*public class GFG {
}*/
/*package whatever //do not write package name here */


class GFG {

    // Function which repeats
// first Nonrepeating character
    public static void FirstNonRepeat(String s)
    {

        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
                System.out.println("First non-repeating character is "+ s.indexOf(i)+1);
                break;
            }
        }
        return;
    }
    public static void main (String[] args) {
        String s = "leetcode";
        FirstNonRepeat(s);
    }
}

// This code is contributed by aadityaburujwale.

