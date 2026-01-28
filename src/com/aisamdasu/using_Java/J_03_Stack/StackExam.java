package com.aisamdasu.using_Java.J_03_Stack;

public class StackExam {
    public static void main(String[] args) {
        try{
            DLLStack<String> stack = new DLLStack<>();
            stack.push("1");
            stack.push("2");
            stack.push("3");
            stack.push("4");
            stack.push("5");
            while(!stack.isEmpty()){
                String s = stack.pop();
                System.out.println(s);
            }
            System.out.println("===================");
            stack = new DLLStack<String>();
            stack.push("33");

            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
