package StackAndQueue;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String test ="({[})";
        Stack<Character> stack= new Stack<>();
        boolean check= true;
        for(char c: test.toCharArray()){
            if("({[".indexOf(c) != -1){
                stack.push(c);
            } else if ("]})".indexOf(c) != -1) {
                if(stack.isEmpty()){
                    check = false;
                }
                char top = stack.pop();
                if((c == ')' && top != '(') ||(c == '}' && top !='{')||(c ==']' && top != '[')){
                    check = false;
                }
            }
        }
        System.out.println("Balanced:"+ check);
    }

}
