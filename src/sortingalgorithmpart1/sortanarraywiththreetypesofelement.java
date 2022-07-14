package sortingalgorithmpart1;

public class sortanarraywiththreetypesofelement {
    static void sort(int a[])
    {
        int count=0;
        int count1=0;
        int count2=0;
        int n=a.length;
        for (int i = 0; i <n ; i++) {
            if (a[i]==0)
            {


                count++;
                System.out.println("count 0  "+count);
            }
            if (a[i]==1)
            {

                count1++;
                System.out.println("count 1  "+count1);
            }
            if (a[i]==2)
            {
                count2++;
                System.out.println("count 2  "+count2);
            }

        }
        for (int i = 0; i < count; i++) {
            System.out.println("a[0]"+a[i]);
            a[i]=0;


        }
        for (int i = count; i < count1; i++) {
            System.out.println("a[1]"+a[i]);
            a[i]=1;
        }
        for (int i = count1; i <n ; i++) {
            System.out.println("a[2]"+a[i]);
            a[i]=2;

        }

    }

    public static void main(String[] args) {
        int a[]={0,0,1,0,2,0,1,0,2,2,0,1};
        sort(a);
        for (int x:a
             ) {
            System.out.print(x);

        }

    }
}
