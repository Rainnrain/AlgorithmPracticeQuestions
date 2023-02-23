package com.cydeo.List;

import java.util.ArrayList;
import java.util.Stack;

public class Math {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String ch : tokens ){

            if(ch .equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(ch .equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }else if(ch .equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(ch .equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else {
                stack.push(Integer.valueOf(ch));
            }

        }
        return stack.pop();
    }

}
