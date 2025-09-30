package Collection_Framework.Stack;

import java.util.Stack;

public class Demo2 {
    public static void main(String[] args) {
        String expression1 = "[{()}]";
        String expression2 = "[{()}";

        System.out.println(isExpressionBalanced(expression1));
        System.out.println(isExpressionBalanced(expression2));

    }

    private static boolean isExpressionBalanced(String expression) {
        Stack <Character> stack=new Stack<>();
        for(char ch : expression.toCharArray()){

            if (ch == '(' || ch == '{' || ch== '[') {
                stack.push(ch);
            } else if (ch==')'||ch=='}'||ch==']') {
                if (stack.isEmpty()){
                    return  false;
                }

                char top=stack.pop();
                if (    (ch==')'&& top!='(')||
                        (ch=='}'&& top!='{')||
                        (ch==']'&& top!='[')){
                    return  false;
                }
            }
        }
        return stack.isEmpty();
    }
}
