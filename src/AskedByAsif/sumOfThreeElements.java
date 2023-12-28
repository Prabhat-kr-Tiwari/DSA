package AskedByAsif;

public class sumOfThreeElements {



    static void sum(int a[],int x){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int l = j; l < a.length; l++) {
                    if (i!=j&&j!=l&&l!=i){
                        if ((a[i]+a[j]+a[l])==x){
                            System.out.println(a[i]);
                            System.out.println(a[j]);
                            System.out.println(a[l]);
                            System.out.println("find");

                        }
                    }

                }

            }

        }
    }

    public static void main(String[] args) {
        int a[]={1,4,45,6,10,8};
        sum(a,13);

    }
}
