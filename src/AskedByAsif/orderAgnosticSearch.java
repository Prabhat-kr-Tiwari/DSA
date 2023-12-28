package AskedByAsif;

public class orderAgnosticSearch {


    static void bs(int a[], int target) {
        int l = 0;
        int r = a.length - 1;
        boolean isAsc = a[0] < a[r];

        while (l <=r) {
            if (a.length==1){
                if (a[0]==target){
                    System.out.println("found 0");
                    break;
                }else {
                    System.out.println("not found");
                    break;
                }
            }
            if(a.length==2){
                if(a[0]==target){
                    System.out.println("found 0");
                    break;
                } else if (a[1]==target) {
                    System.out.println("found 1");
                    break;

                }else {
                    System.out.println("not found");
                    break;
                }
            }
            int mid = (l + r) / 2;
            /*if (!isAsc||!isDsc) {
                if (a[mid + 1] < a[mid]) {
                    isDsc = true;
                   // l = mid - 1;
                } else {
                    isAsc = true;
                   // r = mid - 1;
                }
            }*/

            if (a[mid] == target) {
                System.out.println("found" + mid);
                break;

            } else if (a[mid] > target) {
                if (isAsc) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (isAsc) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        //System.out.println("not found");
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,9,10};
        bs(a, 10);

    }
}
