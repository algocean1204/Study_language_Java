package com.aisamdasu.contents.J_25_Stream.step1;

import java.util.List;
import java.util.stream.Stream;

public class ListStream {
    public static void main(String[] args) {
        List<String> cities = List.of("서울","대전","부산");
        for(String city : cities){
            System.out.println(city);
        }

        Stream<String> stream = cities.stream();
        // forEach()의 파라미터로 consumer 인터페이스의 구현객체를 줘야함
        stream.forEach(city -> System.out.println(city));
    }
}
