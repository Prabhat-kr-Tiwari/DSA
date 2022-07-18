package string2.practice;

import java.util.HashMap;

public class isomorphicstring {

     static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here


        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        if(str1.length()!=str2.length())
        {
            return false;
        }
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            char ch1=str2.charAt(i);
            if(hm.containsKey(ch))
            {
                if(hm.get(ch)!=ch1)
                {
                    return false;
                }
            }
            else if(hm.containsValue(ch1))
            {
                return false;
            }
            else{
                hm.put(ch,ch1);
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String str1=" aab";
        String str2=" xxy";
        System.out.println(areIsomorphic(str1,str2));
    }
}
