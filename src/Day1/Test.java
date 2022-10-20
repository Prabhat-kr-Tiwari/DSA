package Day1;



import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Test
{
    static String remVowel(String str)
    {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U','Y'};

        List<Character> al = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }


        return sb.toString();
    }
    static String uppercasetolower(String str)
    {
        //str = str.replaceAll("[aeiouAEIOU]","");
        //StringBuffer sb = new StringBuffer(str);







        return str;
    }


    // Driver method to test the above function
    public static void main(String[] args)
    {
        String str = "GEeeksforGeeks - A Computer Science Portal for Geeks";
        String str2=str;
        String iinput="HEELO";

        System.out.println(remVowel(str));

        str=str.replaceAll("[aeiouyAEIOU]","");
        String s=str.toLowerCase();
        System.out.println(s);

        str = str.replaceAll("[aeiouyYAEIOU]","");
        str = str.replaceAll("([a-zA-z])", "*$1");
        System.out.println(str);


    }
}

