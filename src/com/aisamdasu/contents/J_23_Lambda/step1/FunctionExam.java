package com.aisamdasu.contents.J_23_Lambda.step1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExam {
    private static List<Student> list = Arrays.asList(
            new Student(95,80,"홍길동"),
            new Student(90,70,"이순신")
    );
    public static void printString(Function<Student,String> function){
        for(Student student : list){
            System.out.print(function.apply(student) + " ");
        }
        System.out.println();
    }

    public static void printList(ToIntFunction<Student> function){
        for(Student student : list){
            System.out.print(function.applyAsInt(student));
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function){
        for(Student student : list){
            System.out.print(function.applyAsInt(student) + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("[학생 이름]");
        System.out.println("====================");
        //printString(Student::getName);
        printString(s->s.getName());

        Function<Student, String> function = new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        };
        //printString(s->s.getName()); 아래와 같은 코드(위에 Function으로 만들고 Override로 사용)
        printString(function);

        // ========================================================================

        System.out.println();

        System.out.println("[영어 점수]");
        System.out.println("====================");
        //printInt(s -> s.getEnglishScore());
        printInt(Student::getEnglishScore);
    }

}
