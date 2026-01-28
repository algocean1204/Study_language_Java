package com.aisamdasu.contents.J_25_Stream.step4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class StudentExam {
    public static void main(String[] args) {

        // sorted ->  정렬되어 나옴
        IntStream intStream = Arrays.stream(new int[]{1, 3,4,2,6, 7, 8, 9, 10});
        intStream.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();

        List<Student> students = List.of(
                new Student("길동 홍",90),
                new Student("길준 홍",20),
                new Student("시동 김",50)
        );
        students.stream()
                .sorted()
                .forEach(n -> System.out.print(n.getName() + ": " + n.getScore() + "  "));
        System.out.println("------------------------------");
        students.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n.getName() + ": " + n.getScore() + "  "));
    }
}
