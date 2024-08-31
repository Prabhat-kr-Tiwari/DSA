package DynamicProgramming.AdityaVerma.matrixaChain;

public class PalindromePartioning {
    static boolean isPalindrome(String s,int i,int j){
        while (i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
    static int PalindromePartioning(String s,int i,int j){
        if(i>=j) return 0;
        int min=Integer.MAX_VALUE;
        if (isPalindrome(s,i,j)) return 0;
        for (int k = i; k <j ; k++) {

            int tempans=PalindromePartioning(s,i,k)+PalindromePartioning(s,k+1,j)+1;
            if (tempans<min){
                min=tempans;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        String s="geek";
        System.out.println(  PalindromePartioning(s,0,s.length()-1));
    }
}
