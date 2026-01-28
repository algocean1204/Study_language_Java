package com.aisamdasu.contents.J_23_Lambda.step3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class PredicateExam {
    private static List<Member> memberList = Arrays.asList(
            new Member("동길홍", "male", 90),
            new Member("영희김", "female",90),
            new Member("박철죽", "male", 20),
            new Member("이숙희", "female",92)
    );
    public static int getSum(Predicate<Member> predicate) {
        int sum = 0;
        for (Member member : memberList) {
            if (predicate.test(member)) {
                sum += member.getPoint();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int maleTotal = getSum(memberList -> Objects.equals(memberList.getGender(), "male"));
        System.out.println( "남자 총 점수:" + maleTotal);

        int femaleTotal = getSum(m -> m.getGender().equals("female"));
        System.out.println("여자 총 점수: " + femaleTotal);
    }
}
