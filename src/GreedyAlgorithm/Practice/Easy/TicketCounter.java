package GreedyAlgorithm.Practice.Easy;

import java.util.ArrayDeque;

public class TicketCounter {



    static int newfirst=1;
    public static int  distributeTicket(int N,int K)
    {
        int first=1;
        int last=0;
         newfirst=1;
        int newlast=N-K+1;
        int newK=K;

        ArrayDeque<Integer>arrayDeque=new ArrayDeque<>();
        arrayDeque.size();
        for (int i = 0; i <K ; i++) {
            while (arrayDeque.size()<=N){

                newK=K;
                first=newfirst;
                System.out.println("first  "+first);
                while (newK>0){
                    arrayDeque.push(first);
                    first++;
                    newK--;
                }
                if (arrayDeque.size()==N){
                    return arrayDeque.peek();
                }
                newK=K;
                newfirst=arrayDeque.peek()+1;
                System.out.println("first Array deque  "+arrayDeque);
                System.out.println("newfirst"+newfirst);

                if(N-K<K){
                    return arrayDeque.peek()+1;
                }
                last=newlast;

                while (newK>0){

                    arrayDeque.push(last);

                    last++;
                    newK--;
                }
                newlast=arrayDeque.peek()-1;
                System.out.println("newlast"+newlast);
                System.out.println("last Array deque  "+arrayDeque);
                if (arrayDeque.size()==N){
                    return arrayDeque.peek();
                }
            }



        }

        return -1;


    }
    public static void main(String[] args) {
        System.out.println(distributeTicket(14,9));

    }
}
