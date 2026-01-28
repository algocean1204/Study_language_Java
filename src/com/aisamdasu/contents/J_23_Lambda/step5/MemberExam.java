package com.aisamdasu.contents.J_23_Lambda.step5;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MemberExam {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("java");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("java", "java");
    }
}
