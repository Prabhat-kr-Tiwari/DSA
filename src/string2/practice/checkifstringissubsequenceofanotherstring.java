package string2.practice;

public class checkifstringissubsequenceofanotherstring {



    static boolean strstr(String s, String x)
    {
        // Your code here
        int i=0;int j=0;
        //if(x.length()==0)return tru;
        while(i<x.length()&&j<s.length())
        {
            if(x.charAt(i)==s.charAt(j))
            {
                i++;
            }
            if(x.length()==i)
            {
                return true;
            }
            j++;
        }
        return false;


    }

    public static void main(String[] args) {
        System.out.println(strstr("baacd","abc"));

    }
}
