package com.aisamdasu.contents.J_24_Collection.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ListExam03 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("서울","대전","대구","부산");
        for(String city : cities){
            System.out.println(city);
        }
        //cities.add("광저우"); // 실행시 오류 -> Arrays.asList -> 정적 리스트 -> 추가 불가능

        List<String> colors = List.of("Red","Green","Blue");
        for(String color : colors){
            System.out.println(color);
        }
        // 이것도 데이터 추가 불가 -> 정적 리스트
    }

}
