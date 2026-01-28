package com.aisamdasu.contents.J_25_Stream.step1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {
        String[] singers = {"아이유","로제","카리나"};
        Stream<String> singerStream = Arrays.stream(singers);
        singerStream.forEach(s-> System.out.println(s));

        System.out.println();
        IntStream stream = IntStream.rangeClosed(1,100);
        int sum = stream.sum();
        System.out.println("총합 : " + sum);
    }
}
