package BinarySearchPracticePhase2.Hard;

public class medianoftwosortedarrays {


    static double median(int a1[],int a2[]){
        int n1= a1.length;
        int n2= a2.length;
        if (n1>n2) return median(a2,a1);
        int l=0;
        int r=n1;
        while (l<=r){
            //mid for a1
            int m1=(l+r)/2;
            // mid for a2
            int m2=(n1+n2+1)/2-m1;

            // max1 and
            // min1
            int max1=m1==0?Integer.MIN_VALUE:a1[m1-1];
            int max2=m2==0?Integer.MIN_VALUE:a2[m2-1];

            int min1=m1==n1?Integer.MAX_VALUE:a1[m1];
            int min2=m2==n2?Integer.MAX_VALUE:a2[m2];
            // max2
            // min2
            if(min1>=max2&&min2>=max1){

                if ((n1+n2)%2==0){
                    return (double)(Math.max(max2,max1)+Math.min(min1,min2))/2;
                }else{
                    return (double) Math.max(max2,max1);
                }

            }
            else if(max2>min1){
                l=m1+1;


            }else{
                r=m1-1;

            }

        }
        return -1;


    }

    static double median2(int a1[],int a2[]){


        int n1= a1.length;
        int n2=a2.length;

        if(n1>n2) return median2(a2,a1);
        int l=0;
        int r=n1;



        while (l<=r){
            int m1=(l+r)/2;
            int m2=(n1+n2+1)/2-m1;
            int max1=m1==0?Integer.MIN_VALUE:a1[m1-1];
            int max2=m2==0?Integer.MIN_VALUE:a2[m2-1];


            int min1=m1==n1?Integer.MAX_VALUE:a1[m1];
            int min2=m2==n2?Integer.MAX_VALUE:a2[m2];


            if (min1>=max2&&min2>=max1){
                if((n1+n2)%2==0){
                    return (double)(Math.max(max1,max2)+Math.min(min1,min2))/2;
                }else {
                    return Math.max(max1,max2);
                }

            } else if (min1<max2) {
                l=m1+1;

            }else {
                r=m1-1;

            }

        }

        return -1;


    }



    public static void main(String[] args) {

        int a1[]={1,2,3,4};
       int a2[]={2,3,5,6,7,9,10,11};

        System.out.println(median2(a1,a2));


    }
}
