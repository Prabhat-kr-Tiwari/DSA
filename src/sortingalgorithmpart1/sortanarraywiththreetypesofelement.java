package sortingalgorithmpart1;

public class sortanarraywiththreetypesofelement {
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
    static void swapNumbers(int x, int y)
    {
//swapping logic
        x = x ^ y ^ (y = x);
//prints the result
       // System.out.println("After swapping values of x and y are: "+ x + ", " + y);
    }

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
            else if (a[i]==1)
            {

                count1++;
                System.out.println("count 1  "+count1);
            }
            else if (a[i]==2)
            {
                count2++;
                System.out.println("count 2  "+count2);
            }

        }
        for (int i = 0; i < count; i++) {
            System.out.println("a[0]"+a[i]);
            a[i]=0;


        }
        for (int i = count; i < (count+count1); i++) {
            System.out.println("a[1]"+a[i]);
            a[i]=1;
        }
        for (int i = ( count+count1); i <n ; i++) {
            System.out.println("a[2]"+a[i]);
            a[i]=2;

        }

    }
    static void dutchFlagSortingAlgorithm(int[] a)
    {
        int n=a.length;
        int low=0;
        int mid=0;
        int high=n-1;
        int temp=0;
        while (mid<=high)
        {
           /* if(a[mid]==0)
            {
                //swap(a[low],a[mid]);
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                low++;
                mid++;

            }
            else if (a[mid]==1)
            {
                mid++;
            }
            else if (a[mid]==2)
            {
                //swap(a[mid],a[high]);
                 temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                high--;
            }*/
            switch (a[mid]) {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            }
        }


    }
    static void dutchFlagSortingAlgorithm2(int[] a)
    {
        int n=a.length;
        int low=0;
        int mid=0;
        int high=n-1;
        int temp=0;
        while (mid<=high)
        {
            if(a[mid]==0)
            {
                swapNumbers(a[low],a[mid]);
                //swap(a[low],a[mid]);
                    /*temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;*/
                low++;
                mid++;

            }
            else if (a[mid]==1)
            {
                mid++;
            }
            else if (a[mid]==2)
            {
                swapNumbers(a[mid],a[high]);
                //swap(a[mid],a[high]);
                 /*temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;*/
                high--;
            }

        }


    }
    static void printArray(int[] arr, int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] a ={0,0,1,0,2,0,1,0,2,2,0,1};
        /*sort(a);
        for (int x:a
             ) {
            System.out.print(x);

        }*/
        dutchFlagSortingAlgorithm(a);
        printArray(a,a.length);
        dutchFlagSortingAlgorithm2(a);
        printArray(a,a.length);

        /*for (int x:a
        ) {
            System.out.print(x);

        }*/

    }
}
