package com.aisamdasu.contents.J_25_Stream.step3;

import com.aisamdasu.contents.J_25_Stream.step1.Member;

import java.util.List;

public class MapExam {
    public static void main(String[] args) {
        List<Member> members = List.of(
                new Member("홍길동","male", 90),
                new Member("김철수","male",100),
                new Member("김혹기","male",20)
        );
        members.stream()
                .mapToInt(Member::getPoint)
                .forEach(System.out::println);


    }
}
