public class test {

}
class Main
{
    public static void main (String[] args)
    {
        int arr1[] = {1, 2, 6, 3, 7};
        int arr2[] = {10, 7, 45, 3, 7};
        int n = arr1.length;

        //Sort arr1 in ascending order
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){ if(arr1[i]>arr1[j]){
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
            }
            }
        }
        for (int e:arr1
             ) {
            System.out.print(e+" ");

        }

        //Sort arr2 in descending order
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr2[i]<arr2[j]){
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        System.out.println();
        for (int e:arr2
        ) {
            System.out.print(e+" ");

        }

        int product = 0;
        for(int i=0; i<n; i++)
            product += arr1[i]*arr2[i];

        System.out.println();
        System.out.print(product);
    }
}
