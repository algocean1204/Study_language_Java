package com.aisamdasu.contents.J_25_Stream.step2;

import java.util.List;

public class PipeExam {
    public static void main(String[] args) {
        List<Member> members = List.of(
                new Member("홍길동","male", 90),
                new Member("김철수","male",90),
                new Member("박문수","male",80)
        );
        double avg = members.stream()
                .mapToInt(Member::getPoint)
                .average()
                .getAsDouble();
        System.out.println("평균: " + avg);
    }
}
