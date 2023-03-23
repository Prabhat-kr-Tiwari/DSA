package QuestionSheet;

public class reversearray {

    static void rev(int arr[])
    {
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");

        }
    }
    static void reva(int a[])
    {
        int x[]=new int[a.length];
        int j=a.length;
        for (int i = 0; i < a.length ; i++) {
            x[j-1]=a[i];
            j--;
        }
        for (int e:x
             ) {
            System.out.print(e+" ");

        }
    }

    static void swap(int arr[],int first,int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3};
        reva(arr);
        /*for (int e:arr
             ) {
            System.out.println(e);

        }*/
    }
}
