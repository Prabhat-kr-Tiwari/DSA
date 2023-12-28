package AskedByAsif;

public class secondsmallest {



    static void se(int a[]){
        int secondSmallest=Integer.MAX_VALUE;
        int Smallest=Integer.MAX_VALUE;

        for (int i = 0; i <a.length ; i++) {
            if (a[i]<Smallest){
                Smallest=a[i];
            }
            if(a[i]>Smallest&&(a[i]<secondSmallest)){
                secondSmallest=a[i];
            }

        }
        System.out.println(secondSmallest);
        System.out.println(Smallest);
    }
    public static void main(String[] args) {
        int a[]={1,3,2,9,2,9,7};
        se(a);

    }
}
