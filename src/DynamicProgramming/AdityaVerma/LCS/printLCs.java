package DynamicProgramming.AdityaVerma.LCS;

import java.util.Arrays;

public class printLCs {






    static String printLcs(String x,String y,int n,int m){


        int t[][]=new int[n+1][m+1];
        for (int i = 0; i <=n ; i++) {
            Arrays.fill(t[i],0);
        }
        return printLcs(x,y,n,m,t);

    }
    static String printLcs(String x,String y,int n,int m,int t[][]){
        StringBuilder s= new StringBuilder();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=m ; j++) {
                if (x.charAt(i-1)==y.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                }else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }



        int i=n,j=m;
        while (i>0&&j>0){
            if (x.charAt(i-1)==y.charAt(j-1)){
                s.append(x.charAt(i-1));
                i--;
                j--;
            }else {
                if (t[i][j-1]>t[i-1][j]){

                    j--;
                }else {
                    i--;
                }
            }
        }
        return s.reverse().toString();

    }

    public static void main(String[] args) {
        String x="acbcf";
        String y="abcdaf";
        System.out.println(printLcs(x,y,x.length(),y.length()));
    }

}
