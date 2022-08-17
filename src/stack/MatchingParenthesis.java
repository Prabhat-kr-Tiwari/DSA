package stack;
import java.util.ArrayDeque;
public class MatchingParenthesis {
    static boolean matchingParenthesis(String s)
    {
        ArrayDeque<Character> stack=new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char cur=s.charAt(i);
            if (cur=='('||cur=='{'||cur=='[')
            {
                stack.push(cur);
                continue;
            }
            if(cur==')'||cur=='}'||cur==']')
            {
                if (stack.isEmpty()) return false;
            }
            char top;
            switch (cur)
            {
                case ')':
                     top=stack.pop();
                    if (top!='(') return false;
                    break;
                case '}':
                    top=stack.pop();
                    if (top!='{') return false;
                    break;
                case ']':
                    top=stack.pop();
                    if (top!='[') return false;
                    break;
            }
        }
        return stack.isEmpty();//ye sare operation karne ke baad stack empty hojata hai toh true return kar doo
    }
    public static void main(String[] args) {
        System.out.println(matchingParenthesis("[a()b()]"));
    }
}
