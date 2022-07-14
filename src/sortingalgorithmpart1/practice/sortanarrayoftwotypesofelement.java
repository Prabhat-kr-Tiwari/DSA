package sortingalgorithmpart1.practice;



public class sortanarrayoftwotypesofelement {
    //using two pointer approach

    static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;

    }
    static void sort2(int a[])
    {
        int left=0;
        int right=a.length-1;
        while (left<right)
        {
            while (a[left]==0&&left<right)
            {
                left++;
            }
            while (a[right]==1&&left<right)
            {
                right--;
            }
            if (left < right)
            {
                a[left] = 0;
                a[right] = 1;
                left++;
                right--;
            }
        }

    }

    static void sort(int a[])
    {
        int count=0;
        int n=a.length;
        for (int i = 0; i <n ; i++) {
            if (a[i]==0)
            {

                count++;
            }

        }
        for (int i = 0; i < count; i++) {
            a[i]=0;

        }
        for (int i = count; i < n; i++) {
            a[i]=1;

        }
    }


    public static void main(String[] args) {
        int a[]={0,1,0,1,0,1,0,0,0,0,0};
        /*sort(a);
        for (int e:a
             ) {
            System.out.println(e);

        }*/
        System.out.println("2");
        sort2(a);
        for (int x:a
             ) {
            System.out.println(x);

        }

    }
}
