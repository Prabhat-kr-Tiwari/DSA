package GreedyAlgorithm.Practice.Easy;

public class SeatingArrangement {


    /*public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        // code here

        if (seats[0]==0&&seats[1]==0){
            n--;
        }
        for (int i = 1; i < m-1; i++) {


            int previous=i-1;
            int next=i+1;

            if (seats[i]==0&&seats[previous]==0&&seats[next]==0){
                n--;

            }
            if(n==0){
                break;
            }

        }
        return n == 0;


    }*/

    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        // code here



        for (int i = 0; i < m&& n>0 ;i++) {
            if (seats[i]==0){
                if((i==0&&m>1&&seats[i+1]==0)||(i==m-1&&seats[i-1]==0)||(seats[i-1]==0&&seats[i+1]==0)){
                    n--;
                    seats[i]=1;
                }
            }


        }
        return n == 0;


    }
    public static void main(String[] args) {

    /*  int   n = 2;
       int  m = 7;
        int seats[] = {0,0,1,0,0,0,1};*/
   /*    int n= 2;
        int m=7;
        int seats[]={0, 0, 1, 0, 0, 0, 1};*/

        int n=3;
        int m=10;
        int seats[]={0, 0, 0, 0, 0, 0, 0, 0 ,0 ,0};
        System.out.println(is_possible_to_get_seats(n,m,seats));
    }
}
