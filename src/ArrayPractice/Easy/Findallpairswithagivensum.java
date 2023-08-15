package ArrayPractice.Easy;


import java.util.ArrayList;
import java.util.List;

class Pair  {
    long first, second;
    public Pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
public class Findallpairswithagivensum {



    public static Pair[] allPairs(long A[], long B[], long N, long M, long X) {
        List<Pair> pairList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i] + B[j] == X) {
                    Pair newPair = new Pair(A[i], B[j]);
                    pairList.add(newPair);
                }
            }
        }

        return pairList.toArray(new Pair[0]);
    }
    static Pair[] sumpair(long[] A, long[] B, long N, long M, long X){
        List<Pair>pairList=new ArrayList<>();
        int left=0;
        int right= (int) (M-1);
        while (left<N&&right>=0){
            long sum=A[left]+B[right];
            if (sum==X){
                pairList.add(new Pair(A[left],B[right]));
                left++;
                right--;
            } else if (sum<X) {
                left++;
                
            }else{
                right--;
            }

        }
        return pairList.toArray(new Pair[0]);
    }
    static boolean binarysearch(int a[],int start,int end,int target){

        while (start<end){
            int mid=start+(end-start)/2;
            if (a[mid]==target){
                return true;
            } else if (a[mid]<target) {
                start=mid+1;


            }if(a[mid]>start) {
                end=mid-1;
            }
        }
        return false;
    }

static void pairs2(long A[], long B[], long N, long M, long X) {
    List<List<Long>> ans = new ArrayList<>();
    List<Long> list;

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            if (A[i] + B[j] == X) {
                list=new ArrayList<>();

                list.add(A[i]);
                list.add(B[j]);
                ans.add(list);
            }
        }
    }

    System.out.println(ans);
}

    public static void main(String[] args) {
        long A[] = {1, 2, 4, 5, 7};
        long B[] = {5, 6, 3, 4, 8};
        long X = 9;
        //System.out.println(Arrays.toString(allPairs(A, B, A.length, B.length, X)));

        Findallpairswithagivensum finder = new Findallpairswithagivensum();
        Pair[] pairs = finder.sumpair(A, B, A.length, B.length, X);

        for (Pair pair : pairs) {
            System.out.println(pair);
        }
        //System.out.println(sumpair(A, B, A.length, B.length, X));




    }
}
