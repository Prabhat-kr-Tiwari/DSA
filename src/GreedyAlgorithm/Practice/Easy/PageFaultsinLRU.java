package GreedyAlgorithm.Practice.Easy;

import java.util.HashMap;
import java.util.Map;

public class PageFaultsinLRU {


    static void pageFaults(int N, int C, int pages[]){
        // code here

        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i = 0; i < C; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = i; k < C; k++) {
                if (k != C - 1) {

                    System.out.print(pages[i] + "");
                    if (hm.containsKey(pages[i])){
                        hm.put(pages[i],hm.get(pages[i])+1);
                    }else {
                        hm.put(pages[i],1);
                    }



                } else {
                    System.out.print(pages[i]);
                    if (hm.containsKey(pages[i])){
                        hm.put(pages[i],hm.get(pages[i])+1);
                    }else {
                        hm.put(pages[i],1);
                    }
                }
            }

            System.out.println();
        }

        System.out.println(hm);

        int highestfrequency=0;

        System.out.println("highestfrequency"+highestfrequency);

        for (int i = C; i <N ; i++) {
            if(!hm.containsKey(pages[i])){
                for (Map.Entry<Integer, Integer> entry : hm.entrySet())
                {

                    System.out.println(entry.getKey() + " " + entry.getValue());
                    if (entry.getValue()>highestfrequency){
                        highestfrequency=entry.getKey();
                    }

                }
                hm.remove(highestfrequency);

            }


        }


        //

        for (int i = C; i < N; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = i; k < N; k++) {
                if (k != N - 1) {

                    System.out.print(pages[i] + "");
                    if (hm.containsKey(pages[i])){
                        hm.put(pages[i],hm.get(pages[i])+1);
                    }else {
                        hm.put(pages[i],1);
                    }



                } else {
                    System.out.print(pages[i]);
                    if (hm.containsKey(pages[i])){
                        hm.put(pages[i],hm.get(pages[i])+1);
                    }else {
                        hm.put(pages[i],1);
                    }
                }
            }

            System.out.println();
        }


    }

    public static void main(String[] args) {
       int N = 9, C = 4;
       int [] pages = {5, 0, 1, 3, 2, 4, 1, 0, 5};
      pageFaults(N,C,pages);








    }
}
