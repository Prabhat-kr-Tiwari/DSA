package stackproblem1;

import java.util.ArrayDeque;

import static stackproblem1.InfixPrefixPostfix.infixToPostfix;
import static stackproblem1.InfixPrefixPostfix.isOperator;

public class evaluatepostfix {

    static int calculate(int a,int b,char c)
    {
        switch (c)
        {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }

    static int evaluatePostfix(String s) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++) {
            char cur = s.charAt(i);
            if(isOperator(cur)) {
                int second = stack.pop();
                int first = stack.pop();
                int eval = calculate(first, second, cur);
                stack.push(eval);
            } else {
                stack.push(cur-'0');
            }
        }

        return stack.pop();
    }
    public static void main(String[] args) {
//		String input = "(a+b/c)*((g/e)-f)";
        String input = "(2*3)-(4/5-6+7)";
        String output = infixToPostfix(input);

        System.out.println(output);

        int evaluate = evaluatePostfix(output);
        System.out.println(evaluate);
    }


}
