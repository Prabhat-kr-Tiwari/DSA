package sortingalgorithmpart1;

import static sortingalgorithmpart1.bubblesort.swap;

public class selectionssort {


    static void Selectionsort(int a[])
    {
        for (int i = 0; i <a.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[min])
                {
                    min=j;
                }
                
            }
            swap(a,min,i);
            
        }
    }

    public static void main(String[] args) {
        int a[]={1,3,1,8,9};
        Selectionsort(a);
        for (int e:a
             ) {
            System.out.println(e);

        }
    }
}
