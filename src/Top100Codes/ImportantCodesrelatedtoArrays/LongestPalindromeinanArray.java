package Top100Codes.ImportantCodesrelatedtoArrays;

public class LongestPalindromeinanArray {

    static int reve(int n){
        int temp=n;
        int revno=0;
        int digit=0;
        while(temp!=0){
            digit=temp%10;
            revno=revno*10+digit;
            temp=temp/10;

        }
        return revno;
    }
    static boolean ispalin(int n){
        int result=reve(n);
        return n == result;
    }
    static int length(int n){
        int len=0;
        while (n!=0){
            len++;
            n=n/10;
        }
        return len;
    }
    static int largestpalindrome(int a[]){
        int maxlength=0;
        int larpalin=0;
        int res=-1;
        for (int i = 0; i < a.length; i++) {
            /*if (ispalin(a[i])){
                maxlength=Math.max(maxlength,length(a[i]));
            }*/
            if (a[i]>res&&ispalin(a[i]))
            {
                res=a[i];

            }

        }
        if (res!=-1){
            return res;
        }
        return -1;
    }

    public static void main(String[] args) {
        int []A = { 121, 2322, 54545, 999990 };
        int n = A.length;
        System.out.println(largestpalindrome(A));
    }
}
