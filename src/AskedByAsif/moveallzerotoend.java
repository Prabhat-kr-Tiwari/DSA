package AskedByAsif;

public class moveallzerotoend {



    static void m(int a[]){
        int index=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>0){
//                a[index++]=a[i];
                for (int e:a
                     ) {
                    System.out.print(e);

                }
                System.out.println();
                int temp = a[index];
                        a[index] = a[i];
                                a[i] =temp;
                                index++;
            }


        }

    }

    public static void main(String[] args) {
        int a[]={0,0,1,1,0,0,1};
        m(a);
        for (int e:a
             ) {
            System.out.println(e);

        }

    }
}
