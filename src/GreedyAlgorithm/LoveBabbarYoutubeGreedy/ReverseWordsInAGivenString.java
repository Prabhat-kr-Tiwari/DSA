package GreedyAlgorithm.LoveBabbarYoutubeGreedy;

public class ReverseWordsInAGivenString {



    //Function to reverse words in a given string.
    static String reverseWords(String S)
    {
        // code here
        String ans="";
        String temp="";

        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i) =='.'){
                temp=new StringBuilder(temp).reverse().toString();
                ans=ans+temp+".";
                temp="";

            }else{
               temp=temp+S.charAt(i);

            }
        }
        temp=new StringBuilder(temp).reverse().toString();
        ans=ans+temp;
        return ans;
    }
    public static void main(String[] args) {
       String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));

    }
}
