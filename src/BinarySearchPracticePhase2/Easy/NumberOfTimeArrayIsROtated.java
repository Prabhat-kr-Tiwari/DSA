package BinarySearchPracticePhase2.Easy;

public class NumberOfTimeArrayIsROtated {



    static int  rotation(int a[]){
        int l=0;
        int end=a.length;
        int count=0;
        while (l<end){
            int mid=l+(end-l)/2;
            if(a[mid]<a[mid-1]&&a[mid]<a[mid+1]){
                return mid;

            } else if (a[mid]>a[mid-1]&&a[mid]>a[mid+1]) {
                l++;

            }else {
                end--;
            }
        }
        return count;
    }
    static int peek(int a[]){
        int l=1;
        int i=0;
        int count=0;
        int r=a.length-1;
        int n=a.length-1;

        for (int j = 0; j <a.length-1; j++) {

            if (a[j+1]>a[j]){
                count++;
            }
        }
        if (count==a.length-1){
            return a.length;
        }
        while (l<r){

            int mid=l+(r-l)/2;

            if (a[mid]>a[mid+1]&&a[mid]>a[mid-1]){
                return mid;
            } else if (a[mid]>a[mid-1]) {
                l++;

            }else{
                r--;
            }
        }

        return -1;
    }

    static boolean searchInASortedRotatedArray(int a[],int target){

        int rightl=0;
        int righte=0;
        int leftl=0;
        int lefte=0;
        int l=0;
        int r=a.length;

        while (l<r){
            int mid=l+(r-l)/2;
            if (a[mid]==target){
                return true;

            } else if (a[mid]<target&&a[mid-1]>a[mid]) {
                /*l=mid+1;
                if (a[l]==target){
                    return true;
                }*/
                leftl=mid+1;
                lefte= a.length;
                while (leftl<lefte){

                    int midl=leftl+(lefte-leftl)/2;
                    if (a[midl]==target){
                        return true;
                    } else if (a[midl]>target) {
                        lefte=midl-1;

                    }else {
                        leftl=midl+1;
                    }
                }
                //return false;



            }else {
               /* r=mid-1;
                if (a[r]==target){
                    return true;
                }*/
                righte=mid-1;
                rightl=0;
                while (rightl<righte){
                    int midr=rightl+(righte-rightl)/2;
                    if (a[midr]==target){
                        return true;
                    } else if (a[midr]>target) {
                        righte=midr-1;

                    }else {
                        rightl=midr+1;
                    }

                }
                //return false;

            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int a[]={6,7,0,1,2};
        int a[]={1,2,3};
        //System.out.println(rotation(a));
        System.out.println(peek(a));

    }
}
