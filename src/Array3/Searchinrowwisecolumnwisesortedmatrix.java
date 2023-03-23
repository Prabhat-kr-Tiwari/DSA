package Array3;

public class Searchinrowwisecolumnwisesortedmatrix {

    static boolean searchInmatrix(int a[][],int key){

        int i=0;
        int j =a.length;
        while (i<a.length&&j>=0){
            if (a[i][j]==key){
                System.out.println("true");
                System.out.println(i);
                System.out.println(j);

                return true;

            }else if(key>a[i][j]){
                i++;
            }else{
                j--;

            }
        }
        System.out.println("false");
        System.out.println(i);
        System.out.println(j);
        return false;

    }

    public static void main(String[] args) {
        int a[][]={{ 3, 30, 38},
                {36, 43, 60},
                {40, 51, 69}};
        int key=3;
        int b[][]={{1,3}};
        System.out.println(searchInmatrix(b,key));
    }
}
