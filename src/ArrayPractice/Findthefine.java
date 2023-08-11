package ArrayPractice;

public class Findthefine {

    public static long totalFine( long n, long date, long car[], long fine[])
    {
        int ans=0;


        if(date%2==0){

            for(int i=0;i<n;i++){
                if (car[i]%2!=0){

                    ans+=fine[i];
                }
            }

        }else{

            for(int i=0;i<n;i++){
                if (car[i]%2==0){
                    ans+=fine[i];
                }


            }

        }
        return ans;
    }

    public static void main(String[] args) {

       int N = 4, date = 12;
       long car[] = {2375, 7682, 2325, 2352};
      long  fine[] = {250, 500, 350, 200};
        System.out.println( totalFine(N,date,car,fine));

    }
}
