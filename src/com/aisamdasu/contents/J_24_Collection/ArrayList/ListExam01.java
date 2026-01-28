package com.aisamdasu.contents.J_24_Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListExam01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("C#");

        int size = list.size();
        System.out.println("총 데이터 : " + size);
        System.out.println();

        // get -> index로 사용
        String item = list.get(0);
        System.out.println("인덱스 2: " + item);
        System.out.println();

        // 제거
        for(String s:list){
            list.remove(2);
            list.remove(2);
            list.remove("C++");
        }
    }
}
