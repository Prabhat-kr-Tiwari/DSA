package string2.practice;

/*Input:
        S = i.like.this.program.very.much
        Output: much.very.program.this.like.i
        Explanation: After reversing the whole
        string(not individual words), the input
        string becomes
        much.very.program.this.like.i*/

public class reversewordsinstringgfg {
    static String reverseWords(String S)
    {
        // code here
        String sentence = "";
        String word = "";

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) != '.'){
                word = word + S.charAt(i);
            }
            else{
                sentence = "." + word + sentence;
                word = "";
            }
        }
        sentence = word + sentence;
        return sentence;
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));

    }
}
