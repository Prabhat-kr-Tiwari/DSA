/*

package HashingProblempart1;

import java.util.HashSet;
import java.util.Set;

public class longestconsecutivesubsequence {


    static int Longest(int a[]) {

        Set<Integer> set = new HashSet<>();
        int ans = 1;

        for (int e : a
        ) {
            set.add(e);

        }
        for (int e : set
        ) {
            if (!set.contains(e - 1)) {
                int len = 1;
                while (set.contains(++e)) {
                    len++;
                }
                ans = Math.max(ans, len);

            }


        }
        return ans;

    }

    static int dounion(int a[], int b[], int n, int m) {

        int count = n + m;
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int e : a
        ) {
            set.add(e);

        }
        for (int x : b
        ) {
            set1.add(x);

        }
        Object[] myArray = new Object[set1.size()];
        myArray = set1.toArray();
        for (int i = 0; i < set.size(); i++) {
            for (int j = 0; j < set1.size(); j++) {
                if (set.contains(myArray[j])) {
                    count++;
                }

            }

        }


*/
/* for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
               *//*
*/
/*
*//*

*/
/* if (i==j)
                {*//*
*/
/*
*//*

*/
/*
                    if (a[i]==b[j])
                    {
                        count--;
                    }
               *//*
*/
/*
*//*

*/
/* }*//*
*/
/*
*//*

*/
/*


            }

        }
        return count;
    }





    public static void main(String[] args) {
        //int a[]={2,1,9,3,5,4,8,7,2,1,3,6};
        //System.out.println(Longest(a));
        int a[]={1,1,2,3,4,5};
        int b[]={4,5,6,7};
        System.out.println(dounion(a,b,5,4));
    }



    }
}

*/
