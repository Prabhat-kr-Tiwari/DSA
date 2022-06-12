package array1;

public class replaceeveryelementwiththegreateselementonitsitsrightside {

    public static void main(String[] args) {
        int a[]={7,5,8,9,6,8,5,7,4,6};
        int n=a.length;
        /*int n=a.length;
        int k=0;
        int b[]=new int[a.length];
        for (int i = 0; i < n; i++) {
            int curr=a[i];
            boolean isgreater=true;
            for (int j = i+1; j < n; j++) {
                if (a[j]>a[i])
                {
                    b[k++]=a[j];
                    System.out.println(b[k]);
                }
            }
        }*/
       // System.out.println(b[k]);
        int max=-1;
        for (int i = n-1; i >=0 ; i--) {

            int val=a[i];
            a[i]=max;
            max=Math.max(val,max);

        }

        for (int el:a
             ) {
            System.out.println(el);

        }

    }
}
