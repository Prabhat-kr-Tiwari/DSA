package Array4Matrix;

public class findtwonumberwithgivensum {

    static boolean givenSum(int a[],int sum){

        int n=a.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {

                if (a[i]+a[j]==sum){
                    return true;
                }


            }

        }
        return false;
    }

    public static void main(String[] args) {
        int a[]={1,2,7,8,10,12};
        System.out.println(givenSum(a,-1));
    }

}
