package Array2;

public class Trappingrainwater {
    static int water(int a[])
    {
        int n=a.length;
        int l[]=new int[n];
        int r[]=new int[n];
        int sum=0;
        l[0]=a[0];
        for (int i = 1; i <n ; i++) {
            l[i]=Math.max(l[i-1],a[i]);

        }
        r[n-1]=a[n-1];
        for (int i = n-2; i >=0 ; i--) {
            r[i]=Math.max(r[i+1],a[i]);
        }
        for (int i = 0; i < n; i++) {
            sum+=(Math.min(l[i],r[i])-a[i]);

        }


        return sum;
    }

    public static void main(String[] args) {
        int a[]={1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(water(a));

    }
}
