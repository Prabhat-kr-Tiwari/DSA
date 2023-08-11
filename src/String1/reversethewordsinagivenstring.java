package String1;

public class reversethewordsinagivenstring {

    // both i and j are included
    static void reverseCharacters(char[] s, int i, int j) {
        while(i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
        //System.out.println(s);
    }

    //	start  = 11
//	end    = 13
//
//	"Never Give Up"
//	"reveN eviG pU"
//
//	"Up Give Never"
    static String reverseWords(String s) {
        char[] c = s.toCharArray();
        int start = 0;
        int end = 0;
        for(; end < s.length(); end++) {
            if(c[end] == ' ') {
                reverseCharacters(c, start, end-1);
                start = end + 1;
//                System.out.println(end);
//                System.out.println(start);
            }
        }
        //System.out.println(c);

        reverseCharacters(c, start, end-1);

        //step 2
        reverseCharacters(c, 0, s.length()-1);
        return new String(c);
    }

    static void revchar(char[] c,int i,int j){
        while (i<j){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
       String s=reverseWords("I am the boss");
        System.out.println(s);
        revchar("Welcome".toCharArray(),0,6);

    }
}
