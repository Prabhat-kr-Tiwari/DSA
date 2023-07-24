package Top100Codes.ImportantCodesrelatedtoArrays;

public class smallestlargestinarray {

    static void smallest(int a[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.println(min);
    }
    static void largest(int a[]){
        int  n=a.length;
        int i = 0;
        int largest=Integer.MIN_VALUE;
        for (; i < n ; i++) {
            if (a[i]>largest){
                largest=a[i];
            }

        }
        System.out.println("Largest is "+largest);
    }
    static void largestsmallest(int a[]){
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if (smallest>a[i]){
                smallest=a[i];
                if (smallest>largest){
                    largest=smallest;
                }
            }


        }
        System.out.println(largest);
        System.out.println(smallest);
    }
    public static void main(String[] args) {
        int arr[] = {1223, -3, 1, 10, 134, -9};
        largestsmallest(arr);

    }
}
