package com.codewithzia;

import java.util.Stack;

public class App {
    public static void main(String[] args){
        // Stack<Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack);
        // var top = stack.pop();
        // System.out.println(top);
        // top = stack.peek();
        // System.out.println(top);
        
        //StringReverser class
        // String str = "abcd";
        // StringReverser reverser = new StringReverser();
        // var result = reverser.reverse(str);
        // System.out.println(result);


        //Only paranthesis
        //(
        //(()
        //)(
        // String str = ")1 + 2(";
        // Expression exp = new Expression();
        // var result = exp.isBalanced(str);
        // System.out.println(result);

        //Multiple braces
        String str = "(1 + 2}";
        Expression exp = new Expression();
        var result = exp.isBalanced(str);
        System.out.println(result);
        
    }
}
