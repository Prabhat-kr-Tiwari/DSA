package stackproblem1;

import java.util.ArrayDeque;

public class InfixPrefixPostfix {
     static boolean isOperator(char c) {
        return c=='+'||c=='-'||c=='*'||c=='/';
    }
    static int precedence(char c)
    {
        if(c=='+'||c=='-') return 1;
        else if (c=='*'||c=='/') return 2;
        else return -1;
    }
    static String infixToPostfix(String s)
    {
        StringBuilder sb=new StringBuilder();
        ArrayDeque<Character> stack=new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {

            char curr=s.charAt(i);
            if(curr=='(')
            {
                stack.push(curr);
            }else if(curr==')')
            {
                while (stack.peek()!='(')
                {
                    /*if (precedence(curr)<=precedence(stack.peek()))
                    {
                        sb.append(stack.pop());
                    }*/
                    sb.append(stack.pop());

                }
                stack.pop();

            }else if(isOperator(curr))
            {
                while (!stack.isEmpty()&&precedence(curr)<=precedence(stack.peek()))
                {
                    sb.append(stack.pop());
                }
                stack.push(curr);

            }else
            {
                sb.append(curr);
            }
        }
        while (!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(infixToPostfix("(a+b/c)*((g/e)-f"));
    }
}
