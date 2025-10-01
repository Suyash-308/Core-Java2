package Collection_Framework._4_Stack;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args){
        Stack stack=new Stack();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.size());

        System.out.println(stack.empty());

        System.out.println(stack.search(15));



    }
}
