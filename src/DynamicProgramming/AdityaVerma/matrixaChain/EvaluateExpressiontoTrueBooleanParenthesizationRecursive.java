package DynamicProgramming.AdityaVerma.matrixaChain;

public class EvaluateExpressiontoTrueBooleanParenthesizationRecursive {


    static int solve(String s,int i,int j,boolean isTrue){

        int ans=0;

        if (i>j) return 0;

        if (i==j){
            if (isTrue&&s.charAt(i)=='T'){
                return 1;
            }
            if (!isTrue&&s.charAt(i)=='F'){
                return 1;
            }
//            return 0;

        }

        for (int k=i+1;k<=j-1;k+=2){
            int lt=solve(s,i,k-1,true);
            int lf=solve(s,i,k-1,false);
            int rt=solve(s,k+1,j,true);
            int rf=solve(s,k+1,j,false);

            if (s.charAt(k)=='&'){
                if (isTrue){
                    ans+=lt*rt;
                }else{
                    //for false
                    ans+=lf*rt+lf*rf+lt*rf;
                }
            }
           else  if(s.charAt(k)=='|'){
                if (isTrue){
                    ans+=lt*rf+lt*rt+lf*rt;
                }else{
                    ans+=lf*rf;
                    
                }
            } else if (s.charAt(k)=='^') {
                if (isTrue){
                    ans+=lf*rt+lt*rf;

                }else{
                    ans+=lt*rt+lf*rf;
                }
            }


        }

        return ans;
    }
    public static void main(String[] args) {

//       String s ="T|T&F^T";
       String s ="T^F|F";
        System.out.println(solve(s,0,s.length()-1,true));
    }
}


