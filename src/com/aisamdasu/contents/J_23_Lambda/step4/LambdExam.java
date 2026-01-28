package com.aisamdasu.contents.J_23_Lambda.step4;
import java.util.function.ToIntBiFunction;
public class LambdExam {
    public static void main(String[] args) {
        ToIntBiFunction<String,String> function;

        function = (a,b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("Hello World", "hello world"));
        System.out.println("Hello World".compareToIgnoreCase("hello world"));

        // --------------------- 위를 다르게 표현 ----------------------------------

        function = String::compareToIgnoreCase;
        print(function.applyAsInt("Hello World", "hello world"));
    }
    public static void print(int order){
        if (order == 0){
            System.out.println("동일한 문자열");
        }
    }
}
