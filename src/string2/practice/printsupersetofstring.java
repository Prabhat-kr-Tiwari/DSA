package string2.practice;

public class printsupersetofstring {

    static void powerset(String s,int i,String curr)
    {
        if(i==s.length())
        {
            System.out.println(curr);
            return;
        }
        powerset(s,i+1,curr+s.charAt(i));
        powerset(s,i+1,curr);
    }

    public static void main(String[] args) {
        powerset("abc",0," ");
    }
}
