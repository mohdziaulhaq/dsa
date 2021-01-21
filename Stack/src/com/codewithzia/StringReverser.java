package com.codewithzia;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        Stack<Character> stack = new Stack<>();
        if(input == null)
        throw new IllegalArgumentException();
        // for(int i=0; i<input.length(); i++){ //one way
        //     stack.push(input.charAt(i));
        // }

        for (char ch : input.toCharArray()) { //another way
            stack.push(ch);
        }

        StringBuffer reversed = new StringBuffer();
        while(!stack.empty()){
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
