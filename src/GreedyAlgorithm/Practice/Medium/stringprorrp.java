package GreedyAlgorithm.Practice.Medium;

import java.util.ArrayDeque;
import java.util.Stack;

public class stringprorrp {


    // Function to swap two strings using an array
    public static void swapStrings(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }


    static long solve(int X,int Y, String S)
    {
        // code here
        long answer=0;
        String a="pr";
        String b="rp";


        String[] strings = { a, b };

        if(X<Y){

            int temp=X;
            X=Y;
            Y=temp;
            swapStrings(strings);
            a=strings[0];
            b=strings[1];

        }
        ArrayDeque<Character> st=new ArrayDeque<>();
        for (int i = S.length()-1; i >=0 ; i--) {
            System.out.println(st);
            if(st.size()>0&&S.charAt(i)==a.charAt(0)&&st.peekLast()==a.charAt(1)){
                st.pollLast();
                answer+=X;
            }else{
                st.addLast(S.charAt(i));
            }

        }

        StringBuilder newString= new StringBuilder();
        while (st.size()>0){
            newString.append(st.pollLast());

        }

        S= newString.toString();
        System.out.println(S);
        for (int i = S.length()-1; i >=0 ; i--) {
            if(st.size()>0&&S.charAt(i)==b.charAt(0)&&st.peekLast()==b.charAt(1)){
                st.pollLast();
                //System.out.println("here");
                answer+=Y;
            }else{
                st.addLast(S.charAt(i));
            }

        }
        return answer;



    }

    public static void main(String[] args) {
      /* int  X = 5, Y = 4;
        String S = "abppprrr";*/
      /* int X= 7,Y= 7;
        String S="prpptppr";*/

        int X= 6,Y= 8;
        String S="orzprqrd";
//       System.out.println(solve(X,Y,S));
        ArrayDeque<Character> st=new ArrayDeque<>();
        st.addLast('a');
        st.addLast('b');
        st.addLast('c');
        System.out.println(st);
        System.out.println("peek->    "+st.peek());
        System.out.println("peeklast->    "+st.peekLast());
        System.out.println("polllast=>"+ st.peekLast());

        ArrayDeque<Character> st1=new ArrayDeque<>();
        st1.push('a');
        st1.push('b');
        st1.push('c');
        System.out.println(st1);
        System.out.println("peek->    "+st.peek());
        System.out.println("peeklast->    "+st.peekLast());
        System.out.println("polllast=>"+ st.peekLast());



    }
}
