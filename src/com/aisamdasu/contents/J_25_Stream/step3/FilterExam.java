package com.aisamdasu.contents.J_25_Stream.step3;

import java.util.ArrayList;
import java.util.List;

public class FilterExam {
    public static void main(String[] args) {
        List<String> names = List.of("아이유","카리나","지드래곤","지코","잔나비","지드래곤");

        // distinct -> 중복된 항목만 제거함
        names.stream().distinct().forEach(n -> System.out.println(n));
        System.out.println();

        // filter -> 파라미터로 Predicate 가 필요함
        // "지"로 시작하는것 출력 -> filter -> startsWith("지")
        names.stream().filter(n -> n.startsWith("지")).forEach(System.out::println);

        // distinct + filter
        // 중복없이 "지"로 시작하는 요소만 추출
        names.stream().
                distinct()
                .filter(n -> n.startsWith("지"))
                .forEach(System.out::println);


    }
}
