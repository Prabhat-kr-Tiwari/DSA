package BinarySearchPracticePhase2.Easy;

import java.util.ArrayList;
import java.util.List;

public class findthepeakelemnt {





    public static int findPeakElement(List<Integer> a)
    {
        //System.out.println(a.size());
        int l=0;
        int r=a.size()-1;
        while (l<=r){
            int mid=l+(r-l)/2;
           /* if (a[mid]>a[mid+1]&&a[mid]>a[mid-1]){
                return a[mid];

            } else*/ if (a.get(mid)>a.get(mid-1)) {
                l=mid+1;

            }else {
                r=mid-1;

            }
        }
        return a.get(r);



    }

    static int peek(int a[]){

        int l=0;
        int r=a.length-1;
        while (l<=r){
            int mid=l+(r-l)/2;
           /* if (a[mid]>a[mid+1]&&a[mid]>a[mid-1]){
                return a[mid];

            } else*/ if (a[mid]>a[mid-1]) {
                l=mid+1;

            }else {
                r=mid-1;

            }
        }
        return a[r];

    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,5,4,3,2,1};
        System.out.println(peek(a));
        List<Integer>al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(5);
        al.add(4);
        al.add(3);
        al.add(2);
        al.add(1);



        System.out.println(findPeakElement(al));

    }
}
