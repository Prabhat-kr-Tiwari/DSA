package array1;


/*public class thirdlargest {
    static int thirdlar(int a[])
    {
        if (a.length<3) return -2;
        int largest=0;
        int secondlargest=-1;
        int thirdlargest=-2;
        for (int i=1;i<a.length;i++)
        {
            if (a[i]>a[largest])
            {
                thirdlargest=secondlargest;
                secondlargest=largest;
                largest=i;
            }
            else if(a[i]>a[secondlargest])
            {
                *//*if (secondlargest==-1||a[secondlargest]<a[i])
                {*//*
                    thirdlargest=secondlargest;
                    secondlargest=i;
                *//*}*//*
            }
            else if(a[i]>a[thirdlargest])
            {
                *//*if (thirdlargest==-1||a[thirdlargest]<a[secondlargest])
                {*//*
                    thirdlargest=i;
                *//*}*//*
            }
        }
        return thirdlargest;
    }
    public static void main(String[] args)
    {
        int a[]={12,32,3,22};
        int index=thirdlar(a);

        System.out.println(a[index]);
       // System.out.println(a[seconlar(a)]);

    }
}*/
public class thirdlargest {
    public static int thirdLargest(int a[]){
        if (a.length < 3) return -2;
        int largest = 0;
        int secondLargest = -1;
        int thirdLargest = -2;

        for (int i = 1; i <a.length; i++) {
            if (a[i] > a[largest]){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = i;
            } else if (a[i] > a[secondLargest]) {
//                if (secondLargest == -1 || a[i] > a[secondLargest]);
                thirdLargest = secondLargest;
                secondLargest = i;

            } else if (a[i] > a[thirdLargest]) {
                thirdLargest = i;
            }
        }
        return thirdLargest;

    }


    public static void main(String[] args) {

        int a[]={1,32,43,2};

        int index = thirdLargest(a);
        System.out.println(a[index]);

    }
}
