package string2.practice;

public class findleftmostrepeatingcharacter {

    static int repeatingFromLeft(String s)
    {
        boolean [] visited=new boolean[256];
        for (int i = 0; i <256 ; i++) {
            visited[i]=false;
        }
        int res=-1;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (visited[s.charAt(i)]==false)
            {
                visited[s.charAt(i)]=true;
            }
            else {
                res=i;
            }

        }
        return res;
    }
    public static void main(String[] args) {
        String s="aapplejuice";
        int index=repeatingFromLeft(s);
        System.out.println(s.charAt(index));
        System.out.println(repeatingFromLeft("aapplejuice"));

    }
}
