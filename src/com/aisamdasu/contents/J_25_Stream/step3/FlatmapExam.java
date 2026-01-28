package com.aisamdasu.contents.J_25_Stream.step3;

import java.util.Arrays;
import java.util.List;

public class FlatmapExam {
    public static void main(String[] args) {
        List<String> list1 = List.of("I am Tom", "You are Jane");
        list1.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(word -> System.out.println(word));

        List<String> list2 = List.of("1,2,3","4,5,6");
        list2.stream()
                .flatMap(data ->{
                    String[] strArr = data.split(",");
                    int[] inArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        inArr[i] = Integer.parseInt(strArr[i].trim());
                    }
                    return Arrays.stream(inArr).boxed();
                })
                .forEach(System.out::println);
    }
}
