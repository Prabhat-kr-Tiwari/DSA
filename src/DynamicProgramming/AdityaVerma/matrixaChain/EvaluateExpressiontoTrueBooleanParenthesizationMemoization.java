package DynamicProgramming.AdityaVerma.matrixaChain;

import java.util.HashMap;

public class EvaluateExpressiontoTrueBooleanParenthesizationMemoization {



    static int solve(String s, int i, int j, boolean isTrue){
        HashMap<String ,Integer>hm=new HashMap<>();
        

        return solveDp(s,i,j,isTrue,hm);


    }
    static int solveDp(String s, int i, int j, boolean isTrue, HashMap<String ,Integer> hm){

        int ans=0;
        if(i>j) return 0;
        if(i==j){
            if(isTrue&&s.charAt(i)=='T'){
                return 1;
            }
            if (!isTrue&&s.charAt(i)=='F'){
                return 1;
            }
        }
        // Memoization key generation
        String key = i + " " + j + " " + isTrue;

        // Check if the result is already computed
        if (hm.containsKey(key)) {
            return  hm.get(key);
        }

        for (int k = i+1; k <=j-1 ; k+=2) {
            int lt=solveDp(s,i,k-1,true,hm);
            int lf=solveDp(s,i,k-1,false,hm);
            int rt=solveDp(s,k+1,j,true,hm);
            int rf=solveDp(s,k+1,j,false,hm);
            
            if (s.charAt(k)=='&'){
                if (isTrue){
                    ans+=lt*rt;
                }else{
                    ans+=lt*rf+lf*rt+lf*rf;
                }


            } else if (s.charAt(k)=='|') {
                if (isTrue){
                    ans+=lt*rf+lf*rt+lt*rt;
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

         hm.put(key,ans);
        return ans;
        
        
    }
    public static void main(String[] args) {

       String s ="T|T&F^T";
//        String s ="T^F|F";
        System.out.println(solve(s,0,s.length()-1,true));
    }
    
}
