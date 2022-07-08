package string2.practice;

public class findlengthoflastword {



    static int length(String s)
    {
        boolean flag=false;
        int ans=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if ((s.charAt(i)==' ')&& flag==true)
            {
                break;
            }
            else if (s.charAt(i)!=' '){
                flag=true;
                ans++;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(length("geeks for geeks"));
    }
}
