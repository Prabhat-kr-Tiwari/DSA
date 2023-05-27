package LeetCodeFaraz.Array.Medium;

public class MaximumPointsYouCanObtainfromCards {
    public static int maxScore(int[] cardPoints, int k) {
        int ans=0;
        int n= cardPoints.length-1;
        int a=1;
        for (int i = 0; i < cardPoints.length; i++) {
            while (a<=k)
            {
                ans=Math.max(cardPoints[i],cardPoints[n]);
                a++;
                n--;


            }

        }
        return  ans;

    }

    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(cardPoints,k));

    }
}
