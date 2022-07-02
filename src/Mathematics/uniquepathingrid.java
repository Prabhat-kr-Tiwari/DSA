package Mathematics;

public class uniquepathingrid {
    public static void main(String[] args) {
        int res=1;
        int n=5;
        int m=3;
        for (int i = 1; i < n; i++) {
            res+=(res*(m+i))/i;

        }
        System.out.println(res);
    }
}
