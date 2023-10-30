package GreedyAlgorithm.Practice.Basic;

public class TheSpiderSteps {



   /* Input:
    H = 200, U = 50, D = 1
    Output: 5
    Explaination:
    First Step: 50 -1 = 49
    Second Step: 49 + 50 - 1 = 98
    Third Step: 98 + 50 - 1 = 147
    Fouth Step: 147 + 50 - 1 = 196
    Fifth Step: Reach beyond H.*/

    static int minStep(int H, int U, int D){
        int currentHeightReach=0;
        int step=0;
        while (currentHeightReach < H) {

            currentHeightReach += U;
            step++;

            if (currentHeightReach >= H) {
//                return step;
                break;
            }else {
                currentHeightReach -= D;
            }
        }
        return step;
    }
    static int minStep2(int H, int U, int D){
        int sum=U;int count=1;
        while(sum<=H){
            sum=sum-D;
            count++;
            sum=sum+U;
        }
        return count;
    }



    public static void main(String[] args) {

//      int  H = 200, U = 50, D = 1;
        int H=500,U= 20,D= 15;
//        int H = 100, U = 5, D = 3;
        System.out.println(minStep2(H,U,D));
    }
}
