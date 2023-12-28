package GreedyAlgorithm.Practice.Medium;


import java.util.Arrays;
import java.util.Comparator;

class Pair
{
    int x;
    int y;

    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}
public class MaxLengthChain {



    static void maxChainLength(Pair arr[], int n)
    {
        // your code here
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.y-o2.y;
            }
        });
        int ans=1;
        int currend=arr[0].y;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].x>currend){
                currend=arr[i].y;
                ans++;
            }

        }

        System.out.println("ans"+ans);
        for (Pair pair : arr) {
            System.out.println("(" + pair.x + ", " + pair.y + ")");
        }

    }

    public static void main(String[] args) {

        Pair[] pairs = new Pair[5]; // Creating an array of Pair objects with size 4


        // Adding elements to the Pair array
        pairs[0] = new Pair( 5 , 24 );
        pairs[1] = new Pair(39 ,60 );
        pairs[2] = new Pair(15 ,28 );
        pairs[3] = new Pair(27, 40);
        pairs[4] = new Pair(50 ,90);
        maxChainLength(pairs,pairs.length);


    }
}
