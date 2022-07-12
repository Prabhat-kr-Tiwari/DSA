package string2.practice;

import java.util.Stack;

public class validsubstring {
        static int findMaxLen(String s) {

            if(s==null || s.length()<2){
                return 0;
            }

            Stack<Integer> st =new Stack<>();

            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '('){
                    st.push(i);
                }
                else{

                    if(!st.empty() && s.charAt(st.peek()) == '('){

                        st.pop();
                    }

                    else {

                        st.push(i);
                    }
                }
            }

            int max = 0;
            int end = s.length();

            while(!st.empty()){
                int ele  = st.pop();
                max = Math.max(max, end - ele - 1);
                end = ele;
            }

            return Math.max(end, max);
        }

    public static void main(String[] args) {
        System.out.println(findMaxLen("(()("));

    }

}
