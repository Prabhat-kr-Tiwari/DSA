package DSALAB;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    static void bucketSort(float []a){
        // create bucket
        int n=a.length;
        ArrayList<Float>[]buckets=new ArrayList[n];
        // create empty buckets
        for (int i = 0; i <n ; i++) {
            buckets[i]=new ArrayList<Float>();


        }
        // add elements into our buckets
        for (int i = 0; i < n; i++) {
            int bucketindex=(int)a[i]*n;
            buckets[bucketindex].add(a[i]);


        }
        // sort each bucket individually
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);

        }
        // merge all buckets to sort final sorted array
        int index=0;
        for (int i = 0; i <buckets.length ; i++) {
            ArrayList<Float> currBucket=buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                a[index++]= currBucket.get(j);
                
            }

        }

    }


    public static void main(String[] args) {
        float[] a={0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketSort(a);
        for (float e:a
             ) {
            System.out.println(e);

        }

    }
}
